/*
==========================================================
Problem ID : FAR002
Problem    : Read and Print an Array
Pattern    : Basic Traversal
Difficulty : Easy

Description:
Read the size of an integer array from the user, create the
array dynamically, take all elements as input, and print
them in the same order using a for loop.

------------------------------------------

Example 1:

Input:
5
10 20 30 40 50

Output:
10 20 30 40 50

Explanation:
The array contains five elements, which are printed in the
same order.

------------------------------------------

Example 2:

Input:
3
5 10 15

Output:
5 10 15

Explanation:
The program should work correctly for any valid array size.

------------------------------------------

Example 3:

Input:
1
100

Output:
100

Explanation:
The program should correctly handle a single-element array.

------------------------------------------

Example 4:

Input:
0

Output:

Explanation:
An empty array has no elements to print.

------------------------------------------

Constraints:
- 0 <= n <= 1000
- Use Scanner for input.
- Store the elements inside an integer array.
- Print using a for loop.
- Do NOT use Arrays.toString().
- Do NOT use for-each loop.

Concepts Used:
- Scanner
- Array Creation
- Dynamic Array Size
- Array Traversal
- for Loop
- arr.length

Expected Approach:

1. Read the size of the array.
2. Create an integer array of size n.
3. Read all elements using a loop.
4. Traverse the array again.
5. Print every element separated by a space.

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

public class FAR002_ReadAndPrintArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int in = sc.nextInt();

        int[] arr = new int[in];
        for (int i = 0; i < in; i++) {
            arr[i] = sc.nextInt();
        }

        for (int j = 0; j < in; j++) {
            System.out.print(arr[j] + " ");
        }


        sc.close();
    }
}

/*
==========================
Pattern Learned:
Dynamic Array Creation & Traversal

Mistakes I Made:
Used "in" instead of a more meaningful variable name.

New Java Methods Learned:
Scanner.nextInt()

New Concepts Learned:
Creating arrays with runtime size using new int[n].

Revision Date:
21-07-2026

Confidence (1-10):
10

==========================
*/