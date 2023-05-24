/**
 * Elia Phan
 * AgentSimulation.java FOR EXTENSION
 * CS231 SP23 Project 3
 * based on Colby College CS Department's instruction
 * last modified 02/26/2023
 * How to run:
 * javac AgentSimulation.java
 * java AgentSimulation [number of agents N] [width] [height] [number of steps] [radius]
 * e.g.: java AgentSimulation 200 500 500 100 30
 */


import java.util.Random;

/**
 * PURPOSE:
 * Generate and randomly place N agents (N = 200 is reasonable) on the Landscape.
 * Then loop over the time steps, calling updateAgents, repaint, and Thread.sleep() as in LifeSimulation.
 */
public class AgentSimulation {
    public static void main(String[] args) throws InterruptedException {
        if (args.length < 3) {
            System.out.println("Command-line argument: [number of agents N] [width] [height] [number of steps] [radius]");
        } else {
            int N = Integer.parseInt(args[0]);
            int w = Integer.parseInt(args[1]);
            int h = Integer.parseInt(args[2]);
            int s = Integer.parseInt(args[3]);
            int r = Integer.parseInt(args[4]);

            Landscape scape = new Landscape(w, h);
            Random gen = new Random();

            // Creates 1/3 SocialAgents, 1/3 AntiSocialAgents, and 1/3 NeutralAgents
            for (int i = 0; i < N/3; i++) {
                scape.addAgent(new AntiSocialAgent(gen.nextDouble() * scape.getWidth(),
                        gen.nextDouble() * scape.getHeight(),
                        r));
                scape.addAgent(new SocialAgent(gen.nextDouble() * scape.getWidth(),
                        gen.nextDouble() * scape.getHeight(),
                        r));
                scape.addAgent(new NeutralAgent(gen.nextDouble() * scape.getWidth(),
                        gen.nextDouble() * scape.getHeight()));
            }

            LandscapeDisplay display = new LandscapeDisplay(scape);

            for (int i = 0 ; i < s; i++) {
                Thread.sleep(10);
                scape.updateAgents();
                display.repaint();
            }
        }
    }
}
