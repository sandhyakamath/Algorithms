Problem Type: Subset Generation (Power Set Problem)
Algorithm Type: Combinatorial Enumeration
Applications:
Solving problems in set theory, optimization, or search.
Applications in machine learning, computational biology, and more, such as feature selection,
sequence analysis, and combinatorial testing.

Input: A set of n elements.
Output: All possible subsets of the set (2^n subsets).

Approaches:

Recursive Backtracking: Uses depth-first search to explore subset inclusion/exclusion.
Iterative: Uses combinations or builds subsets incrementally.
Bit Manipulation: Uses binary numbers to represent subsets.

Steps in the Algorithm

Regardless of the approach (recursive, iterative, or bit manipulation), the underlying idea involves
systematically exploring all possible combinations of the input elements.

General Algorithm:

Start with an empty subset.
For each element in the input set:
Either include it in the subset or exclude it.
Repeat this process for all elements, generating 2^n subsets.
Return the list of subsets.

Where Does It Fit?

Recursive Approach: Depth-first search algorithm.
Iterative Approach: Combination-building algorithm.
Bit Manipulation: Enumeration-based algorithm using binary logic.
This algorithm is foundational for solving problems in computer science, particularly in scenarios
where subsets need to be evaluated, like decision trees, optimization problems, or data analysis.

Comparison Table
Approach	    Algorithm                       Time-Complexity Space-Complexity  Ease-of-Use Flexibility
Recursion       Backtracking                     O(2^n)          O(n)	          Moderate	   High
Iteration       Iterative Combination Building   O(2^n)          O(2^n)            Easy         Moderate
Bit-Manipulation Binary Representation            𝑂(𝑛×2^𝑛)       O(2^n)            Moderate	   Low

To generate subsets using bit manipulation, each element in the input set can either be
included or excluded from a subset, corresponding to binary representation (0 or 1).
The total number of subsets for a set of size n is 2^n.
Binary Representation of subset of [1,2,3] ie 2^3 = 8. Output: The program outputs all subsets, including the empty set.
000 -> []
001 -> [1]
010 -> [2]
011 -> [1, 2]
100 -> [3]
101 -> [1, 3]
110 -> [2, 3]
111 -> [1, 2, 3]

