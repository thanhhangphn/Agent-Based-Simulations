/**
 * Elia Phan
 * CS231 SP23 Project 3 FOR EXTENSION
 * NeutralAgentTests.java
 * last modified 2/26/2023
 */


/**
 * PURPOSE:
 * Test methods of the Neutral class
 */

public class NeutralAgentTests {

    public static void neutralAgentTests() {

        // case 1: testing NeutralAgent (double x, double y)
        {
            // set up
            NeutralAgent l1 = new NeutralAgent(2, 4);
            NeutralAgent l2 = new NeutralAgent(10, 10);

            // verify
            System.out.println(l1);
            System.out.println("\n");
            System.out.println(l2);

            // test
            assert l1 != null : "Error in Agent::Agent(double, double)";
            assert l2 != null : "Error in Agent::Agent(double, double)";
        }

        // case 2: testing getX()
        {
            // set up
            NeutralAgent l1 = new NeutralAgent(2, 4);
            NeutralAgent l2 = new NeutralAgent(10, 10);

            // verify
            System.out.println(l1.getX() + " == 2");
            System.out.println(l2.getX() + " == 10");

            // test
            assert l1.getX() == 2 : "Error in Landscape::getX()";
            assert l2.getX() == 10 : "Error in Landscape::getX()";
        }

        // case 3: testing getY()
        {
            // set up
            NeutralAgent l1 = new NeutralAgent(2, 4);
            NeutralAgent l2 = new NeutralAgent(10, 10);

            // verify
            System.out.println(l1.getY() + " == 4");
            System.out.println(l2.getY() + " == 10");

            // test
            assert l1.getY() == 4 : "Error in Landscape::getY()";
            assert l2.getY() == 10 : "Error in Landscape::getY()";
        }

        // case 4: testing setX()
        {
            // set up
            NeutralAgent l1 = new NeutralAgent(2, 4);
            NeutralAgent l2 = new NeutralAgent(10, 10);
            l1.setX(3);
            l2.setX(4);

            // verify
            System.out.println(l1.getX() + " == 3");
            System.out.println(l2.getX() + " == 4");

            // test
            assert l1.getX() == 3 : "Error in Landscape::setX()";
            assert l2.getX() == 4 : "Error in Landscape::setX()";
        }

        // case 5: testing setY()
        {
            // set up
            NeutralAgent l1 = new NeutralAgent(2, 4);
            NeutralAgent l2 = new NeutralAgent(10, 10);
            l1.setY(3);
            l2.setY(4);

            // verify
            System.out.println(l1.getY() + " == 3");
            System.out.println(l2.getY() + " == 4");

            // test
            assert l1.getY() == 3 : "Error in Landscape::setY()";
            assert l2.getY() == 4 : "Error in Landscape::setY()";
        }

        System.out.println("*** Done testing! ***\n");
    }
    public static void main (String[]args){
        neutralAgentTests();
    }
}