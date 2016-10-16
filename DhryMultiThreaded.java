package math.benchmarks;

import gui.JInfoFrame;
import utils.SystemUtils;

import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

public class DhryMultiThreaded implements Runnable{
    private  final int Ident_1 = 0;
    private  final int Ident_2 = 1;
    private  final int Ident_3 = 2;
    private  final int Ident_4 = 3;
    private  final int Ident_5 = 4;
    private  Record recordGlob;
    private  int intGlob;
    private  boolean blooleanGlob;
    private  char charGlob1;
    private  char charGlob2;
    private boolean running = true;
    private  int[] arrayGlob1 = new int[128];
    private  int[][] arrayGlob2 = new int[128][128];
    private  Record record1 = new Record(),
            record2 = new Record();
    private  long numberOfRuns = 100000000;
    private  int[] intLoc3Ref = new int[1];
    private  int[] intLoc1Ref = new int[1];
    private  int[] enumLoc = new int[1];
    private  long totalTime;

    public  void run() {
        Record nextRecordGlob = record2;

        recordGlob = record1;
        recordGlob.nextRecord = nextRecordGlob;
        recordGlob.Discr = Ident_1;
        recordGlob.Enum_Comp = Ident_3;
        recordGlob.Int_Comp = 40;
        recordGlob.String_Comp = "DHRYSTONE PROGRAM, SOME STRING";
        String stringLoc1 = "DHRYSTONE PROGRAM, 1'ST STRING";
        long beginTime = System.currentTimeMillis();
        int i;
        for (i = 1; i <= numberOfRuns; i++) {

            charGlob1 = 'A';
            blooleanGlob = false;
            boolean Bool_Loc;
            Bool_Loc = charGlob1 == 'A';
            Bool_Loc = Bool_Loc || blooleanGlob;
            charGlob2 = 'B';
            int intLoc1 = 2;
            int intLoc2 = 3;
            String stringLoc2 = "DHRYSTONE PROGRAM, 2'ND STRING";
            enumLoc[0] = Ident_2;
            boolean result1;
            int Int_Loc3;
            char Char_Loc = '\0';
            Int_Loc3 = 2;
            while (Int_Loc3 <= 2) {
                int result11;
                char Char_Loc_11,
                        Char_Loc_21;
                Char_Loc_11 = stringLoc1.charAt(Int_Loc3);
                Char_Loc_21 = Char_Loc_11;
                if (Char_Loc_21 != stringLoc2.charAt(Int_Loc3 + 1))
                    result11 = Ident_1;
                else
                    result11 = Ident_2;
                if (result11 ==
                        Ident_1) {
                    Char_Loc = 'A';
                    Int_Loc3 += 1;
                }
            }
            if (Char_Loc >= 'W' && Char_Loc < 'Z')
                Int_Loc3 = 7;
            if (Char_Loc == 'X')
                result1 = true;
            else {
                if (stringLoc1.compareTo(stringLoc2) > 0) {
                    Int_Loc3 += 7;
                    result1 = true;
                } else
                    result1 = false;
            }
            blooleanGlob = !result1;
            while (intLoc1 < intLoc2) {
                intLoc3Ref[0] = 5 * intLoc1 - intLoc2;
                int Int_Loc;
                Int_Loc = intLoc1 + 2;
                intLoc3Ref[0] = intLoc2 + Int_Loc;
                intLoc1 += 1;
            }
            int intLoc3 = intLoc3Ref[0];
            int Int_Index,
                    Int_Loc;
            Int_Loc = intLoc1 + 5;
            arrayGlob1[Int_Loc] = intLoc3;
            arrayGlob1[Int_Loc + 1] = arrayGlob1[Int_Loc];
            arrayGlob1[Int_Loc + 30] = Int_Loc;
            for (Int_Index = Int_Loc; Int_Index <= Int_Loc + 1; ++Int_Index)
                arrayGlob2[Int_Loc][Int_Index] = Int_Loc;
            arrayGlob2[Int_Loc][Int_Loc - 1] += 1;
            arrayGlob2[Int_Loc + 20][Int_Loc] = arrayGlob1[Int_Loc];
            intGlob = 5;
            Record pointer_Par_Val = recordGlob;
            Record Next_Record = pointer_Par_Val.nextRecord;
            pointer_Par_Val.nextRecord = recordGlob;
            pointer_Par_Val.Int_Comp = 5;
            Next_Record.Int_Comp = pointer_Par_Val.Int_Comp;
            Next_Record.nextRecord = pointer_Par_Val.nextRecord;
            Record pointer_Par_Ref = Next_Record.nextRecord;
            if (recordGlob != null)
                pointer_Par_Ref = recordGlob.nextRecord;
            else
                intGlob = 100;
            int[] Int_Comp_Ref = new int[1];
            Int_Comp_Ref[0] = recordGlob.Int_Comp;
            int Int_Loc2;
            Int_Loc2 = 10 + 2;
            Int_Comp_Ref[0] = intGlob + Int_Loc2;
            recordGlob.Int_Comp = Int_Comp_Ref[0];
            int[] Int_Ref = new int[1];
            if (Next_Record.Discr == Ident_1) {
                Next_Record.Int_Comp = 6;
                Int_Ref[0] = Next_Record.Enum_Comp;
                Int_Ref[0] = pointer_Par_Val.Enum_Comp;
                boolean result;
                int Enum_Loc;
                Enum_Loc = pointer_Par_Val.Enum_Comp;
                if (Enum_Loc == Ident_3)
                    result = true;
                else
                    result = false;
                if (!result)
                    Int_Ref[0] = Ident_4;
                switch (pointer_Par_Val.Enum_Comp) {
                    case Ident_1:
                        Int_Ref[0] = Ident_1;
                        break;
                    case Ident_2:
                        if (intGlob > 100)
                            Int_Ref[0] = Ident_1;
                        else
                            Int_Ref[0] = Ident_4;
                        break;
                    case Ident_3:
                        Int_Ref[0] = Ident_2;
                        break;
                    case Ident_4:
                        break;
                    case Ident_5:
                        Int_Ref[0] = Ident_3;
                        break;
                }
                Next_Record.Enum_Comp = Int_Ref[0];
                Next_Record.nextRecord = recordGlob.nextRecord;
                Int_Ref[0] = Next_Record.Int_Comp;
                int Int_Loc1;
                Int_Loc1 = Next_Record.Int_Comp + 2;
                Int_Ref[0] = 10 + Int_Loc1;
                Next_Record.Int_Comp = Int_Ref[0];
            } else
                pointer_Par_Val = pointer_Par_Val.nextRecord;
            char charIndex;
            for (charIndex = 'A'; charIndex <= charGlob2; ++charIndex) {
                int result;
                char Char_Loc_1,
                        Char_Loc_2;
                Char_Loc_1 = charIndex;
                Char_Loc_2 = Char_Loc_1;
                if (Char_Loc_2 != 'C')
                    result = Ident_1;
                else
                    result = Ident_2;
                if (enumLoc[0] == result) {
                    enumLoc[0] = Ident_1;
                    boolean result2;
                    int Enum_Loc;
                    Enum_Loc = Ident_1;
                    if (Enum_Loc == Ident_3)
                        result2 = true;
                    else
                        result2 = false;
                    if (!result2)
                        enumLoc[0] = Ident_4;
                    switch (Ident_1) {
                        case Ident_1:
                            enumLoc[0] = Ident_1;
                            break;
                        case Ident_2:
                            if (intGlob > 100)
                                enumLoc[0] = Ident_1;
                            else
                                enumLoc[0] = Ident_4;
                            break;
                        case Ident_3:
                            enumLoc[0] = Ident_2;
                            break;
                        case Ident_4:
                            break;
                        case Ident_5:
                            enumLoc[0] = Ident_3;
                            break;
                    }
                }
            }
            intLoc3 = intLoc2 * intLoc1;
            intLoc2 = intLoc3 / intLoc1;
            intLoc2 = 7 * (intLoc3 - intLoc2) - intLoc1;
            intLoc1Ref[0] = intLoc1;
            int Int_Loc1;
            int Enum_Loc;
            Int_Loc1 = intLoc1Ref[0] + 10;
            Enum_Loc = 0;
            do
                if (charGlob1 == 'A') {
                    Int_Loc1 -= 1;
                    intLoc1Ref[0] = Int_Loc1 - intGlob;
                    Enum_Loc = Ident_1;
                }
            while (Enum_Loc != Ident_1);
            intLoc1 = intLoc1Ref[0];
        }
        long endTime = System.currentTimeMillis();
        totalTime = endTime - beginTime;
        running=false;
    }
    public boolean isRunning(){
        return running;
    }
    public static void main(String args[]) throws URISyntaxException, InterruptedException {
        final int n = 4;
        DhryMultiThreaded dt[] = new DhryMultiThreaded[n];
        long startTime = 0;
        Thread jobs[] = new Thread[dt.length];
        for (int i=0; i < dt.length; i++){
            dt[i]=new DhryMultiThreaded();
            jobs[i]=new Thread(dt[i]);
        }
        startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i=i+2) {

            jobs[i].start();
            jobs[i+1].start();
        }
        while(dt[n-1].isRunning()){
            Thread.sleep(100);
        }
        long numberOfRuns = dt[0].getNumberOfRuns()*dt.length;
        long t = System.currentTimeMillis() - startTime;
        StringBuffer sb = new StringBuffer("800 mhz g4,878k ds/sec");
        sb.append("\ntotal time: " + t + "ms");
        sb.append("\nResult: " +
                numberOfRuns * 1000 / t
                + " dhrystone/sec.");

        JInfoFrame jif = new JInfoFrame();
        jif.println(SystemUtils.getProps());
        jif.println(sb.toString());
        jif.setSize(300, 300);
        jif.setVisible(true);
    }

    private static void getProxyInfo(StringBuffer sb, URI uri) {
        ProxySelector selector = ProxySelector.getDefault();
        List<Proxy> list;
        for (Proxy p : list = selector.select(uri)) {
            sb.append("\n"+
                    p.type() + ": " + p + ": " +
                    p.getClass() + ", address: " + p.address());
        }
    }

    /**
     * @return the time for execution in ms
     */
    public static int getNumberOfDhrystonesPerSecond() {

        DhryMultiThreaded d = new DhryMultiThreaded();
        d.run();
        return (int) (d.numberOfRuns * 1000 / d.totalTime);
    }

    public long getNumberOfRuns() {
        return numberOfRuns;
    }

    public void setNumberOfRuns(long numberOfRuns) {
        this.numberOfRuns = numberOfRuns;
    }
}
