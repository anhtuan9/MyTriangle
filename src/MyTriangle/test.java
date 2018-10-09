package MyTriangle;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhập cạnh");
        double s1 = input.nextInt();
        System.out.println("nhập cạnh");
        double s2 = input.nextInt();
        System.out.println("nhập cạnh");
        double s3 = input.nextInt();
        if (MyTriangle.isValid(s1, s2, s3)) {
            System.out.println("diện tích: ");
            System.out.println(MyTriangle.area(s1, s2, s3));
        }else {
            System.out.println("không phải 3 cạnh tam giác");
        }
    }
}
