/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anku
 */
public class Flight {
    
    private String planeId;
    private String departureAirportCode;
    private String destinationAirportCode;
    
    public Flight(String planeId, String departCode, String destCode)
    {
        this.departureAirportCode = departCode;
        this.planeId = planeId;
        this.destinationAirportCode = destCode;
    }

    public String getDepartureAirportCode() {
        return departureAirportCode;
    }

    public String getDestinationAirportCode() {
        return destinationAirportCode;
    }

    public String getPlaneId() {
        return planeId;
    }
    
    
    
}
