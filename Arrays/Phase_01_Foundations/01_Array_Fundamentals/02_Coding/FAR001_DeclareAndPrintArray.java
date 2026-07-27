/*
==========================================================
Problem ID : FAR001
Problem    : Declare and Print an Array
Pattern    : Basic Traversal
Difficulty : Easy

Description:
Declare an integer array, initialize it with predefined values,
and print all elements using a for loop.

------------------------------------------

Example 1:

Input:
No Input

Output:
10 20 30 40 50

Explanation:
The predefined array elements are printed from left to right.

------------------------------------------

Example 2:

Input:
No Input

Output:
5 10 15

Explanation:
The program should work for any predefined integer array.

------------------------------------------

Example 3:

Input:
No Input

Output:
100

Explanation:
Traversal also works correctly for a single-element array.

------------------------------------------

Example 4:

Input:
No Input

Output:

Explanation:
If the array is empty, nothing should be printed.

------------------------------------------

Constraints:
- Use an integer array.
- Traverse the array using a for loop.
- Do NOT use Arrays.toString().
- Do NOT use for-each loop.
- Print elements in the same order as stored.

Concepts Used:
- Array Declaration
- Array Initialization
- Array Traversal
- for Loop
- arr.length

Expected Approach:

1. Declare and initialize an integer array.
2. Traverse the array using a for loop.
3. Print each element separated by a space.

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

public class FAR001_DeclareAndPrintArray {

    public static void main(String[] args) {

        int[] arr = new int[]{10, 20, 30, 40, 50};
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}

/*
==========================
Pattern Learned:
Basic Array Traversal

Mistakes I Made:
None

New Java Methods Learned:
arr.length

New Concepts Learned:
Traversing an array using a for loop

Revision Date:
21-07-2026

Confidence (1-10):
10

==========================
*/