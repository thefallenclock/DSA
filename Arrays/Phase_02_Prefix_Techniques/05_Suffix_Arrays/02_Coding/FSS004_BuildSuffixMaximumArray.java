/*
==========================================================
Problem ID : FSS004
Problem    : Build Suffix Maximum Array
Pattern    : Suffix Aggregation
Difficulty : Easy

Description:
Given an integer array, construct its Suffix Maximum Array.

A Suffix Maximum Array stores the maximum element
from the current index to the last index.

Print the Suffix Maximum Array.

------------------------------------------

Example 1:

Input:
5
2 4 1 7 3

Output:
7 7 7 7 3

Explanation:

suffixMax[4] = 3

suffixMax[3] = max(7, 3) = 7

suffixMax[2] = max(1, 7) = 7

suffixMax[1] = max(4, 7) = 7

suffixMax[0] = max(2, 7) = 7

------------------------------------------

Example 2:

Input:
5
5 4 3 2 1

Output:
5 4 3 2 1

------------------------------------------

Example 3:

Input:
5
1 2 3 4 5

Output:
5 5 5 5 5

------------------------------------------

Example 4:

Input:
4
8 8 3 8

Output:
8 8 8 8

------------------------------------------

Constraints:
- 1 <= n <= 1000
- -10^6 <= arr[i] <= 10^6

Concepts Used:
- Arrays
- Reverse Traversal
- Suffix Maximum
- Preprocessing

Expected Approach:

1. Read the array.
2. Create a Suffix Maximum Array.
3. Traverse from right to left.
4. Store the maximum seen so far.
5. Print the Suffix Maximum Array.

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

public class FSS004_BuildSuffixMaximumArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        System.out.println("Enter the numbers of the array: ");
        int[] nums = new int[size];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        
        int[] suffixMax = new int[nums.length];
        suffixMax[nums.length - 1] = nums[nums.length - 1];
        int max = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            if (max < nums[i]) {
                max = nums[i];
            }
            suffixMax[i] = max;
        }

        System.out.println("Output: ");
        for (int i = 0; i < suffixMax.length; i++) {
            System.out.print(suffixMax[i] + " ");
        }

        sc.close();
    }
}

/*
==========================
Learning Notes

Pattern Learned:
- Building a Suffix Maximum Array using reverse traversal.

Mistakes I Made:
- None.

New Java Methods Learned:
- No new Java methods.

New Concepts Learned:
- Preprocessing is not limited to sums.
- A Suffix Array can store any cumulative information, 
such as the maximum element from the current index to the end.
- Maintaining a running maximum while traversing from right to left avoids repeated computations.

Revision Date:
31-07-2026

Confidence (1-10):
10/10

==========================
*/