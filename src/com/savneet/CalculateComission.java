package com.savneet;

import java.util.Scanner;

public class CalculateComission {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter Sales: ");
        double sales = keyboard.nextDouble();
        System.out.print("Enter advance pay: ");
        double advance=keyboard.nextDouble();
        Commision commision=new Commision(sales,advance);
        commision.display();


    }
}
