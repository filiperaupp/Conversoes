package com.example.filip.conversoes;

/**
 * Created by filip on 03/12/2017.
 */

public class CalculoConversoes {

    public static double milesToKm(double milhas){
        return milhas*1.60934;
    }

    public static double milesToFeets(double milhas) {
        return  milhas*5280;
    }

    public static double dolarToReal(double dolars){
        return dolars*3.26;
    }

    public static double tangenteOfTheAngle(double angulo){
        double radians = Math.toRadians(angulo);
        return Math.tan(radians);
    }
}
