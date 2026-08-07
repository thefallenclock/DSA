/*
==========================================================
Problem ID : FDA004
Problem    : Multiple Range Updates
Pattern    : Difference Array Update
Difficulty : Medium

Description:
Given an integer array, perform multiple range updates
using the Difference Array technique.

You are given Q update queries.

Each query consists of:

- L (starting index)
- R (ending index)
- X (value to add)

For every query, add X to every element from index L
to index R.

Do NOT update every element individually.

Apply all updates using the Difference Array and finally
print the updated array.

------------------------------------------

Example 1:

Input:
5
10 20 30 40 50
3
1 3 5
0 2 10
2 4 -3

Output:
20 35 42 42 47

Explanation:

Original:
10 20 30 40 50

Update 1:
+5 on [1,3]

Update 2:
+10 on [0,2]

Update 3:
-3 on [2,4]

Final Array:
20 35 42 42 47

------------------------------------------

Example 2:

Input:
5
1 1 1 1 1
2
0 4 2
1 3 3

Output:
3 6 6 6 3

------------------------------------------

Example 3:

Input:
4
5 10 15 20
1
2 3 5

Output:
5 10 20 25

------------------------------------------

Example 4:

Input:
5
2 4 6 8 10
2
0 1 3
3 4 2

Output:
5 7 6 10 12

------------------------------------------

Constraints:
- 1 <= n <= 1000
- 1 <= Q <= 1000
- 0 <= L <= R < n
- -10^6 <= X <= 10^6

Concepts Used:
- Arrays
- Difference Array
- Multiple Range Updates
- Prefix Sum

Expected Approach:

1. Read the original array.
2. Build the Difference Array.
3. Read Q.
4. Repeat Q times:
      Read L, R and X.
      difference[L] += X
      if (R + 1 < n)
          difference[R + 1] -= X
5. Restore the updated array.
6. Print the final array.

Time Complexity:
O(n + Q)

Space Complexity:
O(n)

Author:
Rishi

Status:
Not Solved
==========================================================
*/

import java.util.Scanner;

public class FDA004_MultipleRangeUpdates {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        System.out.println("Enter the number of difference array: ");
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        int[] difference = new int[size];
        difference[0] = nums[0];
        for (int i = 1; i < size; i++) {
            difference[i] = nums[i] - nums[i - 1];
        }
        int[] updated = new int[size];
        System.out.println("Enter the number of Queries: ");
        int Q = sc.nextInt();
        for (int i = 0; i < Q; i++) {
            System.out.print("\nEnter the initial index: ");
            int start = sc.nextInt();
            System.out.print("\nEnter the ending index: ");
            int end = sc.nextInt();
            System.out.print("\nEnter the difference: ");
            int diff = sc.nextInt();

            difference[start] += diff;
            if (end != size - 1) difference[end + 1] -= diff;

            System.out.println();
        }

        updated[0] = difference[0];
        for (int i = 1; i < size; i++) {
            updated[i] = updated[i - 1] + difference[i];
        }

        System.out.print("\nOutput: ");
        for (int i = 0; i < size; i++) {
            System.out.print(updated[i] + " ");
        }

        sc.close();
    }
}

/*
==========================
Learning Notes

Pattern Learned:
- Performing multiple range updates using a Difference Array.

Mistakes I Made:
- None.

New Java Methods Learned:
- No new Java methods.

New Concepts Learned:
- Multiple range updates can be recorded by modifying only two positions in the Difference Array for each query.
- The original array is restored only once after all updates have been applied.
- This reduces the overall complexity from O(n × Q) to O(n + Q).

Revision Date:
06-08-2026

Confidence (1-10):
10/10

==========================
*/