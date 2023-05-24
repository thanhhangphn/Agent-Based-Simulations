/**
 * Elia Phan
 * AntiSocialAgent.java  FOR EXTENSION
 * CS231 SP23 Project 3
 * based on Colby College CS Department's instruction
 * last modified 02/26/2023
 */


/**
 * PURPOSE:
 * As opposed to SocialAgents, AntiSocialAgents try to move away from groups of Agents.
 * AntiSocialAgent will also extend the Agent class.
 */


import java.awt.Graphics;
import java.awt.Color;
import java.util.Random;

public class AntiSocialAgent extends Agent {
    boolean moved; //indicate whether the agent moved during its last updateState()
    int radius; //within radius the agent considers another agent a neighbor


    /**
     * a constructor that sets the position and radius
     */
    public AntiSocialAgent(double x0, double y0, int radius) {
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
     * If the agent moved during the last updateState, it is drawn with a lighter shade of red, otherwise a darker shade of red.
     */
    public void draw(Graphics g){
        if(!moved) g.setColor(new Color(255, 0, 0));
        else g.setColor(new Color(255, 125, 125));

        g.fillOval((int) getX(), (int) getY(), 5, 5);
    }

    /**
     * If there are > 1 agents within radius, change x and y coordinates.
     * Make sure that it stays within the boundary of the window.
     */
    public void updateState(Landscape scape){
        Random rand = new Random();
        LinkedList<Agent> neighbors = scape.getNeighbors(getX(), getY(), getRadius());
        double farX = 1; //the x position among those of neighbors that is closest to X
        double farY = 1; //the y position among those of neighbors that is closest to X
        for (int i = 0; i < neighbors.size(); i++){
            Agent item = neighbors.get(i);
            if (farX < Math.abs(getX() - item.getX())){
                farX = Math.abs(getX() - item.getX());
            }
            if (farY < Math.abs(getY() - item.getY())){
                farY = Math.abs(getY() - item.getY());
            }
        }
        if (neighbors.size() < 4){
            setX(getX() + rand.nextDouble(-farX, farX));
            while (getX() > scape.getWidth()){
                setX(getX() + rand.nextDouble(-farX, farX));
            }
            setY(getY() + rand.nextDouble(-farY, farY));
            while (getY() > scape.getHeight()){
                setY(getY() + rand.nextDouble(-farY, farY));
            }
            moved = true;
        }
        else {
            moved = false;
        }
    }
}