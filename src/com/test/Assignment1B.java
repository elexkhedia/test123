import java.text.*;
import java.util.*;

public class Assignment1B {

    public static void main(String[] args) {
        double base = 0;
        double height = 0;
        double hypotenuse = 0;
//        // ask base value to user
//        Scanner baseinput=new Scanner(System.in);
//        System.out.println("Enter base between 0 and 6:");
//        base= baseinput.nextDouble();
//        // ask height value to user
//        Scanner heightinput=new Scanner(System.in);
//        System.out.println("Enter height between 0 and 6:");
//        height= heightinput.nextDouble();

        base=givemeaninput("base",base);
        height=givemeaninput("height",height);

        hypotenuse=Math.pow(base,2.0) + Math.pow(height,2.0); // a2 + b2
        hypotenuse=Math.sqrt(hypotenuse); // square root of a2 + b2
        // print hypotenuse
        System.out.println("hypotenuse="+DecimalFormat.getInstance().format(hypotenuse));
    }

    public static double givemeaninput(String name_var,double value){
        Scanner value_input=new Scanner(System.in);
        System.out.println("Enter "+name_var+" between 0 and 6:");
        value=value_input.nextDouble();
        return value;
    }

}