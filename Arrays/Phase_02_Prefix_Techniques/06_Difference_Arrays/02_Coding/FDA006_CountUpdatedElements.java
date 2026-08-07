/*
==========================================================
Problem ID : FDA006
Problem    : Count Updated Elements
Pattern    : Difference Array Application
Difficulty : Medium

Description:
An integer array of size n is initially filled with zeros.

You are given Q range update queries.

Each query consists of:

- L (starting index)
- R (ending index)
- X (value to add)

After applying all updates using the Difference Array
technique, count how many elements are greater than zero.

Print only the count.

Do NOT update every element individually.

------------------------------------------

Example 1:

Input:
5
2
1 3 5
2 4 -3

Output:
3

Explanation:

Initially:

0 0 0 0 0

After Query 1:

0 5 5 5 0

After Query 2:

0 5 2 2 -3

Elements > 0:

5
2
2

Count = 3

------------------------------------------

Example 2:

Input:
4
1
0 3 2

Output:
4

------------------------------------------

Example 3:

Input:
5
2
0 4 -1
2 2 5

Output:
1

Explanation:

Final Array:

-1 -1 4 -1 -1

Only one element is positive.

------------------------------------------

Example 4:

Input:
6
3
1 5 2
2 4 -1
0 0 3

Output:
6

Explanation:

Final Array:

3 2 1 1 1 2

All six elements are greater than zero.

------------------------------------------

Constraints:
- 1 <= n <= 1000
- 1 <= Q <= 1000
- -10^6 <= X <= 10^6

Concepts Used:
- Arrays
- Difference Array
- Prefix Sum
- Counting

Expected Approach:

1. Read n.
2. Create a Difference Array initialized with zeros.
3. Read Q.
4. Apply every range update.
5. Restore the array using Prefix Sum.
6. Count how many elements are greater than zero.
7. Print the count.

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

public class FDA006_CountUpdatedElements {

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
        
        int greaterThanZero = 0;
        for (int i = 0; i < size; i++) {
            if (difference[i] > 0) greaterThanZero++;
        }

        System.out.print("Output: " + greaterThanZero);

        sc.close();
    }
}

/*
==========================
Learning Notes

Pattern Learned:
- Applying multiple range updates using a Difference Array and extracting information from the reconstructed array.

Mistakes I Made:
- None.

New Java Methods Learned:
- No new Java methods.

New Concepts Learned:
- A Difference Array can be restored in-place using:
      difference[i] += difference[i - 1]
- After reconstruction, the array can be processed for any objective (counting, searching, finding maximum, etc.).
- Preprocessing remains unchanged; only the post-processing logic varies.

Revision Date:
07-08-2026

Confidence (1-10):
10/10

==========================
*/