import java.util.Scanner;

public class stage8 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        showMenu();
    }


    public static void showMenu() {
        while (true) {
            System.out.println("=========== MENU ===========");
            System.out.println("1 - Add Employee");
            System.out.println("2 - Exit");
            System.out.print("Choose: ");
            int choice = input.nextInt();

            if (choice == 1) {
                readEmployeeData();
            } else if (choice == 2) {
                exitProgram();
                break;
            } else {
                System.out.println("Invalid Choice");
            }
        }
    }


    public static void readEmployeeData() {
        System.out.print("Enter Employee ID: ");
        int empID = input.nextInt();
        input.nextLine();

        System.out.print("Enter Employee Name: ");
        String empName = input.nextLine();

        System.out.print("Enter Department Code: ");
        int departmentCode = input.nextInt();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = input.nextDouble();

        System.out.print("Enter Bonus: ");
        double bonus = input.nextDouble();

        System.out.print("Enter Tax Percentage: ");
        double taxRate = input.nextDouble() / 100.0;

        System.out.print("Married (true/false): ");
        boolean married = input.nextBoolean();

        double grossSalary = calculateGrossSalary(basicSalary, bonus);
        double taxAmount = calculateTax(grossSalary, taxRate);
        double netSalary = calculateNetSalary(grossSalary, taxAmount);

        printEmployee(empID, empName, departmentCode, basicSalary, bonus, grossSalary, taxAmount, netSalary, married);
    }


    public static double calculateGrossSalary(double basicSalary, double bonus) {
        return basicSalary + bonus;
    }


    public static double calculateTax(double grossSalary, double taxRate) {
        return grossSalary * taxRate;
    }

    public static double calculateNetSalary(double grossSalary, double taxAmount) {
        return grossSalary - taxAmount;
    }

    public static String getDepartmentName(int departmentCode) {
        switch (departmentCode) {
            case 1: return "IT";
            case 2: return "HR";
            case 3: return "Finance";
            case 4: return "Sales";
            case 5: return "Marketing";
            default: return "Unknown Department";
        }
    }


    public static void printEmployee(int empID, String empName, int departmentCode,
                                     double basicSalary, double bonus, double grossSalary,
                                     double taxAmount, double netSalary, boolean married) {
        System.out.println("=========== Employee Report ===========");
        System.out.println("Employee ID: " + empID);
        System.out.println("Employee Name: " + empName);
        System.out.println("Department: " + getDepartmentName(departmentCode));
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Tax Amount: " + taxAmount);
        System.out.println("Net Salary: " + netSalary);
        System.out.println("Married: " + married);


        if (netSalary >= 30000) {
            System.out.println("Income Level: High Income");
        } else if (netSalary >= 15000) {
            System.out.println("Income Level: Medium Income");
        } else {
            System.out.println("Income Level: Low Income");
        }


        if (married) {
            System.out.println("Family Insurance: Eligible");
        } else {
            System.out.println("Family Insurance: Not Eligible");
        }
        System.out.println("-----------------------------------");
    }


    public static void exitProgram() {
        System.out.println("Program Ended.");
    }
}
