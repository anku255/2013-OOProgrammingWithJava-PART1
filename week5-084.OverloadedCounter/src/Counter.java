/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anku
 */
public class Counter {

    private int number;
    private boolean check;

    public Counter(int startingValue, boolean check) {
        this.check = check;
        this.number = startingValue;
    }

    public Counter(int startingValue) {
        this.number = startingValue;
        check = false;
    }

    public Counter(boolean check) {
        this.check = check;
        this.number = 0;
    }

    public Counter() {
        this.number = 0;
        this.check = false;
    }

    public int value() {
        return this.number;
    }

    public void increase() {
        this.number++;
    }

    public void decrease() {
        if (this.check) {
            if (this.number > 0) {
                this.number--;
            }
        } else {
            this.number--;
        }
    }

    public void increase(int increaseAmount) {
        if (increaseAmount > 0) {
            this.number += increaseAmount;
        }
    }

    public void decrease(int decreaseAmount) {
        if (decreaseAmount > 0) {
            if (this.check) {
                if (this.number - decreaseAmount >= 0) {
                    this.number -= decreaseAmount;
                }
                else
                    this.number = 0;
            } else {
                this.number -= decreaseAmount;
            }
        }
    }

}
