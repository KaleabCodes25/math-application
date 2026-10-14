package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        double bobSalary = 60000;
        double garySalary = 70000;
        double highestSalary = Math.max(bobSalary,garySalary);
        System.out.println("The higher salary is: " + highestSalary);

        // 2
        double carPrice = 45000;
        double truckPrice = 60000;
        double smallestPrice = Math.min(carPrice,truckPrice);
        System.out.println("The smaller price is: " + smallestPrice);

         //3 area fo circle
        double radius = 7.25;
        double area = Math.PI * Math.pow(radius,2);
        System.out.println("The display area of the circle is: " + area);

        //4 square root
        double value = 5.0;
        double newValue = Math.sqrt(value);
        System.out.println("The square root is: " + newValue);

        // 5
        double distance = Math.hypot(85 -5,50 -10);
        System.out.println(distance);

        //6
        double negative = -3.8;
        double absolute = Math.abs(negative);
        System.out.println(absolute);

        //7
        double random = Math.random();
        System.out.println(random);

        // 8 1 day
        int aMinute = 60000; //milliseconds
        int day = 1440;//minutes
        int totalDays = 24;
        int totalMins = day * totalDays;
        long totalMiliseconds = totalMins * aMinute;
        System.out.println(totalMins);
        System.out.println(totalMiliseconds);


    }
}
