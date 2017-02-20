/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anku
 */
public class AirPlane {
    
    private String planeId;
    private int capacity;
    
    public AirPlane(String planeId, int capacity)
    {
        this.capacity = capacity;
        this.planeId = planeId;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getPlaneId() {
        return planeId;
    }
    
    
    public String toString()
    {
        return this.planeId + " (" + this.getCapacity() + " ppl)";
    }
    
}
