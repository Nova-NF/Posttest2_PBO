/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author Nova Nur Fauziah
 */
public class OfficeCleaningService extends cleaningservice {

    public OfficeCleaningService(String serviceName, String description, double price) {
        super(serviceName, description, price);
    }

    @Override
    public void displayService() {
        System.out.println("Office Cleaning - ID: " + getId() + ", Layanan: " + getServiceName() + ", Deskripsi: " + getDescription() + ", Harga: " + getPrice());
    }

    public void addService() {
        // Implementasi CRUD pada level subclass jika diperlukan
    }

    public void viewServices() {
        // Implementasi CRUD pada level subclass jika diperlukan
    }

    public void updateService() {
        // Implementasi CRUD pada level subclass jika diperlukan
    }

    public void deleteService() {
        // Implementasi CRUD pada level subclass jika diperlukan
    }
}