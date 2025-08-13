package input;
public class Employee {
    private String name;
  protected int userId;
    private double hoursWorked;
    private double hourlyRate;
    private int countDaysofWork;
    private int dayOff;
    private int role;


    private final int TOTAL_DAYS_IN_MONTH = 30;

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getCountDaysofWork() {
        return countDaysofWork;
    }

    public void setCountDaysofWork(int countDaysofWork) {
        this.countDaysofWork = countDaysofWork;
    }

    public int getDayOff() {
        return dayOff;
    }

    public void setDayOff(int dayOff) {
        this.dayOff = dayOff;
    }

    public int getTOTAL_DAYS_IN_MONTH() {
        return TOTAL_DAYS_IN_MONTH;
    }
        public void display() {
            System.out.println("Employee Name: " + name);
            System.out.println("User ID: " + userId);
            System.out.println("Total Salary: " + (hoursWorked * hourlyRate));
            System.out.println("Hourly Rate: " + hourlyRate);
            System.out.println("Days Worked: " + countDaysofWork);
            System.out.println("Remaining Days: " + (TOTAL_DAYS_IN_MONTH - dayOff));
        }

    }
