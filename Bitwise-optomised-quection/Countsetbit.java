public class Countsetbit {                    /*there are three methods to find no. of set(on) bits 
                                                      1. normal by modulas  [O(no of bit)--.TC]
                                                      2.Brain kerningam algo...  [ O(no of bit)--.TC]
                                                      3.Lookuptable..    [o(1) -->TC]            */
    // count no. of bit on
    static int givbNofbit1(int num) {
        int count = 0;
        while (num > 0) {
            if (num % 2 != 0) {
                count++;
            }
            num = num / 2;
        }
        return count;
    }
  //BRAIN KERNINGUM ALGORITHUM
    static int givbNofbit2(int num) {
        int count = 0;
        while (num > 0) {
            num = (num & (num - 1));  // work on removing last on bit one by one
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int num = 5;

        System.out.println(givbNofbit1(num)); // 2
        System.out.println(givbNofbit2(num)); //2

    }
}
// TC-->theta(no. of bit)
