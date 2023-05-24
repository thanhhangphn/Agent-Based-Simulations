/**
 * Elia Phan
 * CS231 SP23 Project 3
 * LandscapeTests.java  FOR EXTENSION
 * last modified 2/26/2023
 */


/**
 * PURPOSE:
 * Test methods of the Landscape class
 */

public class LandscapeTests {

    public static void landscapeTests() {

        // case 1: testing Landscape(int, int)
        {
            // set up
            Landscape l1 = new Landscape(2, 4);
            Landscape l2 = new Landscape(10, 10);
            l1.addAgent(new SocialAgent(1, 2, 4));
            l2.addAgent(new AntiSocialAgent(1, 2, 4));

            // verify
            System.out.println(l1);
            System.out.println(l2);

            // test
            assert l1 != null : "Error in Landscape::Landscape(int, int)";
            assert l2 != null : "Error in Landscape::Landscape(int, int)";
        }


        // case 2: testing getWidth()
        {
            // set up
            Landscape l1 = new Landscape(2, 4);
            Landscape l2 = new Landscape(10, 10);

            // verify
            System.out.println(l1.getWidth());
            System.out.println(l2.getWidth());

            // test
            assert l1.getWidth() == 2 : "Error in Landscape::getRows()";
            assert l2.getWidth() == 10 : "Error in Landscape::getRows()";
        }

        // case 3: testing getHeight()
        {
            // set up
            Landscape l1 = new Landscape(2, 4);
            Landscape l2 = new Landscape(10, 10);

            // verify
            System.out.println(l1.getHeight());
            System.out.println(l2.getHeight());

            // test
            assert l1.getHeight() == 4 : "Error in Landscape::getCols()";
            assert l2.getHeight() == 10 : "Error in Landscape::getCols()";
        }

        // case 4: testing addAgent()
        {
            // set up
            Landscape l1 = new Landscape(2, 4);
            Landscape l2 = new Landscape(10, 10);
            l1.addAgent(new SocialAgent(10, 10, 3));
            l2.addAgent(new AntiSocialAgent(10, 10, 3));

            // verify
            System.out.println(l1);
            System.out.println(l2);

            // test
            assert l1.landscape.size() > 0 : "Error in Landscape::addAgent()";
            assert l2.landscape.size() > 0 : "Error in Landscape::addAgent()";
        }

        // case 6: testing getNeighbors()
        {
            // set up
            Landscape l1 = new Landscape(2, 4);
            Landscape l2 = new Landscape(10, 10);
            l1.addAgent(new SocialAgent(2, 2, 4));
            l2.addAgent(new AntiSocialAgent(1, 2, 4));
            l1.addAgent(new SocialAgent(2, 2, 4));
            l2.addAgent(new AntiSocialAgent(1, 2, 4));

            // verify
            System.out.println(l1.getNeighbors(1,2, 4));
            System.out.println(l2.getNeighbors(1,2, 4));

            // test
            assert l1.getNeighbors(1,2, 4) instanceof LinkedList<Agent> : "Error in Landscape::getNeighbors(int, int)";
            assert l2.getNeighbors(1,2, 4) instanceof LinkedList<Agent> : "Error in Landscape::getNeighbors(int, int)";
        }

        // case 7: testing updateAgents()
        {
            // set up
            Landscape l1 = new Landscape(2, 4);
            Landscape l2 = new Landscape(10, 10);
            l1.addAgent(new SocialAgent(1, 2, 4));
            l2.addAgent(new AntiSocialAgent(1, 2, 4));
            Landscape l1Test = l1;
            Landscape l2Test = l2;

            l1Test.updateAgents();
            l2Test.updateAgents();

            // verify
            System.out.println(l1 + "\n" + l1Test);
            System.out.println(l2 + "\n" + l2Test);

            // test
            assert l1 != l1Test: "Error in Landscape::advance()";
            assert l2 != l2Test: "Error in Landscape::advance()";
        }
        System.out.println("*** Done testing Cell! ***\n");
    }

    public static void main(String[] args) {
        landscapeTests();
    }
}