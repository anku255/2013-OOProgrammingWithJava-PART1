
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anku
 */

public class Team {
    
    private String name;
    private ArrayList<Player> playerList;
    private int maxSize;
    
    public Team(String name)
    {
        this.name = name;
        this.playerList = new ArrayList<Player>();
        this.maxSize = 16;
    }

    public String getName() {
        return name;
    }
    
    public void addPlayer(Player player)
    {
        if(this.playerList.size()<this.maxSize)
            this.playerList.add(player);
    }
    
    public void printPlayers()
    {
        for(Player player : this.playerList)
        {
            System.out.println(player);
        }
    }
    
    public void setMaxSize(int maxSize)
    {
        this.maxSize = maxSize;
    }
    
    public int size()
    {
        return this.playerList.size();
    }
    
    public int goals()
    {
        int sum = 0;
        for(Player player : this.playerList)
        {
            sum += player.getNoOfGoals();
        }
        
        return sum;
    }
    
}
