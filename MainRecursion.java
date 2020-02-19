package Inter;

import java.util.Scanner;

public class MainRecursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();

                System.out.println(fac(num));
    }
    private static int fac(int n){
        if (n==1)
        return 1;
        return n * fac(n-1);

    }
}
