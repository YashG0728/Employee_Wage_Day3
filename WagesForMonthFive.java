public class WagesForMonthFive {
    public static void main(String[] args) {

        final int FullTime=1;
        final int PartTime=2;
        final int wagePerHour=20;
        final int NumOfWorkingDays=20;

        int workingHrs=0;
        int empWage=0;
        int totalEmpWage=0;

        for (int day=0; day<NumOfWorkingDays; day++) {
            int empCheck=(int)Math.floor(Math.random()*10)%3;
            switch (empCheck) {

                case FullTime:
                    workingHrs=8;
                    break;

                case PartTime:
                    workingHrs=4;
                    break;

                default:
                    workingHrs=0;

                    }
            empWage=workingHrs*wagePerHour;
            totalEmpWage +=empWage;
            System.out.println("Employee wage="+empWage);

            }

                System.out.println("Total employee wage="+totalEmpWage);
            }

}


