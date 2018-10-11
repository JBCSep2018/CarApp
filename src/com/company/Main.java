package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Car> cars = new ArrayList<>();


        while(true) {
            System.out.print("Enter a make and model: ");
            Car c = new Car();
            String make = scan.next();
            c.setMake(make);
            String model = scan.next();
            c.setModel(model);
            //clear out the buffer
            scan.nextLine();

            //Add the car to the arraylist
            cars.add(c);

            //allow the user to enter another car
            System.out.println("Do you want to enter another car? (y/n)");
            if (scan.nextLine().equalsIgnoreCase("n")){
                break;
            }
        }

        //print out the cars
        for (Car eachCar: cars) {
            System.out.println(eachCar.display());
        }

        System.out.println("Goodbye!");
    }
}
