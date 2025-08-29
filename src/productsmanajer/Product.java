/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productsmanajer;

import java.io.*;
import java.util.Scanner;
import java.io.IOException;

/**
 *
 * @author Jimmy Silva Luna
 */
public class Product {

    private int ID;
    private String Name;
    private String Description;
    private double Price;
    private int Amount;
    
    public Product(int id, String name, String description, double price, int amount) {
        this.ID = id;
        this.Name = name;
        this.Description = description;
        this.Price = price;
        this.Amount = amount;
    }
    public Product(String name, String description, double price, int amount) {
        this.Name = name;
        this.Description = description;
        this.Price = price;
        this.Amount = amount;
    }
    // getters
    
    public int getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public String getDescription() {
        return Description;
    }

    public double getPrice() {
        return Price;
    }

    public int getAmount() {
        return Amount;
    }

    // Setters
    
    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public void setAmount(int amount) {
        this.Amount = amount;
    }
    
    // Insertar en archivo
    public void insertIntoFile(String FileRoute, String[] products) throws IOException {
        File file = new File(FileRoute);
        BufferedWriter bf = new BufferedWriter(new FileWriter(file, true));
        String fileContent = "|" +
                products[0] + "|" +
                products[1] + "|" +
                products[2] + "|" +
                products[3] + "||";
        bf.write(fileContent + "\n");
        bf.close();
    }
    
}
