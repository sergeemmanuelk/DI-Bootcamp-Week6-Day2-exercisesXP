import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your grade (0-100) please: ");
        int grade = sc.nextInt();
        sc.close();

        if (grade >= 93 && grade <= 100) {
            System.out.println("Your letter grade is A");
        } else if (grade >= 90 && grade <= 92) {
            System.out.println("Your letter grade is A-");
        } else if (grade >= 87 && grade <= 89) {
            System.out.println("Your letter grade is B+");
        } else if (grade >= 83 && grade <= 86) {
            System.out.println("Your letter grade is B");
        } else if (grade >= 80 && grade <= 82) {
            System.out.println("Your letter grade is B-");
        } else if (grade >= 77 && grade <= 79) {
            System.out.println("Your letter grade is C+");
        } else if (grade >= 70 && grade <= 76) {
            System.out.println("Your letter grade is C");
        } else if (grade >= 60 && grade <= 69) {
            System.out.println("Your letter grade is D");
        } else if (grade >= 0 && grade <= 59) {
            System.out.println("Your letter grade is F");
        } else {
            System.out.println("Invalid grade.");
        }
    }
}