public class UsingSwitchCaseFour {
    public static void main(String[] args) {
        //CONSTANTS
        final int IS_FullTime = 1;
        final int IS_PartTime = 2;
        final int wage_Per_Hr = 20;
        int Emp_Hours=0;
        int empWage;

        int empCheck = (int) Math.floor(Math.random() * 10) % 3;

        switch(empCheck) {
            case IS_FullTime:
                System.out.println("Employee is present");
                Emp_Hours = 8;
            break;
            case IS_PartTime:
                System.out.println("Employee is PartTime");
                Emp_Hours = 4;
            break;
            default:
                System.out.println("Employee is absent");
        }
        empWage = Emp_Hours * wage_Per_Hr;
        System.out.println("Employee Wage is: "+empWage);
    }
}
