# Analysis-and-Design-Algorithms
## Assignment 1 
### Problem Description:
Darth Sidious gave Order 66 and the Galactic Republic went into Chaos. The clone troops who were once fighting by the side of the Jedi are now the ones killing them! But how did that happen? When the clones were created on planet Kamino, a microchip was implanted in their brains. Of course, the Jedi did not know this but the Kaminoans were working with Darth Sidious all along. They programmed the microchips to respond to Order 66 by taking all the clones’ free will away and ordering them to kill all the Jedi. During the cloning process, the Kaminoans did a failed experiment which resulted in the creation of Clone Force 99, or what they called The Bad Batch. The Bad Batch was a group of enhanced clones with extraordinary physical and mental traits. When Order 66 was executed, their microchips did not respond like normal clones so they were one of the few batches that remained sane.

Seeing what was going on, the Bad Batch decided they would go on a mission to save the remaining Jedi Knights in the galaxy. They received intel that Jedi Master Windu is on planet Naboo with some young padawans, so they decided to travel to him. However, the Bad Batch were informed that the separatists issued a hefty bounty on their heads. For this reason, they need to be careful when travelling to Naboo. The Bad Batch is currently on the planet Tatooine. To hide their tracks, they decided that they would only get fuel for their ship from their trusted allies on the planets that would be on their route to Naboo. In order to go from one planet to the next, they need to do one hyperspace teleport. The one hyperspace teleport requires one litre of fuel. The Bad Batch managed to broadcast a message to all their trusted allies on the planets asking them to inform the Bad Batch of the fuel litres they can provide when they land on their planets. Now that the Bad Batch has the amount of fuel that each planet on their route to Naboo (including Tatooine and Naboo) can provide, they need to design:

- A Divide and Conquer algorithm that will tell them whether they can reach Naboo with the amount of fuel that their allies will provide.
- A Greedy algorithm that does the same thing and runs in O(n). 

Unfortunately, there is a malfunction in the engines of the ship such that when the ship
lands on any planet, it drains out all the fuel it has. May the Force be with them!
![image](https://github.com/LD0720/Analysis-and-Design-Algorithms/assets/106076298/5f45e4ac-d70b-4641-9c1d-a22405bb6e1a)

An example can be seen in Figure 1.
On each planet on the route from Tatooine and Naboo, there is a number of fuel litres that the trusted allies can provide. One way to go to Naboo is to do one hyperspace teleport (using one litre) to Planet B, then land there to fuel and thus the ship will have 3 litres of fuel (since the existing fuel drains upon landing). Then do three hyperspace teleports to reach Naboo (without landing in between). Another way would be to do two hyperspace teleports to planet C, fuel there, do one hyperspace teleport to planet D, fuel there, and finally one last hyperspace  teleport to Naboo. Bottom line is, Naboo can be reached from Tatooine using only allies fuel in that case.
### Deliverables. 
You are required to submit one Java file titled TheBadBatch containing the following methods. The class name must be TheBadBatch and the class must have a package name csen703.main.assignment1.

- public static boolean TatooineToNabooDivideAndConquer(int [] fuel) that implements a divide and conquer approach to finding whether Naboo can be reached using allies fuel only or not.
- public static boolean TatooineToNabooGreedy(int [] fuel) that implements the Greedy approach that does the same but runs in O(n)

## Assignment 2
### Problem Description:
After Tech managed to find out that they would be able to reach planet Naboo from Tatooine, he realised that they needed to be as discrete as possible. To do that Tech decided to minimize their landings as much as possible. You need to help Tech to:

- Design a Dynamic programming algorithm that outputs the minimum number of planets the Bad Batch needs to land on and fuel to reach Naboo. The algorithm should run in O(n^2).
- Reconsruct a path that leads to Naboo with that minimum number of landings. The algorithm should run in O(n^2).
- 
### Deliverables. 
You are required to submit one Java file titled TheBadBatchPath containing the following methods. The class name must be TheBadBatchPath and the class must have a package name csen703.main.assignment2.

- public static Integer TatooineToNabooDP(int [] fuel) that implements a dynamic programming approach to finding the minimum number of landings to reach planet Naboo. Notice that you always land on Naboo anyway.
- public static ArrayList<Integer> TatooineToNabooPath(int [] fuel) that returns an ordered minimum path of the planets indices the BadBatch should land on to reach Naboo. Notice that Tatooine and Naboo are always the start and end of this path. If there are multiple minimum paths, you only return one of them. Notice that using static variables might mess up the test cases, therefore we advise against using static variables. There are other workarounds that you can do.
