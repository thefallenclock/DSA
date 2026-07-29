/*
==========================================================
Problem ID : FPS007
Problem    : Running Sum of 1D Array (In-Place)
Pattern    : Prefix Preprocessing
Difficulty : Easy

Description:
Given an integer array, convert it into its Running Sum Array.

The Running Sum at index i is the sum of all elements from
index 0 to index i.

Modify the original array itself.

Do NOT create another prefix array.

Finally, print the modified array.

------------------------------------------

Example 1:

Input:
4
1 2 3 4

Output:
1 3 6 10

Explanation:

Index 0:
1

Index 1:
1 + 2 = 3

Index 2:
3 + 3 = 6

Index 3:
6 + 4 = 10

------------------------------------------

Example 2:

Input:
5
2 4 1 7 3

Output:
2 6 7 14 17

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
5 10 15 20 25

------------------------------------------

Constraints:
- 1 <= n <= 1000
- -10^6 <= arr[i] <= 10^6

Concepts Used:
- Arrays
- Prefix Sum
- In-Place Modification

Expected Approach:

1. Read the array.
2. Traverse from index 1.
3. Update:
      arr[i] = arr[i] + arr[i - 1]
4. Print the modified array.

Time Complexity:
O(n)

Space Complexity:
O(1)

Author:
Rishi

Status:
Not Solved
==========================================================
*/

import java.util.Scanner;

public class FPS007_RunningSumOf1DArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        System.out.println("Enter the numbers of the array: ");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            arr[i] = sum;
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}

/*
==========================
Learning Notes

Pattern Learned:
- Building a Running Sum Array by modifying the original array.
- Performing Prefix Sum computation in-place.

Mistakes I Made:
- Solved the problem using a separate running sum variable instead of
  the intended in-place recurrence relation.

New Java Methods Learned:
- No new Java methods.

New Concepts Learned:
- Running Sum can be computed without creating a Prefix Sum array.
- The previous running sum is already stored in arr[i - 1].
- In-place recurrence:
      arr[i] = arr[i] + arr[i - 1]
- This achieves O(n) time and O(1) extra space.

Revision Date:
29-07-2026

Confidence (1-10):
10/10

==========================
*/