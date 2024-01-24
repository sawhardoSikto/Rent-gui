
import javax.swing.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;
public class Rent
{
    private double totalcost=0.0;
    private String name;
    private   double sum=0.0;
    static final DecimalFormat decfor = new DecimalFormat("0.00");

   Rent()
   {

   }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setTotalcost(double totalcost)
    {
        this.totalcost=totalcost;
    }

    //    public static double setTotalcost(int totalcost)
//    {
//        return totalcost;
//
//    }
    public double getTotalcost()
    {
        return totalcost;
    }
    public void set(double roomVara,double khalabill,double wifi )
    {
        double service_charge=(getTotalcost()-25000)/7;
        sum=roomVara+khalabill+wifi+service_charge;

    }
    public double getSum()
    {
        return sum;
    }

//    public void print (JTextArea display)
//
//    {
//
//
//        System.out.println(getName());
//
//        display.setText("Total Cost :"+ decfor.format(getSum()));
//        System.out.println("Total Cost :"+ decfor.format(getSum()));
//
//
//    }
    public static double convertToDouble(String str) {
        double result = 0.0;

        try {
            result = Double.parseDouble(str);
        } catch (NumberFormatException e) {
            System.out.println("Error: Unable to convert the string to a double.");
            // You may choose to handle the exception in a way that fits your application.
            // For now, we are just printing an error message.
        }

        return result;
    }


}




