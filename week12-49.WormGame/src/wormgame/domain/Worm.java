/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.domain;

import java.util.ArrayList;
import java.util.List;
import wormgame.Direction;

/**
 *
 * @author Anku
 */
public class Worm {

    private int x;
    private int y;
    private Direction direction;
    private List<Piece> pieces;
    private boolean growth;

    public Worm(int originalX, int originalY, Direction originalDirection) {
        this.growth = false;
        this.pieces = new ArrayList<Piece>();
        this.x = originalX;
        this.y = originalY;
        pieces.add(new Piece(originalX, originalY));
        this.direction = originalDirection;

    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public int getLength() {
        return getPieces().size();
    }

    public List<Piece> getPieces() {
        return pieces;
    }

    public void grow() {
        this.growth = true;
    }

    public void move() {
        if (direction == Direction.UP) {
            this.y--;
            pieces.add(new Piece(x, y));
            removeOld();
        } else if (direction == Direction.DOWN) {
            this.y++;
            pieces.add(new Piece(x, y));
            removeOld();
        } else if (direction == Direction.RIGHT) {
            this.x++;
            pieces.add(new Piece(x, y));
            removeOld();
        } else if (direction == Direction.LEFT) {
            this.x--;
            pieces.add(new Piece(x, y));
            removeOld();
        }

        growth = false;
    }

    public void removeOld() {
        if (getLength() > 3 && !growth) {
            pieces.remove(0);
        }
    }

    public boolean runsInto(Piece piece) {
        for (Piece p : pieces) {
            if (p != piece) {
                if (p.runsInto(piece)) {
                    return true;
                }
            }

        }
        return false;
    }

    public boolean runsIntoItself() {

        for (Piece p : pieces) {
            if (this.runsInto(p)) {
                return true;
            }
        }

        return false;

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    

}
