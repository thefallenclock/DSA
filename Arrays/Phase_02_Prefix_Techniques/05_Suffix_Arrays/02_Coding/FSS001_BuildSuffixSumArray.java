/*
==========================================================
Problem ID : FSS001
Problem    : Build Suffix Sum Array
Pattern    : Suffix Preprocessing
Difficulty : Easy

Description:
Given an integer array, construct its Suffix Sum Array.

A Suffix Sum Array stores the sum of all elements from
the current index to the last index.

Print the Suffix Sum Array.

------------------------------------------

Example 1:

Input:
5
2 4 1 7 3

Output:
17 15 11 10 3

Explanation:

suffix[4] = 3

suffix[3] = 7 + 3 = 10

suffix[2] = 1 + 10 = 11

suffix[1] = 4 + 11 = 15

suffix[0] = 2 + 15 = 17

------------------------------------------

Example 2:

Input:
4
1 2 3 4

Output:
10 9 7 4

------------------------------------------

Example 3:

Input:
1
8

Output:
8

------------------------------------------

Example 4:

Input:
5
5 5 5 5 5

Output:
25 20 15 10 5

------------------------------------------

Constraints:
- 1 <= n <= 1000
- -10^6 <= arr[i] <= 10^6

Concepts Used:
- Arrays
- Suffix Sum
- Reverse Traversal

Expected Approach:

1. Read the array.
2. Create a Suffix Sum Array.
3. Traverse from right to left.
4. Build the Suffix Sum Array.
5. Print the Suffix Sum Array.

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

public class FSS001_BuildSuffixSumArray {

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

        for (int i = 0; i < suffixSum.length; i++) {
            System.out.print(suffixSum[i] + " ");
        }

        sc.close();
    }
}

/*
==========================
Learning Notes

Pattern Learned:
- Building a Suffix Sum Array.
- Understanding that suffix sums represent the sum from the current index to the end.

Mistakes I Made:
- None.

New Java Methods Learned:
- No new Java methods.

New Concepts Learned:
- A Suffix Sum Array can be constructed in more than one way.
- Method 1: Mirror the Prefix Sum recurrence by traversing from right to left.
- Method 2: Compute the total sum first, then subtract elements one by one while moving left to right.
- Both approaches have O(n) time complexity.

Revision Date:
31-07-2026

Confidence (1-10):
10/10

==========================
*/