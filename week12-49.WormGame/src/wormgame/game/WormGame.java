package wormgame.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;
import wormgame.Direction;
import wormgame.domain.Apple;
import wormgame.domain.Worm;
import wormgame.gui.Updatable;

public class WormGame extends Timer implements ActionListener {

    private int width;
    private int height;
    private boolean continues;
    private Updatable updatable;
    private Worm worm;
    private Apple apple;

    public WormGame(int width, int height) {
        super(1000, null);

        this.width = width;
        this.height = height;
        this.continues = true;
        this.worm = new Worm(width / 2, height / 2, Direction.DOWN);

        while (true) {
            this.apple = new Apple(new Random().nextInt(width), new Random().nextInt(height));
            if (!worm.runsInto(apple)) {
                break;
            }
        }

        addActionListener(this);
        setInitialDelay(2000);

    }

    public boolean continues() {
        return continues;
    }

    public void setUpdatable(Updatable updatable) {
        this.updatable = updatable;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (!continues) {
            return;
        }
        this.worm.move();
        if (worm.runsInto(apple)) {
            this.worm.grow();
            newApple();
        } else if (worm.runsIntoItself()) {
            continues = false;
        } else if (this.runsIntoBoard()) {
            continues = false;
        }

        updatable.update();
        setDelay(1000 / worm.getLength());

    }

    public void newApple() {
        while (true) {
            this.apple = new Apple(new Random().nextInt(width), new Random().nextInt(height));
            if (!worm.runsInto(apple)) {
                break;
            }
        }
    }

    public Worm getWorm() {
        if (this.worm != null) {
            return worm;
        }
        return null;
    }

    public void setWorm(Worm worm) {
        this.worm = worm;
    }

    public Apple getApple() {
        return apple;
    }

    public void setApple(Apple apple) {
        this.apple = apple;
    }

    private boolean runsIntoBoard() {
        int x = worm.getX();
        int y = worm.getY();
        if (x < 0 || y < 0 || x >= width || y >= height) {
            return true;
        }
        return false;
    }

}
