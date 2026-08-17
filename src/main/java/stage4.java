import java.util.Scanner;
public class stage4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Employee ID: " );
        int id = input.nextInt();
        input.nextLine();

        System.out.println("Employee Name: ");
        String name = input.nextLine();

        System.out.println("Department Code: ");
        int code = input.nextInt();
        input.nextLine();

        System.out.println("Basic Salary: ");
        double basicSalary = input.nextDouble();

        System.out.println("Bonus: ");
        double bonus = input.nextDouble();

        System.out.println("Tax percentage: ");
        double taxPercentage = input.nextDouble();

        System.out.println("Are You Married? Answer With True Or False");
        boolean married = input.nextBoolean();

//------------------------------------------------------------------------------------
        double grossSalary= basicSalary + bonus;
        double taxAmount= grossSalary * taxPercentage;
        double netSalary= grossSalary - taxAmount;

//---------------------------------------------------------------------------------

        System.out.println("Employee ID: "+ id );
        System.out.println("Employee Name: "+ name);
        System.out.println("Department Code: "+ code);
        System.out.println("Basic Salary: "+ basicSalary);
        System.out.println("Bonus: "+ bonus);
        System.out.println("Tax Percentage: "+ taxPercentage);
        System.out.println("Married: "+ married);
        System.out.println("Gross Salary: "+ grossSalary);
        System.out.println("Tax Amount: "+ taxAmount);
        System.out.println("Net Salary: "+ netSalary);


    }
}
