package math.benchmarks;

import gui.JInfoFrame;
import utils.SystemUtils;

/*
 * (C) Copyright IBM Corp. 2001
 */
//$Id: MatMul.java,v 1.1.1.1 2007/01/21 16:43:20 lyon Exp $

/**
 * @author unascribed
 */
public class MatMul {

    // problem size
    static int m = 64;
    static int n = 64;
    static int p = 64;
    static int NSTEP = 100;

    static double[][] A = new double[m][n];
    static double[][] B = new double[n][p];
    static double[][] C = new double[m][p];

    // timer
    static double timer() {

        return System.currentTimeMillis() / 1000.0;
    }

    // initialize
    static void initialize() {

        int i;
        int j;

        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                A[i][j] = 1.0;
            }
        }

        for (i = 0; i < n; i++) {
            for (j = 0; j < p; j++) {
                B[i][j] = 1.0;
            }
        }

        for (i = 0; i < m; i++) {
            for (j = 0; j < p; j++) {
                C[i][j] = 0.0;
            }
        }
    }

    // matrix multiply
    static void multipl() {

        int i;
        int j;
        int k;

        for (i = 0; i < m; i++) {
            for (j = 0; j < p; j++) {
                for (k = 0; k < n; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
    }

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("matrix multiply:" +
                "\n  problem size = " +
                m +
                " x " +
                n +
                " x " +
                p +
                "\n with " + NSTEP + " repetitions");

        // initialize matrices A, B, C.
        initialize();

        // perform the multiplies.
        double etime = timer();
        for (int step = 0; step < NSTEP; step++) {
            multipl();
        }
        etime = timer() - etime;

        // compute performance
        double flops = 2 * m * n * p * NSTEP;
        double floprt = 0.0;
        if (etime > 0.0) floprt = 1.0e-06 * flops / etime;
        sb.append("  elapsed time    = " +
                etime +
                "\n  MFLOPS          = " + floprt);

        // compute the error
        double err = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                double delta = C[i][j] - (n * NSTEP);
                err += delta * delta;
            }
        }
        sb.append("  error          = " + err);
        JInfoFrame jif = new JInfoFrame();
        jif.println(SystemUtils.getProps());
        jif.println(sb.toString());
        jif.setSize(300, 300);
        jif.setVisible(true);
    }
}




