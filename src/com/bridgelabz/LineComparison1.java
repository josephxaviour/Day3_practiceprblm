package com.bridgelabz;

import java.util.Scanner;

public class LineComparison1 { public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("enter the starting point of the 1st line");
    int x1 = scan.nextInt();
    int y1 = scan.nextInt();
    System.out.println("enter the ending point of the 1st line");

    int x2 = scan.nextInt();
    int y2 = scan.nextInt();

    double lineLength1 = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
    System.out.println("enter the starting point of the 2nd line");
    int x3 = scan.nextInt();
    int y3 = scan.nextInt();
    System.out.println("enter the ending point of the 2nd line");
    int x4 = scan.nextInt();
    int y4 = scan.nextInt();
    double lineLength2 = Math.sqrt(Math.pow(x4-x3, 2) + Math.pow(y4-y3, 2));

    if(lineLength2 == lineLength1) {
        System.out.println("lines are of some length");
    }else if (lineLength2> lineLength1) {
        System.out.println("second line is larger than first");
    } else {
        System.out.println("second line is smaller than first");
    }
}
}


