/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;


/**
 *
 * @author Bill Scarbrough
 */
public class Guitar {
    
    private final String make;
    private String model;
    private final String price;
    
    // Constuctor to accept info parameters for each guitar
    public Guitar(String newMake,String newModel,String newPrice)
    {
        this.make = newMake;
        this.model = newModel;
        this.price = newPrice;
    }
        
    // Creates the methods for the company name that makes the guitar
    public void setMake(String brand)
    {
        
        brand = make;
    }
    public String getMake()
    {
        return make;
    }
    
    // Creates the methods for the specific model of the guitar
    public void setModel(String type)
    {
        
        model = type;
    }
    public String getModel()
    {       
        return model;
    }
    
    public void setPrice(String cost)
    {
        
        cost = price;
    }
    public String getPrice()
    {
        return price;
    }
    
    @Override
    public String toString(Guitar this){
        
        // toString to create the correct output format for displaying guitar info
        String format = "Make: "+make+"\nModel: "+model+"\nPrice: "+price;
        return format;
        
    
    }
    
    
}
