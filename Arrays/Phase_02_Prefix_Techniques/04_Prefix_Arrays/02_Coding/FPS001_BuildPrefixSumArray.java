/*
==========================================================
Problem ID : FPS001
Problem    : Build Prefix Sum Array
Pattern    : Prefix Preprocessing
Difficulty : Easy

Description:
Read an integer array from the user and construct its Prefix
Sum Array.

Do NOT modify the original array.

Create a new array named prefix and store the cumulative sum
up to every index.

Finally, print the prefix array.

------------------------------------------

Example 1:

Input:
5
2 4 1 7 3

Output:
2 6 7 14 17

Explanation:
Each position stores the sum of all elements from index 0
to the current index.

------------------------------------------

Example 2:

Input:
4
5 5 5 5

Output:
5 10 15 20

Explanation:
Each prefix value includes all previous values.

------------------------------------------

Example 3:

Input:
1
8

Output:
8

Explanation:
A single element is its own prefix sum.

------------------------------------------

Example 4:

Input:
5
1 2 3 4 5

Output:
1 3 6 10 15

Explanation:
Each prefix value is the cumulative total up to that index.

------------------------------------------

Constraints:
- 1 <= n <= 1000
- Array elements may be positive, negative, or zero.

Concepts Used:
- Arrays
- Traversal
- Prefix Sum
- Extra Array

Expected Approach:

1. Read the array.
2. Create a prefix array of the same size.
3. Store the cumulative sums.
4. Print the prefix array.

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

public class FPS001_BuildPrefixSumArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] prefix = new int[arr.length];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            prefix[i] = sum;
            System.out.print(prefix[i] + " ");
        }

        sc.close();
    }
}

/*
==========================
Learning Notes

Pattern Learned:
- Prefix Preprocessing
- Building a Prefix Sum Array using cumulative addition

Mistakes I Made:
- Initially used prefix.length in the loop instead of arr.length.
  (The code was correct because both lengths are the same, but using
  arr.length makes the intention clearer.)

New Java Methods Learned:
- No new Java methods.

New Concepts Learned:
- A Prefix Sum Array stores the cumulative sum from index 0 to the current index.
- A separate prefix array is created without modifying the original array.
- Prefix sums can be built using a running sum variable:
      sum += arr[i];
      prefix[i] = sum;
- This approach is equivalent to:
      prefix[i] = prefix[i - 1] + arr[i]

Revision Date:
27-07-2026

Confidence (1-10):
10/10

==========================
*/