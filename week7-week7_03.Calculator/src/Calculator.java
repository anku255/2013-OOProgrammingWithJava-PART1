/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anku
 */
public class Calculator {
    
    private Reader getValue;
    private int statisticCounter;

    public Calculator() {
        this.statisticCounter = 0;
        this.getValue = new Reader();
    }

    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = getValue.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }

        statistics();
    }
    
    private void sum()
    {
        this.statisticCounter++;
        System.out.println("value1: ");
        int value1 = getValue.readInteger();
        System.out.println("value2: ");
        int value2 = getValue.readInteger();
        
        System.out.println("sum of the values "+ (value1+value2));
    }
    
    private void difference()
    {
        this.statisticCounter++;
        System.out.println("value1: ");
        int value1 = getValue.readInteger();
        System.out.println("value2: ");
        int value2 = getValue.readInteger();
        
        System.out.println("difference of the values "+ (value1-value2));
    }
    
    private void product()
    {
        this.statisticCounter++;
        System.out.println("value1: ");
        int value1 = getValue.readInteger();
        System.out.println("value2: ");
        int value2 = getValue.readInteger();
        
        System.out.println("product of the values "+ value1*value2);
    }
    
    private void statistics()
    {
        System.out.println("Calculations done "+ this.statisticCounter);
    }

}
