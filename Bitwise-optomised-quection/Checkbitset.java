public class Checkbitset {                               // in this que we check Nth bit is ON or OFF
    static boolean checkBit1(int num, int bitnum) {
        if ((num & (1 << (bitnum - 1))) != 0) {           // using left shift <<
            return true;
        }
        return false;
    }

    static boolean checkBit2(int num, int bitnum) {
        if (((num >> (bitnum - 1)) & 1) != 0) {
            return true;                                   // using right shift >>
        }
        return false;
    }

    public static void main(String[] args) {
        int num = 5, bitnum = 3; // true
        System.out.println(checkBit1(num, bitnum));
        System.out.println(checkBit1(num, bitnum));
    }
}