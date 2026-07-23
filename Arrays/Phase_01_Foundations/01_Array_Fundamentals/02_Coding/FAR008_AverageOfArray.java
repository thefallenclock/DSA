/*
==========================================================
Problem ID : FAR008
Problem    : Average of Array Elements
Pattern    : Accumulator + Arithmetic Computation
Difficulty : Easy

Description:
Read the size of an integer array from the user, store all
elements in the array, calculate the sum of all elements,
and print the average.

The average should be displayed as a decimal number.

------------------------------------------

Example 1:

Input:
5
10 20 30 40 50

Output:
Average : 30.0

Explanation:
Sum = 150
Average = 150 / 5 = 30.0

------------------------------------------

Example 2:

Input:
4
2 4 6 8

Output:
Average : 5.0

Explanation:
Sum = 20
Average = 20 / 4 = 5.0

------------------------------------------

Example 3:

Input:
3
1 2 2

Output:
Average : 1.67

Explanation:
Sum = 5
Average = 5 / 3 ≈ 1.67

------------------------------------------

Example 4:

Input:
1
100

Output:
Average : 100.0

Explanation:
Average of one element is the element itself.

------------------------------------------

Constraints:
- 1 <= n <= 1000
- Elements may be positive, negative, or zero.
- Use Scanner for input.
- Solve using one traversal for summation.
- Do NOT use Streams.

Concepts Used:
- Scanner
- Dynamic Array
- Array Traversal
- Accumulator Pattern
- Arithmetic Computation
- Type Casting

Expected Approach:

1. Read the array size.
2. Create the array.
3. Read all elements.
4. Calculate the sum using one traversal.
5. Convert the sum to double before division.
6. Print the average.

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

public class FAR008_AverageOfArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Write your solution here.



        sc.close();
    }
}

/*
==========================
Learning Notes

Pattern Learned:

Mistakes I Made:

New Java Methods Learned:

New Concepts Learned:

Revision Date:

Confidence (1-10):

==========================
*/