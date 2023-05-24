/**
 * Elia Phan
 * NeutralAgent.java  FOR EXTENSION
 * CS231 SP23 Project 3
 * last modified 02/26/2023
 */


/**
 * PURPOSE:
 * Neutral always stay at one place.
 * NeutralAgent will also extend the Agent class.
 */


import java.awt.Graphics;
import java.awt.Color;
import java.util.Random;

public class NeutralAgent extends Agent {

    /**
     * a constructor that sets the position and radius
     */
    public NeutralAgent(double x0, double y0) {
        super(x0, y0);
    }

    /**
     * draws a circle of radius 5 (i.e. it fits in a 10x10 box) at the Agent's location.
     * In black color
     */
    public void draw(Graphics g) {
        g.setColor(new Color(0, 0, 0));
        g.fillOval((int) getX(), (int) getY(), 5, 5);
    }

    /**
     * Do nothing
     */
    public void updateState(Landscape scape){
        ;
    }
}