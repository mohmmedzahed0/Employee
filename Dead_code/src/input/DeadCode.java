package input;

import java.util.Scanner;

public class DeadCode {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Employee emp = new Employee();
    System.out.println("Choose your role:");
    System.out.println("1. Manager");
    System.out.println("2. Employee");
    System.out.print("Enter 1 or 2: ");
    int roleChoice = input.nextInt();
    input.nextLine();
    emp.setRole(roleChoice);

    String name;
      do {
        System.out.print("Enter your name (letters and numbers only): ");
        name = input.nextLine();
        name = name.replaceAll("[^a-zA-Z0-9\u0600-\u06FF]", "");
      } while (name.isBlank());
      emp.setname(name); // حفظ الاسم في الكائن
      System.out.println("Welcome, " + name);

// ❗ "نفي" أو "ليس" (Logical NOT)

      // إدخال باقي البيانات
      System.out.print("Enter number of hours worked: ");
      double hours = input.nextDouble();
      emp.setHoursWorked(hours);

      System.out.print("Enter hourly rate: ");
      int rate = input.nextInt();
      emp.setHourlyRate(rate);

      System.out.print("Enter number of working days: ");
      int days = input.nextInt();
      emp.setcountDaysofWork(days);



      // عرض البيانات
      System.out.println("\n--- Employee Details ---");
      emp.display();

      input.close();
    }
  }

