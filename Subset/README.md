Problem Type: Subset Generation (Power Set Problem)<br>
Algorithm Type: Combinatorial Enumeration <br>
Applications: <br>
Solving problems in set theory, optimization, or search. <br>
Applications in machine learning, computational biology, and more, such as feature selection, <br>
sequence analysis, and combinatorial testing. <br>

Input: A set of n elements. <br>
Output: All possible subsets of the set (2^n subsets). <br>

Approaches: <br>

Recursive Backtracking: Uses depth-first search to explore subset inclusion/exclusion. <br>
Iterative: Uses combinations or builds subsets incrementally. <br>
Bit Manipulation: Uses binary numbers to represent subsets. <br>

Steps in the Algorithm <br>

Regardless of the approach (recursive, iterative, or bit manipulation), the underlying idea involves <br>
systematically exploring all possible combinations of the input elements. <br>

General Algorithm: <br>

Start with an empty subset. <br>
For each element in the input set: <br>
Either include it in the subset or exclude it. <br>
Repeat this process for all elements, generating 2^n subsets. <br>
Return the list of subsets. <br>

Where Does It Fit? <br>

Recursive Approach: Depth-first search algorithm. <br>
Iterative Approach: Combination-building algorithm. <br>
Bit Manipulation: Enumeration-based algorithm using binary logic. <br>
This algorithm is foundational for solving problems in computer science, particularly in scenarios <br>
where subsets need to be evaluated, like decision trees, optimization problems, or data analysis. <br>

Comparison Table <br>
Approach	    Algorithm                       Time-Complexity Space-Complexity  Ease-of-Use Flexibility <br>
Recursion       Backtracking                     O(2^n)          O(n)	          Moderate	   High <br>
Iteration       Iterative Combination Building   O(2^n)          O(2^n)            Easy         Moderate <br>
Bit-Manipulation Binary Representation            𝑂(𝑛×2^𝑛)       O(2^n)            Moderate	   Low <br>

To generate subsets using bit manipulation, each element in the input set can either be <br>
included or excluded from a subset, corresponding to binary representation (0 or 1). <br>
The total number of subsets for a set of size n is 2^n. <br>
Binary Representation of subset of [1,2,3] ie 2^3 = 8. Output: The program outputs all subsets, including the empty set. <br>
000 -> [] <br>
001 -> [1] <br>
010 -> [2] <br>
011 -> [1, 2] <br>
100 -> [3] <br>
101 -> [1, 3] <br>
110 -> [2, 3] <br>
111 -> [1, 2, 3] <br>

