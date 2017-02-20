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
public class EndsWithQuestionOrExclamationMark implements Criterion {

    @Override
    public boolean complies(String line) {

        if (line.equals("")) {
            return false;
        }
        int index = line.length() - 1;
        if (line.charAt(index) == '?' || line.charAt(index) == '!') {
            return true;
        }

        return false;

    }

}
