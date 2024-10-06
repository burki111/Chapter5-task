package Chapter5;

import java.util.Scanner;

public class PhoneBillCalculator {
    static double taxonsubtotal = 0.15;
    static double overagecharges = 0.25;

    static Scanner input = new Scanner(System.in);
    public static void main(String args[]){
      // double subtotal = overtimetax();
        System.out.println("Enter the Planned amount $ ");
        double amount = input.nextDouble();
       double tax = overtimetax(amount);
       double charges = overagefees();
       printbill(tax, charges, amount);
    }
    public static double overtimetax(double amount){

        double tax = amount * taxonsubtotal;
        return tax;
    }
    public static double overagefees(){
        System.out.println("Enter the minutes: ");
        double minutesconsumed = input.nextDouble();
        double charges = overagecharges * minutesconsumed;
        return charges;
    }
    public static double printbill(double tax, double charges, double amount){


       // double subtotal = amount + tax;
        double finalamount =  amount + tax + charges;
        System.out.println("Plan: $" +amount);
        System.out.println("Tax: $" +tax);
       //
        System.out.println("overage: $" +charges);
        System.out.println("Total: $"+finalamount);
        return finalamount;
    }

}
