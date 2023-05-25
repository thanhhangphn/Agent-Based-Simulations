# Agent-Based-Simulations

This project uses linked lists to implement  the simulation of agents (placed in continuous-2D-space positions) on a 2D landscape in which the
agents interact with each other under two sets of rules (social and anti-social) to determine how they change over time.

The result of the simulation is a window that displays the agent-based simulations with red dots (representing anti-social agents) and blue dots (representing social agents).

## Final Result Showcase






https://github.com/thanhhangphn/Agent-Based-Simulations/assets/119096071/0b2b679b-8046-498d-9670-1da3ed7b0681





![CS231](https://github.com/thanhhangphn/Agent-Based-Simulations/assets/119096071/747d8fc6-a8ac-4aaf-b8f8-ac679de7c752)

## Description

Based on SocialAgent.updateState() and AntiSocialAgent.updateState() methods,
we can see:
- The anti-social agents stabilize when a group of them spreads out enough so
that they can no longer move in future updateState().
- The social agents stabilize when a group of them clumps together so that
they can no longer move in future updateState().

In picture 1, the anti-social agents (red) are easier to stabilize than the social agents
(blue) because the radius is smaller, meaning the anti-social agents only need to
spread out by an easily small distance to potentially stabilize. Thus, we see more
dark red dots than light red dots. Meanwhile, the social agents need to clump very
close together to stabilize, which takes a longer amount of time. Thus, we see more
light blue dots than dark blue dots.

In picture 2, the social agents (blue) are easier to stabilize than the anti-social
agents (red) because the radius is larger, meaning the anti-social agents need to
spread out by a large distance to potentially stabilize, which takes a longer amount
of time. Thus, we see more light red dots than dark red dots. Meanwhile, the social
agents only need to clump very together by a relatively large distance to stabilize.

Thus, we see more dark blue dots (in clumps) than light blue dots.
For the same reasons, after 1000 steps (meaning all agents are likely to already
reach stabilization) we see the blue dots are more closely clumped together in
picture 3 (smaller radius) and the red dots more widely spread out in picture 4
(larger radius).

## Sources/Credits
Colby College's CS231 (Data Structures and Algorithms)'s resources
