import java.util.Scanner;

public class stage6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How Many Employee?");
        int employees = input.nextInt();

        for(int i= 0; i< employees;i++){

            System.out.print("Enter Your ID: ");
            int id = input.nextInt();
            input.nextLine();

            System.out.print("Enter Your Name: ");
            String name = input.nextLine();

            System.out.print("Enter Your Department Code: ");
            int department = input.nextInt();

            System.out.print("Enter Your Basic Salary: ");
            double basicSalary = input.nextDouble();

            System.out.print("Enter Your Bonus: ");
            double bonus = input.nextDouble();

            System.out.print("Enter Your Tax percentage: ");
            double taxPercentage = input.nextDouble();

            System.out.println("Are You Married? Answer With True Or False");
            boolean married = input.nextBoolean();


        }
    }
}