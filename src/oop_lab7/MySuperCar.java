package oop_lab7;

import java.util.Scanner;

public class MySuperCar {
    public static void main (String[] args) {


        SuperCar superCar1 = new SuperCar();
        superCar1 = inputdata(superCar1);
        System.out.println(superCar1.toString());




    }//main
    private static SuperCar inputdata(SuperCar s) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your atudent data");
        System.out.print("CarBand :");
        s.setCarBrand(scanner.nextLine());
        System.out.print("CarColor :");
        s.setCarColor(scanner.nextLine());
        System.out.print("CarEngineSize :");
        s.setCarEngineSize(scanner.nextLine());
        System.out.print("MaxSpeed :");
        s.setMaxSpeed(scanner.nextLine());
        System.out.print("CountryOfOrigin :");
        s.setCountryOfOrigin(scanner.nextLine());

        return s;
    }
}//class
