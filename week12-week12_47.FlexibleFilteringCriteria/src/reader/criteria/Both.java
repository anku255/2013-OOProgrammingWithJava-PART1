/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;

/**
 *
 * @author Anku
 */
public class Both implements Criterion{
    private Criterion criterian1;
    private Criterion criterian2;
    
    public Both(Criterion c1, Criterion c2)
    {
        this.criterian1 = c1;
        this.criterian2 = c2;
    }

    @Override
    public boolean complies(String line) {
        if(criterian1.complies(line)&& criterian2.complies(line))
            return true;
        return false;
    }
    
}
