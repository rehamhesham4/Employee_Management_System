import java.util.Scanner;

public class stage7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = input.nextInt();


        int[] empID = new int[n];
        String[] empName = new String[n];
        String[] department = new String[n];
        double[] basicSalary = new double[n];
        double[] bonus = new double[n];
        double[] grossSalary = new double[n];
        double[] tax = new double[n];
        double[] netSalary = new double[n];
        boolean[] married = new boolean[n];


        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i+1));

            System.out.print("ID: ");
            empID[i] = input.nextInt();
            input.nextLine();

            System.out.print("Name: ");
            empName[i] = input.nextLine();

            System.out.print("Department: ");
            department[i] = input.nextLine();

            System.out.print("Basic Salary: ");
            basicSalary[i] = input.nextDouble();

            System.out.print("Bonus: ");
            bonus[i] = input.nextDouble();

            grossSalary[i] = basicSalary[i] + bonus[i];
            tax[i] = grossSalary[i] * 0.1; // 10% tax
            netSalary[i] = grossSalary[i] - tax[i];

            System.out.print("Married (true/false): ");
            married[i] = input.nextBoolean();
        }


        System.out.println("\n=========== Employee Report ===========");
        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i+1));
            System.out.println("ID: " + empID[i]);
            System.out.println("Name: " + empName[i]);
            System.out.println("Department: " + department[i]);
            System.out.println("Gross Salary: " + grossSalary[i]);
            System.out.println("Tax: " + tax[i]);
            System.out.println("Net Salary: " + netSalary[i]);
            System.out.println("Married: " + married[i]);
            System.out.println("-----------------------------------");
        }
    }
}
