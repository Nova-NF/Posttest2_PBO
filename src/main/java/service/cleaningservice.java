/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author Nova Nur Fauziah
 */

public abstract class cleaningservice {
    private static int counter = 0;
    private final int id;
    private String serviceName;
    private String description;
    private double price;

    public cleaningservice(String serviceName, String description, double price) {
        this.id = ++counter;
        this.serviceName = serviceName;
        this.description = description;
        this.price = price;
    }

    public abstract void displayService();

    // Getters dan setters
    public int getId() {
        return id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}