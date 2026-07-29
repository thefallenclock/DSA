/*
==========================================================
Problem ID : FPS005
Problem    : Equilibrium Index
Pattern    : Prefix Preprocessing
Difficulty : Medium

Description:
Given an integer array, find the first Equilibrium Index.

An Equilibrium Index is an index such that:

Sum of all elements to its left
=
Sum of all elements to its right.

The element at the current index is NOT included in either
the left sum or the right sum.

If no Equilibrium Index exists, print -1.

------------------------------------------

Example 1:

Input:
5
1 3 5 2 2

Output:
2

Explanation:

Left Sum  = 1 + 3 = 4
Right Sum = 2 + 2 = 4

Hence index 2 is the Equilibrium Index.

------------------------------------------

Example 2:

Input:
5
2 4 6 8 10

Output:
-1

Explanation:
No index satisfies the condition.

------------------------------------------

Example 3:

Input:
1
7

Output:
0

Explanation:
There are no elements on either side.

Left Sum = 0
Right Sum = 0

------------------------------------------

Example 4:

Input:
7
-7 1 5 2 -4 3 0

Output:
3

Explanation:

Left Sum
= -7 + 1 + 5
= -1

Right Sum
= -4 + 3 + 0
= -1

------------------------------------------

Constraints:
- 1 <= n <= 1000
- -10^6 <= arr[i] <= 10^6

Concepts Used:
- Arrays
- Prefix Sum
- Prefix Preprocessing
- Left Sum
- Right Sum

Expected Approach:

1. Read the array.
2. Build the Prefix Sum Array.
3. Traverse every index.
4. Compute:
      leftSum
      rightSum
5. If leftSum == rightSum,
   print the index and stop.
6. If no such index exists,
   print -1.

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

public class FPS005_EquilibriumIndex {

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

        int leftSum, rightSum, end = prefix.length - 1;
        int ans = -1;
        for (int i = 0; i < prefix.length; i++) {
            if (end == 0) {
                ans = 0;
                break;
            }

            if (i == 0) leftSum = 0;
            else leftSum = prefix[i - 1];

            if (i == end) rightSum = 0;
            else rightSum = prefix[end] - prefix[i];

            if (leftSum == rightSum) {
                ans = i;
                break;
            }
        }

        System.out.println(ans);


        sc.close();
    }
}

/*
==========================
Learning Notes

Pattern Learned:
- Finding an Equilibrium Index using Prefix Sum.
- Computing left and right sums in O(1) for each index.

Mistakes I Made:
- Used a 'found' boolean even though printing 'ans' directly was sufficient.
- Added a special case for a single-element array, but the general logic already handled it.

New Java Methods Learned:
- No new Java methods.

New Concepts Learned:
- Left Sum:
      leftSum = (i == 0) ? 0 : prefix[i - 1]
- Right Sum:
      rightSum = totalSum - prefix[i]
- An Equilibrium Index excludes the current element from both sums.
- Prefix Sum can solve problems beyond range queries by deriving left and right cumulative sums.

Revision Date:
28-07-2026

Confidence (1-10):
10/10

==========================
*/