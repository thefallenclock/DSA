/*
==========================================================
Problem ID : FDA007
Problem    : Range Update & Point Query
Pattern    : Difference Array Application
Difficulty : Medium

Description:
An integer array of size n is initially filled with zeros.

You are given Q range update queries.

Each query consists of:

- L (starting index)
- R (ending index)
- X (value to add)

Apply all updates using the Difference Array technique.

After all updates have been processed, answer P point
queries.

Each point query consists of a single index.

Print the value present at that index after all updates.

Do NOT perform updates directly on the original array.

------------------------------------------

Example 1:

Input:
5
2
1 3 5
2 4 2
3
0
2
4

Output:
0
7
2

Explanation:

Initially:

0 0 0 0 0

After Query 1:

0 5 5 5 0

After Query 2:

0 5 7 7 2

Point Queries:

Index 0 → 0

Index 2 → 7

Index 4 → 2

------------------------------------------

Example 2:

Input:
4
1
0 3 2
2
1
3

Output:
2
2

------------------------------------------

Example 3:

Input:
6
2
2 5 4
1 3 -2
3
0
2
5

Output:
0
2
4

------------------------------------------

Example 4:

Input:
5
1
0 4 1
5
0
1
2
3
4

Output:
1
1
1
1
1

------------------------------------------

Constraints:
- 1 <= n <= 1000
- 1 <= Q <= 1000
- 1 <= P <= 1000
- 0 <= L <= R < n
- 0 <= index < n
- -10^6 <= X <= 10^6

Concepts Used:
- Arrays
- Difference Array
- Prefix Sum
- Point Queries

Expected Approach:

1. Read n.
2. Create a Difference Array initialized with zeros.
3. Read Q.
4. Apply every range update.
5. Restore the final array using Prefix Sum.
6. Read P.
7. For every point query:
      Read index.
      Print the value at that index.

Time Complexity:
O(n + Q + P)

Space Complexity:
O(n)

Author:
Rishi

Status:
Not Solved
==========================================================
*/

import java.util.Scanner;

public class FDA007_RangeUpdateAndPointQuery {

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

        System.out.print("Enter the number of indices: ");
        int indices = sc.nextInt();
        int[] index = new int[indices];

        for (int i = 0; i < indices; i++) {
            System.out.print("Enter the index: ");
            index[i] = sc.nextInt();
        }

        for (int i = 0; i < indices; i++) {
            System.out.println(difference[index[i]]);
        }

        sc.close();
    }
}

/*
==========================
Learning Notes

Pattern Learned:
- Answering point queries after applying multiple range updates using a Difference Array.

Mistakes I Made:
- None.

New Java Methods Learned:
- No new Java methods.

New Concepts Learned:
- Once the Difference Array is restored, each point query can be answered in O(1) time.
- The preprocessing phase is performed only once, and the reconstructed array can be reused for multiple queries.
- Query indices do not need to be stored; they can be processed immediately after input.

Revision Date:
07-08-2026

Confidence (1-10):
10/10

==========================
*/