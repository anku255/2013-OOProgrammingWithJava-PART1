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
public class MilkingRobot {
    
    private BulkTank bulkTank;

    public void setBulkTank(BulkTank bulkTank) {
        this.bulkTank = bulkTank;
    }

    public BulkTank getBulkTank() {
        return bulkTank;
    }
    
    public void milk(Milkable milkable)
    {
        if(this.bulkTank == null)
        {
            throw new IllegalStateException("The MilkingRobot hasn't been installed");
        }
        this.bulkTank.addToTank(milkable.milk());
    }

    private Exception IllegalStateException(String the_MilkingRobot_hasnt_been_installed) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
