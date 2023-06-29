package Array;

public class ContinuousSumQuery {
    /*
    Problem Description
    There are numBeggars beggars sitting in a row outside a temple. Each beggar initially has an empty pot. When the devotees come to the temple, they donate some amount of coins to these beggars. Each devotee gives a fixed amount of coin(according to their faith and ability) to some K beggars sitting next to each other.

    Given the amount P donated by each devotee to the beggars ranging from L to R index, where 1 <= L <= R <= numBeggars, find out the final amount of money in each beggar's pot at the end of the day, provided they don't fill their pots by any other means.
    For ith devotee coinDistribution[i][0] = L, coinDistribution[i][1] = R, coinDistribution[i][2] = P, Given by the 2D array coinDistribution
     */
    public int[] solve(int numBeggars, int[][] coinDistribution) {
        int[] beggars = new int[numBeggars];
        // Initialize all beggars with 0 coins
        for (int i = 0; i < numBeggars; i++) {
            beggars[i] = 0;
        }

// Distribute coins to beggars based on the coinDistribution array
        for (int i = 0; i < coinDistribution.length; i++) {
            int startBeggarIndex = coinDistribution[i][0] - 1; // Adjusting index to start from 0
            int endBeggarIndex = coinDistribution[i][1] - 1; // Adjusting index to start from 0
            int coinsToDistribute = coinDistribution[i][2];

            // Add coins to each beggar within the specified range
            for (int j = startBeggarIndex; j <= endBeggarIndex; j++) {
                beggars[j] += coinsToDistribute;
            }
        }

        return beggars;
    }
}
