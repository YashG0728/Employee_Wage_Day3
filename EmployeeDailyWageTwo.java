public class EmployeeDailyWageTwo {
    public static void main(String[] args) {

        //CONSTANTS
        int IS_PRESENT = 1;
        int employeeHours = 8;
        int wage_Per_Hr = 20;
        double empCheck = Math.floor(Math.random() * 10) % 2;

        if (empCheck == IS_PRESENT) {
            System.out.println("Employee is present");
            int empWage = employeeHours * wage_Per_Hr;
            System.out.println("Employee wage : "+empWage);
        } else {
            System.out.println("Employee is absent");
        }

    }

}


