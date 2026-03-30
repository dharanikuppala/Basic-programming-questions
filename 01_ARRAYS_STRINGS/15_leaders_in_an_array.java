/*
Q – Leaders in an Array

Problem Statement
Given an array of integers, print all the leaders in the array.
An element is said to be a leader if it is greater than or equal to all the elements to its right.
The rightmost element is always a leader.

Input Format
The first line contains an integer N — the size of the array
The second line contains N space-separated integers

Output Format
Print all the leaders in the array in the order they appear

Sample Input
6
16 17 4 3 5 2

Sample Output
17 5 2
Explanation (VERY IMPORTANT for interviews)

Traverse from right to left:

2 → leader (rightmost)
5 → greater than 2 → leader
3 → not greater than 5 → ❌
4 → not greater than 5 → ❌
17 → greater than 5 → leader
16 → not greater than 17 → ❌

Leaders = 17 5 2

💡 Key Pattern = Right → Left traversal + track max
*/
