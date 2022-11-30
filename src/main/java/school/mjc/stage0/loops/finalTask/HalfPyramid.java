package school.mjc.stage0.loops.finalTask;

import java.util.Scanner;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) { //4-misol
        int i = 1, j, k;
            while (i <= cathetusLength) {
                k = cathetusLength;
                while (k > i) {
                    System.out.print(" ");
                    k--;
                }
                j = 1;
                while (j <= i) {
                    System.out.print("*");
                    j++;
                }
                i++;
                System.out.println();
            }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(5);
    }
}
