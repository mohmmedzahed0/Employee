package input;

import java.util.Scanner;

public class DeadCode {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Employee emp = new Employee();

        do {
            System.out.println("Enter your name:");
            emp.setName(input.next().toLowerCase().trim());

        } while (emp.getName().isEmpty() || !emp.getName().matches("[a-zA-Z]+"));
        System.out.println("You can enter--->");

        System.out.println("In first chose 1.Developer Or 2.Dail Employ");
       emp.setRole(input.nextInt());

       if (emp.getRole() == 1) {
           Developer dev =new Developer();
            System.out.println("your salary is "+(total_Salary_inMonth));

        } else if ( emp.getRole()== 2) {
            System.out.println("You chose Daily Employee");

        } else {
            System.out.println("Invalid choice!");
        }

        System.out.println("Enter your id: ");
        emp.setUserId(input.nextInt());
        System.out.println("Hourly Rate");
        emp.setHourlyRate(input.nextDouble());
        System.out.println("hoursWorked");
        emp.setHoursWorked(input.nextDouble());

        System.out.println("How mune days did you work");
        emp.setCountDaysofWork(input.nextInt());

        System.out.println("How mune did you take days off");
        emp.setDayOff(input.nextInt());

        emp.display();
        input.close();
    }
}