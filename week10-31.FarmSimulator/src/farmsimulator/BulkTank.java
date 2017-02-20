/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

/**
 *
 * @author Anku
 */
public class BulkTank {

    private double capacity;
    private double volume;

    public BulkTank(double capacity) {
        this.capacity = capacity;
        this.volume = 0;
    }

    public BulkTank() {
        this(2000);
    }

    public double getCapacity() {
        return capacity;
    }

    public double getVolume() {
        return volume;
    }

    public double howMuchFreeSpace() {
        return capacity - volume;
    }

    public void addToTank(double amount) {
        if (howMuchFreeSpace() < amount) {
            amount = howMuchFreeSpace();
        }

        volume += amount;
    }

    public double getFromTank(double amount) {
        if (amount > volume) {
            amount = volume;
        }

        volume -= amount;

        return amount;

    }

    public String toString() {
        return Math.ceil(volume) + "/" + Math.ceil(capacity);
    }
}
