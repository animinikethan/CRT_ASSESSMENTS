package CRT;

import java.util.Scanner;

public class ThreeDimensionArray {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int age[][][] = new int[2][3][5];

        // Taking input
        for (int i = 0; i < age.length; i++) {
            for (int j = 0; j < age[i].length; j++) {
                for (int k = 0; k < age[i][j].length; k++) {
                    System.out.println("Enter the age of student " + (k + 1)
                            + " classroom " + (j + 1)
                            + " branch " + (i + 1));
                    age[i][j][k] = s.nextInt();
                }
            }
        }

        // Printing output
        System.out.println("\n....... Ages are .......");
        for (int i = 0; i < age.length; i++) {
            for (int j = 0; j < age[i].length; j++) {
                for (int k = 0; k < age[i][j].length; k++) {
                    System.out.println("Branch " + (i + 1)
                            + ", Classroom " + (j + 1)
                            + ", Student " + (k + 1)
                            + " Age: " + age[i][j][k]);
                }
            }
        }

        s.close();
    }
}

