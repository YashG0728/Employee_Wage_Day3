public class EmployeeFullPartTimeThird {
    public static void main(String[] args) {
        //CONSTANTS
        int IS_FullTime = 1;
        int IS_PartTime = 2;
        int wage_Per_Hr = 20;
        int Emp_Hours;
        int empWage;
        double empCheck = Math.floor(Math.random() * 10) % 3;

        if (empCheck == IS_FullTime) {
            System.out.println("Employee is present");
            Emp_Hours = 8;
        }
        else if(empCheck == IS_PartTime) {
            Emp_Hours = 4;
            System.out.println("Employee is PartTime");
        }
        else {
            Emp_Hours = 0;
            System.out.println("Employee Is Absent");
        }
        empWage = Emp_Hours * wage_Per_Hr;
        System.out.println("Employee Wage is: "+empWage);
    }
}
