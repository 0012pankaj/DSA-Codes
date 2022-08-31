/*there are three methods to find no. of set(on) bits 
  1. normal by modulas  [O(no of bit)--.TC]
  2.Brain kerningam algo...  [ O(no of bit)--.TC]
  3.Lookuptable..    [o(1) -->TC]            */

public class Lookuptable {
    static int table[] = new int[256];

    public static void initialize() {
        table[0] = 0;                           //.Lookuptable..method     [o(1) -->TC] 
        for (int i = 0; i < table.length; i++) {
            table[i] = (i & 1) + table[i / 2];  // file the array with no. of bit accto index
        }
    }

    static int countSetBits(int n) {
        return table[n & 0xff] + table[(n << 8) & 0xff] + table[(n << 16) & 0xff] + table[(n << 24) & 0xff];
    }                    // this line count no of bit at that array take pair of 8 bit ata atime

    public static void main(String[] args) {
        initialize();
        int n = 9;
        System.out.println(countSetBits(n));// 2

    }
}
