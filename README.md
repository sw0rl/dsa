# dsa
Data Structures &amp; Algorithms

Oh, the infamous Data Structures & Algorithms.

(20/12/2020) Binary Tree {with Search} - Java (BinarySearchTree.java):

I created a binary tree by creating a Node class with has left Node object, right Node object and Integer value. Inside it there are functions that allow you to add nodes, get the node value and the value of the left or right node. There is a dfs(); function allowing all the nodes connected to the parent and children nodes to be explored using a depth-first search. Then for the main tree, it has a root Node object and an inTree(); function that searches for a value n and returns a true/false value if it is in the tree or not. There is a traverse(); function also allowing the tree to be traversed depth-first. Essentially, the Tree object is just a wrapper for the Node object.

(20/12/2020) Two Numbers to get a Target Sum - Java (TwoNumberSum.java):

Given an integer array, is there two numbers that sum to a given target sum. A way of solving this question is by creating a hash set (for scalability) and finding out if the hash set contains an integer (targetSum - arr[i]). (Complexity O(n)?).
