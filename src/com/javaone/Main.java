package com.javaone;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

import static java.math.RoundingMode.CEILING;

public class Main {

    public static void main(String[] args) {


        //creating an object of class "Polygon"...
        Polygon polygonObj = new Polygon();


        //store the value of an object in variable result
        double result = polygonObj.area_circle();

        //display the value of area of circle...
        System.out.println("The area of circle is: " + result);
        System.out.println("The area of circle is: " + Math.round(result) );



        DecimalFormat n = new DecimalFormat("#.####");


//       //using decimal format to display result into d decimal places...
        System.out.println("The area d  of circle is: " + n.format(result) );


    }
}
//class polygon starts here...
class Polygon{
    double diameter;
    Scanner value = new Scanner(System.in);

    public double area_circle(){
        System.out.println("Enter the value of diameter here: ");
        diameter = value.nextDouble();

        double area = Math.PI*diameter*0.25; //formula for finding an area of circle...

        return area; //return an area to the main method...

    } //end of method circle_area

} //end of class polygon
