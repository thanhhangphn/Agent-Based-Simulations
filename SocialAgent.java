/**
 * Elia Phan
 * SocialAgent.java  FOR EXTENSION
 * CS231 SP23 Project 3
 * based on Colby College CS Department's instruction
 * last modified 02/26/2023
 */

/**
 * PURPOSE:
 * The social agents will ultimately move towards other agents, creating groups of agents.
 * SocialAgent will extend the Agent class.
 */


import java.awt.Graphics;
import java.awt.Color;
import java.util.Random;

public class SocialAgent extends Agent {
    boolean moved; //indicate whether the agent moved during its last updateState()
    int radius; //within radius the agent considers another agent a neighbor


    /**
     * a constructor that sets the position and radius
     */
    public SocialAgent(double x0, double y0, int radius) {
        super(x0, y0);
        this.radius = radius;
    }

    /**
     * sets the radius
     */
    public void setRadius(int radius){
        this.radius = radius;
    }


    /**
     * returns the radius
     */
    public int getRadius(){
        return radius;
    }


    /**
     * draws a circle of radius 5 (i.e. it fits in a 10x10 box) at the Agent's location.
     * If the agent moved during the last updateState, it is drawn with a lighter shade of blue, otherwise a darker shade of blue.
     */
    public void draw(Graphics g){
        if(!moved) g.setColor(new Color(0, 0, 255));
        else g.setColor(new Color(125, 125, 255));

        g.fillOval((int) getX(), (int) getY(), 5, 5);
    }


    /**
     * If there are < 4 agents within radius, change x and y coordinates.
     * Make sure that it stays within the boundary of the window.
     */
    public void updateState(Landscape scape){
        Random rand = new Random();
        LinkedList<Agent> neighbors = scape.getNeighbors(getX(), getY(), getRadius());
        double closeX = 500; //the x position among those of neighbors that is closest to X
        double closeY = 500; //the y position among those of neighbors that is closest to X
        for (int i = 0; i < neighbors.size(); i++){
            Agent item = neighbors.get(i);
            if (closeX > Math.abs(getX() - item.getX())){
                closeX = Math.abs(getX() - item.getX());
            }
            if (closeY > Math.abs(getY() - item.getY())){
                closeY = Math.abs(getY() - item.getY());
            }
        }
        if (neighbors.size() > 1){
            setX(getX() + rand.nextDouble(-closeX, closeX));
            while (getX() > scape.getWidth()){
                setX(getX() + rand.nextDouble(-closeX, closeX));
            }
            setY(getY() + rand.nextDouble(-closeY, closeY));
            while (getY() > scape.getHeight()){
                setY(getY() + rand.nextDouble(-closeY, closeY));
            }
            moved = true;
        }
        else {
            moved = false;
        }
    }
}
