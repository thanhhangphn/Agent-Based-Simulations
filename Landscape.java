/**
 * Elia Phan
 * Landscape.java FOR EXTENSION
 * CS231 SP23 Project 3
 * based on Colby College CS Department's instruction
 * last modified 02/26/2023
 */


/**
 * PURPOSE:
 * The Landscape class has a field to hold the linked list of Agent objects and its methods
 */


import java.awt.Graphics;

public class Landscape {
    int width;
    int height;
    LinkedList<Agent> landscape;


    /**
     * a constructor that sets the width and height fields, and initializes the agent list.
     */
    public Landscape(int w, int h) {
        width = w;
        height = h;
        landscape = new LinkedList<Agent>();
    }


    /**
     * returns the height.
     */
    public int getHeight() {
        return height;
    }


    /**
     * returns the width.
     */
    public int getWidth() {
        return width;
    }


    /**
     * inserts an agent at the beginning of its list of agents.
     */
    public void addAgent(Agent a) {
        landscape.add(a);
    }


    /**
     * returns a String representing the Landscape. It can be as simple as indicating the number of Agents on the Landscape.
     */
    public String toString() {
        return landscape.size() + "";
    }


    /**
     * returns a list of the Agents within radius distance of the location x0, y0.
     */
    public LinkedList<Agent> getNeighbors(double x0, double y0, double radius) {
        LinkedList output = new LinkedList<Agent>();
        for (Agent item : landscape) {
            if (item.getX() < x0 + radius && x0 - radius < item.getX() &&
                    item.getY() < y0 + radius && y0 - radius < item.getY() &&
                    item.getX() != x0 && item.getY() != y0) {
                output.add(item);
            }
        }
        return output;
    }


    /**
     * Calls the draw method of all the agents on the Landscape.
     */
    public void draw(Graphics g){
        for (Agent item : landscape) {
            item.draw(g);
        }
    }


    /**
     * Update the state of each agent, in whatever order you'd like.
     */
    public void updateAgents(){
        for (Agent item : landscape){
            item.updateState(this);
        }
    }
}
