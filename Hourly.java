import java.util.Scanner;

public class Hourly extends Employee{
    private double hourlyPay;
    private int hoursWorkedLastWeek;

    public void load(){
        super.load();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Hourly pay ==> ");
        this.hourlyPay = scanner.nextDouble();

        System.out.print("Hours worked this past week ==> ");
        this.hoursWorkedLastWeek = scanner.nextInt();
    }


    @Override
    public double getEarnings() {
        double totalEarnings = (this.hoursWorkedLastWeek * this.hourlyPay) + this.getBonus();
        if (totalEarnings > 1000){
            totalEarnings = 1000;
        }
        return totalEarnings;
    }
}
