/**
 * Elia Phan
 * CS231 SP23 Project 3  FOR EXTENSION
 * SocialAgentTests.java
 * last modified 2/26/2023
 */


/**
 * PURPOSE:
 * Test methods of the SocialAgent class
 */

public class SocialAgentTests {

    public static void socialAgentTests() {

        // case 1: testing Agent (double x, double y)
        {
            // set up
            SocialAgent l1 = new SocialAgent(2, 4, 4);
            SocialAgent l2 = new SocialAgent(10, 10, 4);

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
            SocialAgent l1 = new SocialAgent(2, 4, 4);
            SocialAgent l2 = new SocialAgent(10, 10, 4);

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
            SocialAgent l1 = new SocialAgent(2, 4, 4);
            SocialAgent l2 = new SocialAgent(10, 10, 4);

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
            SocialAgent l1 = new SocialAgent(2, 4, 4);
            SocialAgent l2 = new SocialAgent(10, 10, 4);
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
            SocialAgent l1 = new SocialAgent(2, 4, 4);
            SocialAgent l2 = new SocialAgent(10, 10, 4);
            l1.setY(3);
            l2.setY(4);

            // verify
            System.out.println(l1.getY() + " == 3");
            System.out.println(l2.getY() + " == 4");

            // test
            assert l1.getY() == 3 : "Error in Landscape::setY()";
            assert l2.getY() == 4 : "Error in Landscape::setY()";
        }

        // case 6: testing getRadius()
        {
            // set up
            SocialAgent l1 = new SocialAgent(2, 4, 4);
            SocialAgent l2 = new SocialAgent(10, 10, 4);

            // verify
            System.out.println(l1.getRadius() + " == 4");
            System.out.println(l2.getRadius() + " == 4");

            // test
            assert l1.getRadius() == 4 : "Error in Landscape::getRadius()";
            assert l2.getRadius() == 4 : "Error in Landscape::getRadius()";
        }


        // case 7: testing setRadius()
        {
            // set up
            SocialAgent l1 = new SocialAgent(2, 4, 4);
            SocialAgent l2 = new SocialAgent(10, 10, 4);
            l1.setRadius(3);
            l2.setRadius(4);

            // verify
            System.out.println(l1.getRadius() + " == 3");
            System.out.println(l2.getRadius() + " == 4");

            // test
            assert l1.getRadius() == 3 : "Error in Landscape::setRadius()";
            assert l2.getRadius() == 4 : "Error in Landscape::setRadius()";
        }

        System.out.println("*** Done testing! ***\n");
    }
    public static void main (String[]args){
            socialAgentTests();
        }
}