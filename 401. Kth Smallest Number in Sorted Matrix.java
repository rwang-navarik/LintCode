/**
 * Find the kth smallest number in at row and column sorted matrix.
 */

/*
    Example
    Given k = 4 and a matrix:

    [
      [1 ,5 ,7],
      [3 ,7 ,8],
      [4 ,8 ,9],
    ]
    return 5

    -- Similar to LintCode 465
    -- LeetCode 378

 */

/*
    Thoughts:

    inputs: int[][] array, int k
    outputs: int num

    1.create a Data type called Element it should contain three properties
        1.col 2. row  3.val
    2. create a minHeap
    3. traverse all the element in it
    4. put those in a new array and then return the kth element.

    Corner cases: 1. [][] 2. null 3. k < num -> return new int[0]
    regular cases: just do it 

    Runtime O(n)
 */

class Pair {
    public int x, y, val;
    public Pair(int x, int y, int val) {
        this.x = x;
        this.y = y;
        this.val = val;
    }
}

/* This is how to write a comparator outside the method function */
class PairComparator implements Comparator<Pair> {
    public int compare(Pair a, Pair b) {
        return a.val - b.val; /* Ascending */
    }
}

public class Solution {
    public int kthSmallest(int[][] matrix, int k) {

        /* Setting up */
        int[] dx = new int[]{0, 1};
        int[] dy = new int[]{1, 0};
        int n = matrix.length;
        int m = matrix[0].length;
        boolean[][] hash = new boolean[n][m]; /* Recorded the visited */

        /* 
            This comparator:
            1. The size of the PQ;
            2. The comparator that we are gonna use.
        */
        PriorityQueue<Pair> minHeap = new PriorityQueue<Pair>(k, new
            PairComparator());
        minHeap.add(new Pair(0, 0, matrix[0][0]));

        /* Work through */
        // Example
        // Given k = 4 and a matrix:
        //                              minHeap = [1, 3, 4, 5, 7]
        //                                         x  x  x               
        // [
        //   [1 ,5 ,7],                    
        //   [3 ,7 ,8],
        //   [4 ,8 ,9],
        // ]
        // return 5        

        /* Add k num to the min heap and peek the right and down position */
        for (int i = 0; i < k - 1; i++) {
            Pair cur = minHeap.poll();
            for (int j = 0; j < 2; j++) {
                int next_x = cur.x + dx[j];
                int next_y = cur.y + dy[j];
                Pair nextPair = new Pair(next_x, next_y, 0);
                /* next_x, next_y should only be larger than 0*/
                if (next_x < n && next_y < m && !hash[next_x][next_y]) {
                    hash[next_x][next_y] = true;
                    nextPair.val = matrix[next_x][next_y];
                    minHeap.add(nextPair);
                }
            }
        }

        return minHeap.peek().val;

    }
}

/* 
    Declare array in Java:
    int[] myIntArray = new int[3];
    int[] myIntArray = {1,2,3};
    int[] myIntArray = new int[]{1,2,3};    
 */

/*
    1.  Really have to understand the meaning of this problem
    2.  When it comes to the neighbor in matrix, always use the magical number
    to convert the axis! Coz we only got two direction to go and we have to find
    out either go right or down.
        int[] dx = new int[]{0, 1};
        int[] dy = new int[]{1, 0};    
    3.  Write the comparator!!!
    4.  Use hashMap as a way to mark if the element is been visited.
    5.  The situation where we can add the next element in the minHeap. 

    Boundary and visited

        if (next_x < n && next_y < m && !hash[next_x][next_y]) {
            hash[next_x][next_y] = true;
            next_Pair.val = matrix[next_x][next_y];
            minHeap.add(next_Pair);
        }
*/
