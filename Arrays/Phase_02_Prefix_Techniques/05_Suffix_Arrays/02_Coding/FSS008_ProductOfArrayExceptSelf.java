/*
==========================================================
Problem ID : FSS008
Problem    : Product of Array Except Self (Without Division)
Pattern    : Prefix + Suffix Preprocessing
Difficulty : Medium

Description:
Given an integer array, construct a new array answer such
that:

answer[i] = product of every element except nums[i].

Do NOT use the division operator.

Return the answer array.

------------------------------------------

Example 1:

Input:
4
1 2 3 4

Output:
24 12 8 6

Explanation:

answer[0]
= 2 × 3 × 4
= 24

answer[1]
= 1 × 3 × 4
= 12

answer[2]
= 1 × 2 × 4
= 8

answer[3]
= 1 × 2 × 3
= 6

------------------------------------------

Example 2:

Input:
5
2 3 4 5 6

Output:
360 240 180 144 120

------------------------------------------

Example 3:

Input:
4
5 1 2 3

Output:
6 30 15 10

------------------------------------------

Example 4:

Input:
1
7

Output:
1

Explanation:

There are no other elements.

The empty product is considered 1.

------------------------------------------

Constraints:
- 1 <= n <= 1000
- -30 <= nums[i] <= 30
- Do NOT use division.

Concepts Used:
- Arrays
- Prefix Product
- Suffix Product
- Preprocessing

Expected Approach:

1. Build Prefix Product Array.
2. Build Suffix Product Array.
3. For every index:

      answer[i]
      =
      prefixLeft
      ×
      suffixRight

4. Print the answer array.

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

public class FSS008_ProductOfArrayExceptSelf {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        System.out.println("Enter the number of the array: ");
        int[] nums = new int[size];
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        // 1 2 3 4

        int[] prefixProduct = new int[n];
        prefixProduct[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefixProduct[i] = prefixProduct[i - 1] * nums[i];
        }
        // 1 2 6 24

        int[] suffixProduct = new int[n];
        suffixProduct[n - 1] = nums[n - 1];
        for (int j = n - 2; j >= 0; j--) {
            suffixProduct[j] = suffixProduct[j + 1] * nums[j];
        }
        // 24 24 12 4

        int[] answer = new int[n];
        for (int k = 0; k < n; k++) {
            int leftProduct = (k == 0) ? 1 : prefixProduct[k - 1];
            int rightProduct = (k == n - 1) ? 1 : suffixProduct[k + 1];
            answer[k] = leftProduct * rightProduct;
        }
        // 24 12 8 6

        System.out.println("Output: ");
        for (int i = 0; i < n; i++) {
            System.out.print(answer[i] + " ");
        }

        sc.close();
    }
}

/*
==========================
Learning Notes

Pattern Learned:
- Combining Prefix Product and Suffix Product Arrays to solve Product of Array Except Self.

Mistakes I Made:
- None.

New Java Methods Learned:
- No new Java methods.

New Concepts Learned:
- Prefix and Suffix preprocessing can be combined to solve problems involving left and right contributions.
- Boundary cases are handled by treating the empty product as 1.
- Complex array problems can often be decomposed into multiple preprocessing passes and a final combination step.

Revision Date:
04-08-2026

Confidence (1-10):
10/10

==========================
*/