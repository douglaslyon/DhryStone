package math.benchmarks;
// math.benchmarks.Dhry
import gui.*;
import utils.*;

import java.net.ProxySelector;
import java.net.URI;
import java.net.Proxy;
import java.net.URISyntaxException;
import java.util.List;

public class Dhry {
    private static final int Ident_1 = 0;
    private static final int Ident_2 = 1;
    private static final int Ident_3 = 2;
    private static final int Ident_4 = 3;
    private static final int Ident_5 = 4;
    private static Record recordGlob;
    private static int intGlob;
    private static boolean blooleanGlob;
    private static char charGlob1;
    private static char charGlob2;
    private static int[] arrayGlob1 = new int[128];
    private static int[][] arrayGlob2 = new int[128][128];
    private static Record record1 = new Record(),
            record2 = new Record();
    private static long Number_Of_Runs = 1000000;
    private static int[] intLoc3Ref = new int[1];
    private static int[] intLoc1Ref = new int[1];
    private static int[] enumLoc = new int[1];
    private static long totalTime;

    public static void execute() {
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
        for (i = 1; i <= Number_Of_Runs; ++i) {
            proc5();
            proc4();
            int intLoc1 = 2;
            int intLoc2 = 3;
            String stringLoc2 = "DHRYSTONE PROGRAM, 2'ND STRING";
            enumLoc[0] = Ident_2;
            blooleanGlob = !func2(stringLoc1, stringLoc2);
            while (intLoc1 < intLoc2) {
                intLoc3Ref[0] = 5 * intLoc1 - intLoc2;
                proc7(intLoc1, intLoc2, intLoc3Ref);
                intLoc1 += 1;
            }
            int intLoc3 = intLoc3Ref[0];
            proc8(arrayGlob1, arrayGlob2, intLoc1, intLoc3);
            proc1(recordGlob);
            char charIndex;
            for (charIndex = 'A'; charIndex <= charGlob2; ++charIndex) {
                if (enumLoc[0] == func1(charIndex, 'C'))
                    proc6(Ident_1, enumLoc);
            }
            intLoc3 = intLoc2 * intLoc1;
            intLoc2 = intLoc3 / intLoc1;
            intLoc2 = 7 * (intLoc3 - intLoc2) - intLoc1;
            intLoc1Ref[0] = intLoc1;
            proc2(intLoc1Ref);
            intLoc1 = intLoc1Ref[0];
        }
        long endTime = System.currentTimeMillis();
        totalTime = endTime - beginTime;
    }

    private static void proc1(Record Pointer_Par_Val) {
        Record Next_Record = Pointer_Par_Val.nextRecord;
        Pointer_Par_Val.nextRecord = recordGlob;
        Pointer_Par_Val.Int_Comp = 5;
        Next_Record.Int_Comp = Pointer_Par_Val.Int_Comp;
        Next_Record.nextRecord = Pointer_Par_Val.nextRecord;
        proc3(Next_Record.nextRecord);
        int[] Int_Ref = new int[1];
        if (Next_Record.Discr == Ident_1) {
            Next_Record.Int_Comp = 6;
            Int_Ref[0] = Next_Record.Enum_Comp;
            proc6(Pointer_Par_Val.Enum_Comp, Int_Ref);
            Next_Record.Enum_Comp = Int_Ref[0];
            Next_Record.nextRecord = recordGlob.nextRecord;
            Int_Ref[0] = Next_Record.Int_Comp;
            proc7(Next_Record.Int_Comp, 10, Int_Ref);
            Next_Record.Int_Comp = Int_Ref[0];
        } else
            Pointer_Par_Val = Pointer_Par_Val.nextRecord;
    }

    private static void proc2(int Int_Par_Ref[]) {
        int Int_Loc;
        int Enum_Loc;
        Int_Loc = Int_Par_Ref[0] + 10;
        Enum_Loc = 0;
        do
            if (charGlob1 == 'A') {
                Int_Loc -= 1;
                Int_Par_Ref[0] = Int_Loc - intGlob;
                Enum_Loc = Ident_1;
            }
        while (Enum_Loc != Ident_1);
    }

    private static void proc3(Record Pointer_Par_Ref) {
        if (recordGlob != null)
            Pointer_Par_Ref = recordGlob.nextRecord;
        else
            intGlob = 100;
        int[] Int_Comp_Ref = new int[1];
        Int_Comp_Ref[0] = recordGlob.Int_Comp;
        proc7(10, intGlob, Int_Comp_Ref);
        recordGlob.Int_Comp = Int_Comp_Ref[0];
    }

