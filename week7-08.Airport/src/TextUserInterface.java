/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anku
 */
import java.util.Scanner;
import java.util.ArrayList;

public class TextUserInterface {
    
    private ArrayList<AirPlane> planes;
    private ArrayList<Flight> flight;
    private Scanner reader;
    
    public TextUserInterface()
    {
        this.flight = new ArrayList<Flight>();
        this.planes = new ArrayList<AirPlane>();
        this.reader = new Scanner(System.in);
    }
    
    public void start()
    {
        airportPanel();
        flightService();
    }
    
    public void airportPanel()
    {
        System.out.println("Airport panel");
        System.out.println("--------------------");
        
        String command;
        while(true)
        {
            printMenuForAirportPanel();
            command = this.reader.nextLine();
            if(command.equals("1"))
                addAirplane();
            else if(command.equals("2"))
                addFlight();
            else if(command.equals("x"))
                break;
                
        }
        
        
    }
    
    public void printMenuForAirportPanel()
    {
        System.out.println("Choose operation: ");
        System.out.println("[1] Add airplane");
        System.out.println("[2] Add flight");
        System.out.println("[x] Exit");
    }
    
    public void addAirplane()
    {
        System.out.println("Give plane ID: ");
        String planeId = this.reader.nextLine();
        System.out.println("Give plane capacity: ");
        int capacity = Integer.parseInt(reader.nextLine());
        
        AirPlane airplane = new AirPlane(planeId, capacity);
        
        this.planes.add(airplane);
    }
    
    public void addFlight()
    {
        System.out.println("Give plane ID: ");
        String planeId = this.reader.nextLine();
        System.out.println("Give departure airport code: ");
        String departCode = this.reader.nextLine();
        System.out.println("Give destination airport code: ");
        String destCode = this.reader.nextLine();
        
        Flight newFlight =  new Flight(planeId, departCode, destCode);
        this.flight.add(newFlight);
    }
    
    public void flightService()
    {
        System.out.println("Flight service");
        System.out.println("------------");
        
        String command;
        
        while(true)
        {
            printMenuForFlightService();
            command = this.reader.nextLine();
            
            if(command.equals("1"))
                printPlane();
            else if(command.equals("2"))
                printFlights();
            else if(command.equals("3"))
                printPlaneInfo();
            else if(command.equals("x"))
                break;
        }
    }
    
    public void printMenuForFlightService()
    {
        System.out.println("[1] Print planes");
        System.out.println("[2] Print flights");
        System.out.println("[3] Print plane info");
        System.out.println("[x] Quit");
    }
    
    public void printPlane()
    {
        for(AirPlane plane : this.planes)
        {
            System.out.println(plane);
        }
    }
    
    public void printFlights()
    {
        for(Flight flighT : this.flight)
        {
            int capacity = 0;
            for(AirPlane plane : this.planes)
            {
                if(flighT.getPlaneId().equals(plane.getPlaneId()))
                    capacity = plane.getCapacity();
            }
            System.out.println(flighT.getPlaneId() + " (" + capacity + " ppl) (" + flighT.getDepartureAirportCode() + "-" + flighT.getDestinationAirportCode() + ")");
        }
    }
    
    public void printPlaneInfo()
    {
        System.out.print("Give plane ID: ");
        String planeId = this.reader.nextLine();
        
        for(AirPlane plane : this.planes)
        {
            if(planeId.equals(plane.getPlaneId()))
            {
                System.out.println(plane);
                break;
            }
        }
    }
}
