package com.company;

public class Main {

    public static void main(String[] args) {

        double lol = calcFeetAndInchesToCentimeters( 6 , 12);
        System.out.println(lol);

        double vigi = calcFeetAndInchesToCentimeters(4); {
            System.out.println(vigi);
        }
    }


public static double calcFeetAndInchesToCentimeters(double feet , double inches) {

    if (feet >= 0 && inches >= 0 && inches <= 12) {
        feet = feet * 30.48;
        inches = inches * 2.54;
        System.out.println("feet to centimetre " + feet  + " inches to centimeter is " +inches);
        return  feet;

    }

    return -1;
}

public static double calcFeetAndInchesToCentimeters(double inches){

        if(inches >=0){
            inches =  inches * 0.0833;
            System.out.println("inches to feet " + inches);
            return inches;
        }
       return -1;


}







}





