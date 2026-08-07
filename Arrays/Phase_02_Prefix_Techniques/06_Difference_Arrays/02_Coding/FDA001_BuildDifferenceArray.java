/*
==========================================================
Problem ID : FDA001
Problem    : Build Difference Array
Pattern    : Difference Preprocessing
Difficulty : Easy

Description:
Given an integer array, construct its Difference Array.

The Difference Array is defined as:

difference[0] = arr[0]

For every index i > 0:

difference[i] = arr[i] - arr[i - 1]

Print the Difference Array.

------------------------------------------

Example 1:

Input:
5
10 20 30 40 50

Output:
10 10 10 10 10

Explanation:

difference[0] = 10

difference[1] = 20 - 10 = 10

difference[2] = 30 - 20 = 10

difference[3] = 40 - 30 = 10

difference[4] = 50 - 40 = 10

------------------------------------------

Example 2:

Input:
5
2 5 9 14 20

Output:
2 3 4 5 6

------------------------------------------

Example 3:

Input:
4
7 7 7 7

Output:
7 0 0 0

------------------------------------------

Example 4:

Input:
5
5 3 8 2 9

Output:
5 -2 5 -6 7

------------------------------------------

Constraints:
- 1 <= n <= 1000
- -10^6 <= arr[i] <= 10^6

Concepts Used:
- Arrays
- Difference Array
- Traversal
- Subtraction

Expected Approach:

1. Read the array.
2. Create a Difference Array.
3. Store:
      difference[0] = arr[0]
4. For every remaining index:
      difference[i] = arr[i] - arr[i - 1]
5. Print the Difference Array.

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

public class FDA001_BuildDifferenceArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        System.out.println("Enter the numbers of the array: ");
        int[] nums = new int[size];
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Output: ");
        int[] difference = new int[n];
        difference[0] = nums[0];
        for (int i = 1; i < n; i++) {
            difference[i] = nums[i] - nums[i - 1];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(difference[i] + " ");
        }

        sc.close();
    }
}

/*
==========================
Learning Notes

Pattern Learned:
- Constructing a Difference Array from an original array.

Mistakes I Made:
- None.

New Java Methods Learned:
- No new Java methods.

New Concepts Learned:
- A Difference Array stores the change between consecutive elements instead of cumulative information.
- The first element of the Difference Array is always the same as the first element of the original array.
- Difference Arrays are the inverse concept of Prefix Sums.

Revision Date:
05-08-2026

Confidence (1-10):
10/10

==========================
*/