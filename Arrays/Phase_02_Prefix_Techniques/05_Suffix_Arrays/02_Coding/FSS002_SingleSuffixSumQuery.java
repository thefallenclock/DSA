/*
==========================================================
Problem ID : FSS002
Problem    : Single Suffix Sum Query
Pattern    : Suffix Preprocessing
Difficulty : Easy

Description:
Given an integer array, build its Suffix Sum Array.

Then read an index.

Print the sum of all elements from the given index
to the last index using the Suffix Sum Array.

------------------------------------------

Example 1:

Input:
5
2 4 1 7 3
2

Output:
11

Explanation:

Suffix Sum Array:
17 15 11 10 3

Suffix Sum starting at index 2:

1 + 7 + 3 = 11

------------------------------------------

Example 2:

Input:
5
1 2 3 4 5
0

Output:
15

------------------------------------------

Example 3:

Input:
5
1 2 3 4 5
4

Output:
5

------------------------------------------

Example 4:

Input:
4
10 20 30 40
1

Output:
90

------------------------------------------

Constraints:
- 1 <= n <= 1000
- -10^6 <= arr[i] <= 10^6
- 0 <= index < n

Concepts Used:
- Arrays
- Suffix Sum
- Preprocessing

Expected Approach:

1. Read the array.
2. Build the Suffix Sum Array.
3. Read the index.
4. Print suffix[index].

Time Complexity:
O(n)

Space Complexity:
O(n)

Author:
Rishi

Status:
Not Solved
==========================================================
*/

import java.util.Scanner;

public class FSS002_SingleSuffixSumQuery {

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

        System.out.println("Enter the query index: ");
        int rangeIndex = sc.nextInt();

        int[] suffixSum = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            suffixSum[i] = sum;
            sum -= nums[i];
        }

        System.out.println(suffixSum[rangeIndex]);

        sc.close();
    }
}

/*
==========================
Learning Notes

Pattern Learned:
- Using a Suffix Sum Array to answer suffix sum queries in O(1) time.

Mistakes I Made:
- None.

New Java Methods Learned:
- No new Java methods.

New Concepts Learned:
- After preprocessing, the suffix sum from any index to the end can be answered with a single array lookup.
- Suffix queries are the mirror image of Prefix queries.
- There are two valid ways to build a Suffix Sum Array:
  1. Total Sum approach.
  2. Right-to-left recurrence approach.

Revision Date:
31-07-2026

Confidence (1-10):
10/10

==========================
*/