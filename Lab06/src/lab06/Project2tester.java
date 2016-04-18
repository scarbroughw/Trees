/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

import java.util.Scanner;

/**
 *
 * @author Bill Scarbrough
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String brand, type, cost;
        
        Scanner input = new Scanner(System.in);
        
        
        // Two instances of guitar
        
        
        
// This commented out code is for if the user were to input their own info

        System.out.println("Enter the guitar manufacturer: ");
        brand = input.nextLine();
        System.out.println("Enter the guitar model name: ");
        type = input.nextLine();
        System.out.println("Enter the price of the guitar: ");
        cost = input.nextLine();
        
        
        Guitar guitar1 = new Guitar(brand,type,cost);
        
        
        guitar1.setMake(brand);
        guitar1.setModel(type);
        guitar1.setPrice(cost);

        System.out.println(guitar1.toString());
        //System.out.println(guitar2.toString());
        
        
        
        
        
        
        
        
        //Outputs the initial context asking for the details about the guitar
        
          
        
    }
     
}
