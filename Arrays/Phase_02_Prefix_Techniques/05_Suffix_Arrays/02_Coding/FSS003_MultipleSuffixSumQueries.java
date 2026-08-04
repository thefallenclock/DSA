/*
==========================================================
Problem ID : FSS003
Problem    : Multiple Suffix Sum Queries
Pattern    : Suffix Preprocessing
Difficulty : Easy

Description:
Given an integer array, build its Suffix Sum Array.

Then answer multiple suffix sum queries.

Each query consists of a starting index.

For every query, print the sum of all elements from
that index to the last index.

------------------------------------------

Example 1:

Input:
5
2 4 1 7 3
3
0
2
4

Output:
17
11
3

Explanation:

Suffix Sum Array:
17 15 11 10 3

Query 0 → suffix[0] = 17
Query 2 → suffix[2] = 11
Query 4 → suffix[4] = 3

------------------------------------------

Example 2:

Input:
5
1 2 3 4 5
2
1
3

Output:
14
9

------------------------------------------

Example 3:

Input:
4
10 20 30 40
4
0
1
2
3

Output:
100
90
70
40

------------------------------------------

Constraints:
- 1 <= n <= 1000
- 1 <= Q <= 1000
- 0 <= index < n

Concepts Used:
- Arrays
- Suffix Sum
- Multiple Queries
- Preprocessing

Expected Approach:

1. Read the array.
2. Build the Suffix Sum Array.
3. Read Q.
4. For each query:
      Read the index.
      Print suffix[index].

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

public class FSS003_MultipleSuffixSumQueries {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        System.out.println("Enter the numbers of the array: ");
        int[] nums = new int[size];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
            sum += nums[i];
        }

        int[] suffixSum = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            suffixSum[i] = sum;
            sum -= nums[i];
        }

        System.out.println("Enter the number of queries: ");
        int Q = sc.nextInt();
        int[] answers = new int[Q];
        for (int i = 0; i < Q; i++) {
            int range = sc.nextInt();
            answers[i] = suffixSum[range];
        }

        System.out.println("Outputs: ");
        for (int i = 0; i < Q; i++) {
            System.out.println(answers[i]);
        }

        sc.close();
    }
}

/*
==========================
Learning Notes

Pattern Learned:
- Answering multiple suffix sum queries using a preprocessed Suffix Sum Array.

Mistakes I Made:
- None.

New Java Methods Learned:
- No new Java methods.

New Concepts Learned:
- Preprocessing allows answering many suffix sum queries in O(1) time.
- Storing answers before printing separates computation from output.
- The same preprocessing philosophy applies to both Prefix and Suffix Arrays.

Revision Date:
31-07-2026

Confidence (1-10):
10/10

==========================
*/