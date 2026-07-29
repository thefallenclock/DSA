/*
==========================================================
Problem ID : FPS006
Problem    : Pivot Index
Pattern    : Prefix Preprocessing
Difficulty : Easy

Description:
Given an integer array, return the leftmost Pivot Index.

A Pivot Index is an index where:

Sum of all elements to the left
=
Sum of all elements to the right.

The current element is NOT included in either sum.

If no Pivot Index exists, print -1.

------------------------------------------

Example 1:

Input:
6
1 7 3 6 5 6

Output:
3

Explanation:

Left Sum
= 1 + 7 + 3
= 11

Right Sum
= 5 + 6
= 11

------------------------------------------

Example 2:

Input:
3
1 2 3

Output:
-1

Explanation:
No Pivot Index exists.

------------------------------------------

Example 3:

Input:
6
2 1 -1 2 1 -1

Output:
0

Explanation:

Left Sum = 0

Right Sum
= 1 + (-1) + 2 + 1 + (-1)
= 2

Not equal.

Checking every index,
the first Pivot Index is 2.

------------------------------------------

Example 4:

Input:
1
10

Output:
0

Explanation:

There are no elements on either side.

------------------------------------------

Constraints:
- 1 <= n <= 1000
- -1000 <= arr[i] <= 1000

Concepts Used:
- Arrays
- Prefix Sum
- Left Sum
- Right Sum

Expected Approach:

1. Read the array.
2. Build the Prefix Sum Array.
3. Compute the total sum.
4. Traverse every index.
5. Compute:
      leftSum
      rightSum
6. If leftSum == rightSum,
   print the first Pivot Index.
7. Otherwise print -1.

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

public class FPS006_PivotIndex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        System.out.println("Enter the numbers of the array: ");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] prefix = new int[arr.length];
        int sum = 0;
        for (int i = 0; i < prefix.length; i++) {
            sum += arr[i];
            prefix[i] = sum;
        }

        int totalSum = prefix[prefix.length - 1];
        int pivot = -1;
        for (int i = 0; i < arr.length; i++) {
            int leftSum = (i == 0) ? 0 : prefix[i - 1];
            int rightSum = (i == arr.length - 1) ? 0 : totalSum - prefix[i];
            if (leftSum == rightSum) {
                pivot = i;
                break;
            }
        }
        System.out.println(pivot);


        sc.close();
    }
}

/*
==========================
Learning Notes

Pattern Learned:
- Finding the leftmost Pivot Index using Prefix Sum.
- Computing left and right sums in O(1).

Mistakes I Made:
- Initially handled the last index separately, but the formula
  totalSum - prefix[i] already returns 0 for the last index.

New Java Methods Learned:
- No new Java methods.

New Concepts Learned:
- Pivot Index and Equilibrium Index follow the same algorithmic pattern.
- Left Sum:
      leftSum = (i == 0) ? 0 : prefix[i - 1]
- Right Sum:
      rightSum = totalSum - prefix[i]
- Prefix Sum helps compute left and right cumulative sums efficiently.

Revision Date:
29-07-2026

Confidence (1-10):
10/10

==========================
*/