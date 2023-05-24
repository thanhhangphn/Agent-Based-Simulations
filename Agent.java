/**
 * Elia Phan
 * Agent.java FOR EXTENSION
 * CS231 SP23 Project 3
 * based on Colby College CS Department's instruction
 * last modified 02/26/2023
 */


/**
 * PURPOSE:
 * The simulations will require making two forms of agents with different updateState() methods.
 * This is an ideal situation for using inheritance, which means starting with a base class: the Agent class.
 */


import java.awt.Graphics;

public abstract class Agent {
    double x; //x position
    double y; //y position


    /**
     * a constructor that sets the position
     */
    public Agent (double x, double y){
        this.x = x;
        this.y = y;
    }


    /**
     * returns the x position
     */
    public double getX(){
        return x;
    }


    /**
     * returns the y position
     */
    public double getY(){
        return y;
    }


    /**
     * sets the x position
     */
    public void setX(double newX){
        x = newX;
    }


    /**
     * sets the y position
     */
    public void setY(double newY){
        y = newY;
    }


    /**
     * returns a String containing the x and y position
     * e.g.: (3.024, 4.245)
     */
    public String toString(){
        return x + ", " + y;
    }


    /**
     * abstract class doing nothing for now
     */
    public abstract void updateState(Landscape scape);


    /**
     * abstract class doing nothing for now
     */
    public abstract void draw(Graphics g);
}
