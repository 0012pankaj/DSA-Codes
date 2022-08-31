public class Find2oddoccuring {
    static int arry[] = { 3, 4, 3, 4, 5, 4, 4, 6, 7, 7 };

    // in this quection we find that 2 values which occur odd no of times.
    static void give2oddoccur(int arry[]) {
        int res = 0, res1 = 0, res2 = 0;
        for (int i = 0; i < arry.length; i++) {
            res = res ^ arry[i]; 
        }

        int lastbiton = res & ~(res - 1); // ----->000...001     // 3-->00011  ^ (3-1)-->00010  =000001  =1

        for (int i = 0; i < arry.length; i++) {
            if ((arry[i] & lastbiton) == 0) {
                res1 = res1 ^ arry[i];// group have last bit off
            } else {
                res2 = res2 ^ arry[i];//grouphave last bit on
            }
        }
        System.out.println(res1 + "," + res2);//5,6
    }

    public static void main(String[] args) {

        give2oddoccur(arry);
    }
}
