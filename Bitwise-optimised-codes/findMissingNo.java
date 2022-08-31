public class findMissingNo {
    static int arry[] = { 1, 4, 3, 5 };

    // in this program we find the missing one number from thegiven seriss of number
    static int findmising(int arry[], int len) {
        int res1 = 0, res2 = 0, res = 0;
        for (int i = 1; i <= len + 1; i++) {
            res1 = (res1 ^ i);
        }
        for (int i = 0; i < len; i++) {
            res2 = (arry[i] ^ res2);
        }

        return res1 ^ res2;
    }

    public static void main(String[] args) {

        int len = arry.length;
        System.out.println(findmising(arry, len)); //2   {1,2,3,4,5}
    }
}
