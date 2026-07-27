/*
==========================================================
Problem ID : FAR012
Problem    : Count Frequency of a Given Element
Pattern    : Counting
Difficulty : Easy

Description:
Read the size of an integer array from the user.
Then read a target element.
Count how many times the target element appears in the array.

Print the frequency of the target element.

------------------------------------------

Example 1:

Input:
6
2 4 2 7 2 9
2

Output:
Frequency = 3

Explanation:
The element 2 appears three times.

------------------------------------------

Example 2:

Input:
5
1 3 5 7 9
4

Output:
Frequency = 0

Explanation:
The element 4 does not exist.

------------------------------------------

Example 3:

Input:
7
5 5 5 5 5 5 5
5

Output:
Frequency = 7

------------------------------------------

Constraints:
- 1 <= n <= 1000
- Elements may be positive, negative, or zero.
- Solve using a single traversal.

Concepts Used:
- Scanner
- Array Traversal
- Counter
- if Statement

Expected Approach:

1. Read the array.
2. Read the target element.
3. Initialize count = 0.
4. Traverse the array.
5. If the current element equals the target,
   increment count.
6. Print the final count.

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

public class FAR012_CountFrequencyOfGivenElement {

    public static void frequency(int[] arr, int target) {
        int freq = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                freq++;
            }
        }

        System.out.println("Frequency = " + freq);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target: ");
        int target = sc.nextInt();

        frequency(arr, target);

        sc.close();
    }
}

/*
==========================
Learning Notes

Pattern Learned:
Counting

Mistakes I Made:
None

New Java Methods Learned:
None

New Concepts Learned:
A counter variable can be used to count occurrences of any condition while traversing an array.

Revision Date:
26-07-2026

Confidence (1-10):
10

==========================
*/