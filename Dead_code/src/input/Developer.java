package input;

public class Developer extends Employee {
    protected String programmingLanguage;
    protected  int total_Salary_inMonth = 15000;

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Programming Language: " + programmingLanguage);
        System.out.println("Your Salary is :"+total_Salary_inMonth);
    }
}


