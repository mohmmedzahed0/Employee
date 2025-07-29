package input;
public class Employee {
    private String name;
    private String role;
    private double hoursWorked;
    private int hourlyRate;
    private int countDaysofWork;
    private int dayOff;

    private final int TOTAL_DAYS_IN_MONTH = 30;

    public void setname(String name) {
        this.name = name;
    }

    public void setRole(int roleNumber) {
        if (roleNumber == 1) {
            this.role = "manager";
            this.hourlyRate = 100;
        } else if (roleNumber == 2) {
            this.role = "employee";
            this.hourlyRate = 50;
        } else {
            this.role = "unknown";
            this.hourlyRate = 0;
        }
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void setcountDaysofWork(int countDaysofWork) {
        this.countDaysofWork = countDaysofWork;
        // نحسب عدد أيام الغياب تلقائيًا
        this.dayOff = TOTAL_DAYS_IN_MONTH - countDaysofWork;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Working Days: " + countDaysofWork);
        System.out.println("Days Off: " + dayOff);
        System.out.println("Total Salary: " + (hoursWorked * hourlyRate));
    }
}
