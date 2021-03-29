package com.indianappexpress;
/**
* Author : Devendra Mishra
*/
public class Main {

    public static void main(String[] args) {
     //print Your phone Brand Name
     String brand = "Motorola";
     switch (brand) {

            case "Apple":
                System.out.println("Apple Phone");
               break;
            case "Samsung":
                System.out.println("Samsung Phone");
                break;
            case "Motorola" :
                System.out.println("Motorola Phone");
                break;
            case "Nokia" :
                System.out.println("Nokia phone");
                break;
            default :
                System.out.println("Use Best phone brand ");
                break;
     }

    }
}
