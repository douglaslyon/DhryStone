/*
 * Copyright (c) 2005 DocJava, Inc. All Rights Reserved.
 */
package math.benchmarks;

/**
 * Copyright DocJava, inc. User: lyon
 * <p/>
 * Date: Apr 25, 2005
 * <p/>
 * Time: 7:55:09 AM
 */
public class Results {
    private double mflops = 0.0;
    private double residn = 0.0;
    private double time = 0.0;
    private double precision = 0.0;
    public String toString(){
        return "Mflops/s: " +
                mflops +
                "  Time: " +
                time +
                " secs" +
                "  Norm Res: " +
                residn +
                "  Precision: " + precision;
    }

    public double getMflops() {
        return mflops;
    }

    void setMflops(double mflops) {
        this.mflops = mflops;
    }

    public double getResidn() {
        return residn;
    }

    void setResidn(double residn) {
        this.residn = residn;
    }

    public double getTime() {
        return time;
    }

    void setTime(double time) {
        this.time = time;
    }

    public double getPrecision() {
        return precision;
    }

    void setPrecision(double precision) {
        this.precision = precision;
    }
}
