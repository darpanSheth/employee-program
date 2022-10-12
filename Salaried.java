import java.util.Scanner;

public class Salaried extends Employee{
    double weeklySalary;

    public void load(){
        super.load();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Salary ==> ");
        this.weeklySalary = scanner.nextDouble();
    }


    @Override
    public double getEarnings() {
        double totalEarnings = this.weeklySalary + getBonus();
        if (totalEarnings > 1000){
            totalEarnings = 1000;
        }
        return totalEarnings;
    }
}
