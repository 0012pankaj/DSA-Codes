import java.util.Scanner;

public class Pascaltriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int raw = 0;
        int star = 1;             // pascal triangle is based on the concept of binomial [nCr+1 = (n-r)*nCr / r+1]
        while (raw < n) {          // here n-->raw  r--->col(i)
            int i = 0;
            int val = 1;
            while (i < star) {
                System.out.print(val + " ");
                val = (raw - i) * val / (i + 1);
                i++;

            }
            System.out.println();
            raw++;
            star++;
        }

    }

}
// 5

// 1 
// 1 1
// 1 2 1
// 1 3 3 1
// 1 4 6 4 1 