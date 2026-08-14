public class stage1 {
    public static void main(String[] args) {

        int EmployeeID = 1001;
        String EmployeeName = ("Reham Hesham");
        String Department = ("IT");
        double BasicSalary = 15000;
        double Bonus = 3000;
        boolean Married = false;
  //----------------------------------

        // gross salary
        int x = 15000;
        int y = 3000;
        int z = x + y;

        //tax percentage
        double p = .0989;
        double t = z * p;


        //net salary
        double n = z - t;

  //-----------------------------------------
        System.out.println("EmployeeID: " + EmployeeID);
        System.out.println("EmployeeName: " + EmployeeName);
        System.out.println("Department: " + Department);
        System.out.println("BasicSalary: " + BasicSalary);
        System.out.println("Bonus: " + Bonus);
        System.out.println("Married: " + Married);
        System.out.println("Gross Salary = " + z);
        System.out.println("Tax Amount = " + t);
        System.out.println("Net Salary = " + n);


//-------------------------------------------------




    }
}


