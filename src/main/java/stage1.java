public class stage1 {
    public static void main(String[] args) {

        int EmployeeID = 1001;
        String EmployeeName = ("Reham Hesham");
        String Department = ("IT");
        double BasicSalary = 5000;
        double Bonus = 2500;
        boolean Married = false;
        //----------------------------------
            // gross salary
            int x = 5000;
            int y = 2500;
            int z = x + y;

           //tax percentage
            double p = .20;
            double t = z * p;


            //net salary
           double n = z - t;

       //-----------------------------------------
        System.out.println("EmployeeID: " + EmployeeID);
        System.out.println("EmployeeName: " + EmployeeName);
        System.out.println("Department: " +Department );
        System.out.println("BasicSalary: " + BasicSalary);
        System.out.println("Bonus: "+ Bonus);
        System.out.println("Married: " + Married );
        System.out.println("Gross Salary = " +z);
        System.out.println("Tax Amont = " +t);
        System.out.println("Net Salary = " +n);
    }

}


