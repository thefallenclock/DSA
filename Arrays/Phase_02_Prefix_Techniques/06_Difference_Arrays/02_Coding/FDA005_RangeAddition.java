/*
==========================================================
Problem ID : FDA005
Problem    : Range Addition
Pattern    : Difference Array Update
Difficulty : Medium

Description:
You are given an integer array initialized with all zeros.

Also given Q range update queries.

Each query consists of:

- L (starting index)
- R (ending index)
- X (value to add)

For every query, add X to every element from
index L to index R.

Use the Difference Array technique.

After processing all queries, print the final array.

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
10 15 12 2 -3

Explanation:

Initially:

0 0 0 0 0

After Query 1:

0 5 5 5 0

After Query 2:

10 15 15 5 0

After Query 3:

10 15 12 2 -3

------------------------------------------

Example 2:

Input:
4
2
0 3 2
1 2 3

Output:
2 5 5 2

------------------------------------------

Example 3:

Input:
6
1
2 5 4

Output:
0 0 4 4 4 4

------------------------------------------

Example 4:

Input:
5
2
0 4 1
2 3 2

Output:
1 1 3 3 1

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

Expected Approach:

1. Read n.
2. Create a Difference Array initialized with zeros.
3. Read Q.
4. For every query:
      difference[L] += X
      if (R + 1 < n)
          difference[R + 1] -= X
5. Restore the final array using Prefix Sum.
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

public class FDA005_RangeAddition {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] differenceArray = new int[size];

        System.out.print("Enter the number of queries: ");
        int queries = sc.nextInt();

        for (int i = 0; i < queries; i++) {
            System.out.print("Enter the starting index: ");
            int start = sc.nextInt();
            System.out.print("Enter the ending index: ");
            int end = sc.nextInt();
            System.out.print("Enter the difference: ");
            int difference = sc.nextInt();

            differenceArray[start] += difference;
            if (end != size - 1) differenceArray[end + 1] -= difference;
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += differenceArray[i];
            differenceArray[i] = sum;
            System.out.print(differenceArray[i] + " ");
        }   
            
        sc.close();
    }
}

/*
==========================
Learning Notes

Pattern Learned:
- Performing multiple range additions on an initially zero array using a Difference Array.

Mistakes I Made:
- None.

New Java Methods Learned:
- No new Java methods.

New Concepts Learned:
- A Difference Array can represent an initially zero array without explicitly creating the original array.
- After processing all updates, the final array is obtained by taking the Prefix Sum of the Difference Array.
- The Difference Array itself can be overwritten during reconstruction to save memory.

Revision Date:
06-08-2026

Confidence (1-10):
10/10

==========================
*/