/*
==========================================================
Problem ID : FAR004
Problem    : Sum of Array Elements
Pattern    : Single-Pass Traversal
Difficulty : Easy

Description:
Read the size of an integer array from the user, store all
elements in the array, and calculate the sum of all elements
using a single traversal.

------------------------------------------

Example 1:

Input:
5
10 20 30 40 50

Output:
150

Explanation:
10 + 20 + 30 + 40 + 50 = 150

------------------------------------------

Example 2:

Input:
4
5 5 5 5

Output:
20

Explanation:
The sum of all elements is 20.

------------------------------------------

Example 3:

Input:
1
100

Output:
100

Explanation:
The array contains only one element.

------------------------------------------

Example 4:

Input:
0

Output:
0

Explanation:
The sum of an empty array is 0.

------------------------------------------

Constraints:
- 0 <= n <= 1000
- Elements may be positive, negative, or zero.
- Use Scanner for input.
- Solve using exactly one traversal for summation.
- Do NOT use Streams or Arrays utility methods.

Concepts Used:
- Scanner
- Dynamic Array Creation
- Array Traversal
- Accumulator Pattern
- for Loop

Expected Approach:

1. Read the array size.
2. Create an integer array.
3. Read all elements.
4. Initialize a variable named sum to 0.
5. Traverse the array once.
6. Add every element to sum.
7. Print the final sum.

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

public class FAR004_SumOfArrayElements {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int j = 0; j < n; j++) {
            sum += arr[j];
        }

        System.out.println(sum);

        sc.close();
    }
}

/*
==========================
Pattern Learned:
Accumulator Pattern

Mistakes I Made:
Used n instead of arr.length inside loops.

New Java Methods Learned:
None

New Concepts Learned:
Accumulator variable for computing values during traversal.

Revision Date:
21-07-2026

Confidence (1-10):
10

==========================
*/