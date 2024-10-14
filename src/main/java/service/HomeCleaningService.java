/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author Nova Nur Fauziah
 */
public class HomeCleaningService extends cleaningservice {

    // Constructor untuk HomeCleaningService yang memanggil constructor superclass
    public HomeCleaningService(String serviceName, String description, double price) {
        super(serviceName, description, price);  // Memanggil constructor di class induk cleaningservice
    }

    // Override method displayService untuk menampilkan detail khusus HomeCleaningService
    @Override
    public void displayService() {
        System.out.println("Home Cleaning - ID: " + getId() + ", Layanan: " + getServiceName() + ", Deskripsi: " + getDescription() + ", Harga: " + getPrice());
    }

    // Method tambahan untuk implementasi CRUD (optional)
    public void addService() {
        // Implementasi untuk menambah layanan
    }

    public void viewServices() {
        // Implementasi untuk melihat layanan
    }

    public void updateService() {
        // Implementasi untuk mengubah layanan
    }

    public void deleteService() {
        // Implementasi untuk menghapus layanan
    }
}
