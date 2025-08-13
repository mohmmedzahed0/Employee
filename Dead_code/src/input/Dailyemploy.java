package input;

public class Dailyemploy extends Employee {
int costOfDay;

    protected double rateDay = 250;

    public int getCostOfday() {
        return costOfDay;
    }

    public void setCostOfday(int costOfday) {
        this.costOfDay = costOfday;

    }

    public void display() {
        super.display();
        System.out.println("Programming Language: " + costOfDay);
    }



}
