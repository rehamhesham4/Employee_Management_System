import java.util.Scanner;

public class stage5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choose = 0;


        while (choose != 1) {
            System.out.println("======Menu======");
            System.out.println("1- Add Employee");
            System.out.println("2- Exit");
            System.out.print("choose:");
            choose = input.nextInt();

            if (choose == 2) {
                System.out.println("Bye!");
            } else if ((choose > 2)) {
                System.out.println("Invalid Choice");
            }
        }

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
