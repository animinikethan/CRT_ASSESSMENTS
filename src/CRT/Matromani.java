package CRT;

import java.util.Scanner;

class MantriMani {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the gender: ");
        String gender = s.next();

        System.out.print("Enter the age: ");
        int age = s.nextInt();

        if (gender.equalsIgnoreCase("male")) {
            System.out.println(age >= 21 ? "Eligible" : "Not eligible");
        } 
        else if (gender.equalsIgnoreCase("female")) {
            System.out.println(age >= 18 ? "Eligible" : "Not eligible");
        } 
        else {
            System.out.println("Invalid gender");
        }

        s.close();
    }
}
