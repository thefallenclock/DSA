/*
==========================================================
Problem ID : FDA009
Problem    : Maximum Value After All Range Updates
Pattern    : Difference Array Master Challenge
Difficulty : Medium

Description:
An integer array of size n is initially filled with zeros.

You are given Q range update queries.

Each query consists of:

- L (starting index)
- R (ending index)
- X (value to add)

Apply all updates using the Difference Array technique.

After all updates have been processed,
find the maximum value present in the final array.

Print only the maximum value.

Do NOT update every element individually.

------------------------------------------

Example 1:

Input:
5
3
1 3 5
0 2 10
2 4 -3

Output:
15

Explanation:

Initially:

0 0 0 0 0

After Query 1:

0 5 5 5 0

After Query 2:

10 15 15 5 0

After Query 3:

10 15 12 2 -3

Maximum = 15

------------------------------------------

Example 2:

Input:
4
2
0 3 2
1 2 3

Output:
5

Explanation:

Final Array:

2 5 5 2

Maximum = 5

------------------------------------------

Example 3:

Input:
6
1
2 5 4

Output:
4

Explanation:

Final Array:

0 0 4 4 4 4

Maximum = 4

------------------------------------------

Example 4:

Input:
5
2
0 4 -1
2 2 5

Output:
4

Explanation:

Final Array:

-1 -1 4 -1 -1

Maximum = 4

------------------------------------------

Constraints:
- 1 <= n <= 1000
- 1 <= Q <= 1000
- 0 <= L <= R < n
- -10^6 <= X <= 10^6

Concepts Used:
- Arrays
- Difference Array
- Prefix Sum
- Multiple Range Updates
- Maximum Element

Expected Approach:

1. Read n.
2. Create a Difference Array initialized with zeros.
3. Read Q.
4. Apply every range update.
5. Restore the final array using Prefix Sum.
6. Find the maximum element.
7. Print the maximum.

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

public class FDA009_MaximumValueAfterAllRangeUpdates {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] difference = new int[size];
        System.out.print("Enter the number of queries: ");
        int queries = sc.nextInt();
        for (int i = 0; i < queries; i++) {
            System.out.print("Enter the starting index: ");
            int start = sc.nextInt();
            System.out.print("Enter the ending index: ");
            int end = sc.nextInt();
            System.out.print("Enter the difference: ");
            int differ = sc.nextInt();

            difference[start] += differ;
            if (end != size - 1) difference[end + 1] -= differ;
        }

        for (int i = 1; i < size; i++) {
            difference[i] += difference[i - 1];
        }

        int max = difference[0];
        for (int i = 1; i < size; i++) {
            max = Math.max(max, difference[i]);
        }

        System.out.print("Output: " + max);

        sc.close();
    }
}

/*
==========================
Learning Notes

Pattern Learned:
- Using a Difference Array to perform multiple range updates efficiently and then extracting the maximum value from the reconstructed array.

Mistakes I Made:
- None.

New Java Methods Learned:
- Math.max()

New Concepts Learned:
- The preprocessing phase (Difference Array + Prefix Sum restoration) remains the same across many problems.
- Different interview questions often require different post-processing steps (printing, counting, querying, finding the maximum) after reconstruction.
- The restoration and post-processing can often be combined into a single traversal for better efficiency.

Revision Date:
07-08-2026

Confidence (1-10):
10/10

==========================
*/