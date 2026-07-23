/*
==========================================================
Problem ID : FAR007
Problem    : Linear Search
Pattern    : Search Pattern
Difficulty : Easy

Description:
Read the size of an integer array from the user, store all
elements in the array, then read a target value and determine
whether the target exists in the array using Linear Search.

If the element is found, print its index.
Otherwise, print "Element Not Found".

------------------------------------------

Example 1:

Input:
5
10 20 30 40 50
30

Output:
Element Found at Index : 2

Explanation:
30 exists at index 2.

------------------------------------------

Example 2:

Input:
5
10 20 30 40 50
50

Output:
Element Found at Index : 4

Explanation:
50 exists at the last index.

------------------------------------------

Example 3:

Input:
5
10 20 30 40 50
100

Output:
Element Not Found

Explanation:
100 does not exist in the array.

------------------------------------------

Example 4:

Input:
1
99
99

Output:
Element Found at Index : 0

Explanation:
The array contains only one element.

------------------------------------------

Constraints:
- 1 <= n <= 1000
- Elements may be positive, negative, or zero.
- Use Scanner for input.
- Use Linear Search only.
- Do NOT use Arrays.binarySearch().
- Do NOT sort the array.

Concepts Used:
- Scanner
- Dynamic Array
- Array Traversal
- Linear Search
- Conditional Statements
- Early Termination

Expected Approach:

1. Read the array size.
2. Create the array.
3. Read all elements.
4. Read the target element.
5. Traverse the array from left to right.
6. Compare each element with the target.
7. If found, print its index and stop searching.
8. If traversal finishes without finding the target,
   print "Element Not Found".

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

public class FAR007_LinearSearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int index = -1;
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Element found at index : " + index);
        }
        else {
            System.out.println("Element not found");
        }

        sc.close();
    }
}

/*
==========================
Learning Notes

Pattern Learned:
Search Pattern (Linear Search)

Mistakes I Made:
None

New Java Methods Learned:
break statement

New Concepts Learned:
Flag Variable
Early Termination
Linear Search

Revision Date:
22-07-2026

Confidence (1-10):
10

==========================
*/