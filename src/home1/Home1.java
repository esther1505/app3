package home1;

import java.util.Scanner;

public class Home1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r, c, n;
        System.out.print("Enter The Pattern Length : ");
        n = in.nextInt();
        for (r = 1; r <= n; r++) {
            for (c = 1; c <= n; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