    private static void proc4() {
        boolean Bool_Loc;
        Bool_Loc = charGlob1 == 'A';
        Bool_Loc = Bool_Loc || blooleanGlob;
        charGlob2 = 'B';
    }

    private static void proc5() {
        charGlob1 = 'A';
        blooleanGlob = false;
    }

    private static void proc6(int Enum_Par_Val, int Enum_Par_Ref[]) {
        Enum_Par_Ref[0] = Enum_Par_Val;
        if (!func3(Enum_Par_Val))
            Enum_Par_Ref[0] = Ident_4;
        switch (Enum_Par_Val) {
            case Ident_1:
                Enum_Par_Ref[0] = Ident_1;
                break;
            case Ident_2:
                if (intGlob > 100)
                    Enum_Par_Ref[0] = Ident_1;
                else
                    Enum_Par_Ref[0] = Ident_4;
                break;
            case Ident_3:
                Enum_Par_Ref[0] = Ident_2;
                break;
            case Ident_4:
                break;
            case Ident_5:
                Enum_Par_Ref[0] = Ident_3;
                break;
        }
    }

    private static void proc7(int Int_Par_Val1,
                              int Int_Par_Val2,
                              int Int_Par_Ref[]) {
        int Int_Loc;
        Int_Loc = Int_Par_Val1 + 2;
        Int_Par_Ref[0] = Int_Par_Val2 + Int_Loc;
    }

    private static void proc8(int[] Array_Par_1_Ref,
                              int[][] Array_Par_2_Ref,
                              int Int_Par_Val_1,
                              int Int_Par_Val_2) {
        int Int_Index,
                Int_Loc;
        Int_Loc = Int_Par_Val_1 + 5;
        Array_Par_1_Ref[Int_Loc] = Int_Par_Val_2;
        Array_Par_1_Ref[Int_Loc + 1] = Array_Par_1_Ref[Int_Loc];
        Array_Par_1_Ref[Int_Loc + 30] = Int_Loc;
        for (Int_Index = Int_Loc; Int_Index <= Int_Loc + 1; ++Int_Index)
            Array_Par_2_Ref[Int_Loc][Int_Index] = Int_Loc;
        Array_Par_2_Ref[Int_Loc][Int_Loc - 1] += 1;
        Array_Par_2_Ref[Int_Loc + 20][Int_Loc] = Array_Par_1_Ref[Int_Loc];
        intGlob = 5;
    }

    private static int func1(char Char_Par_1_Val, char Char_Par_2_Val) {
        char Char_Loc_1,
                Char_Loc_2;
        Char_Loc_1 = Char_Par_1_Val;
        Char_Loc_2 = Char_Loc_1;
        if (Char_Loc_2 != Char_Par_2_Val)
            return Ident_1;
        else
            return Ident_2;
    }

    private static boolean func2(String String_Par_1_Ref,
                                 String String_Par_2_Ref) {
        int Int_Loc;
        char Char_Loc = '\0';
        Int_Loc = 2;
        while (Int_Loc <= 2)
            if (func1(String_Par_1_Ref.charAt(Int_Loc),
                    String_Par_2_Ref.charAt(Int_Loc + 1)) ==
                    Ident_1) {
                Char_Loc = 'A';
                Int_Loc += 1;
            }
        if (Char_Loc >= 'W' && Char_Loc < 'Z')
            Int_Loc = 7;
        if (Char_Loc == 'X')
            return true;
        else {
            if (String_Par_1_Ref.compareTo(String_Par_2_Ref) > 0) {
                Int_Loc += 7;
                return true;
            } else
                return false;
        }
    }

    private static boolean func3(int Enum_Par_Val) {
        int Enum_Loc;
        Enum_Loc = Enum_Par_Val;
        if (Enum_Loc == Ident_3)
            return true;
        else
            return false;
    }

    public static void main(String args[]) throws URISyntaxException {
        for (int i = 0; i < 10; i++)
            Dhry.execute();
        StringBuffer sb = new StringBuffer("800 mhz g4,878k ds/sec");
        sb.append("\ntotal time: " + totalTime + "ms");
        sb.append("\nResult: " +
                Number_Of_Runs * 1000 / totalTime
                + " dhrystone/sec.");
        sb.append("\nLoad average for last 15 minutes:" +
                OsUtils.get15MinuteLoad());


        getProxyInfo(sb, new URI("http://www.docjava.com"));
        getProxyInfo(sb, new URI("ftp://ftp.sec.gov"));
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
        Dhry d = new Dhry();
        d.execute();
        return (int) (d.Number_Of_Runs * 1000 / d.totalTime);
    }
}
