package CRT;

import java.util.Scanner;

//Abstract class
abstract class Vaccine {

 int age;
 String nationality;
 boolean firstDoseTaken = false;

 // Constructor
 Vaccine(int age, String nationality) {
     this.age = age;
     this.nationality = nationality;
 }

 // Concrete method - First Dose
 void firstDose() {
     if (nationality.equalsIgnoreCase("Indian") && age >= 18) {
         System.out.println("First dose successfully administered.");
         System.out.println("Please pay Rs.250");
         firstDoseTaken = true;
     } else {
         System.out.println("You are not eligible for the first dose.");
     }
 }

 // Concrete method - Second Dose
 void secondDose() {
     if (firstDoseTaken) {
         System.out.println("Second dose successfully administered.");
     } else {
         System.out.println("You must take the first dose before taking the second dose.");
     }
 }

 // Abstract method
 abstract void boosterDose();
}

//Child class
class VaccinationSuccessful extends Vaccine {

 VaccinationSuccessful(int age, String nationality) {
     super(age, nationality);
 }

 // Implementing abstract method
 void boosterDose() {
     if (firstDoseTaken) {
         System.out.println("Booster dose successfully administered.");
     } else {
         System.out.println("Booster dose can be taken only after vaccination.");
     }
 }
}

//Main class
public class Vaccination {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     System.out.print("Enter Nationality: ");
     String nationality = sc.nextLine();

     System.out.print("Enter Age: ");
     int age = sc.nextInt();

     Vaccine v = new VaccinationSuccessful(age, nationality);

     v.firstDose();
     v.secondDose();
     v.boosterDose();

     sc.close();
 }
}

