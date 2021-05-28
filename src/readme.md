# Sorting Searching

>We will consider worst time complexity for any algorithm

## Selection Sorting
- Number of comparisons is n pow 2. time complexity O(N2)
- It doesn't require extra space
- O(1) is the space complexity
- It is not a stable sort
- It is not an adaptive sort, even when the list is sorted the process continues

## Bubble Sorting
- Break out of the loop early, if we don't find that we have done any swaps
- The largest element is moved to the end of the list by comparing the adjacent elements.
- O(1) is the space complexity
- O(N2) is the time complexity
- It is an adaptive sort.

## Insertion Sorting
- Insertion sort grows a sorted sub list at every step. the sublist soon grows to be the entire list
- O(N2) is the time complexity
- It is a stable sort. the original order of the entities will be maintained for equal elements
- If you have to choose b/w selection sort, bubble sort and insertion sort. you can choose insertion sort.

## Shell Sorting
- Shell sort is a modified version of insertion short
- Sorting is done based on intervals
- Some optimal sequences used are 
    - Shell's original sequence N/2, N/4, N/8, ....1
    - Knuth's increments: 1,4,13,....,(3^k -1)/2
    - Sedgewick's increments: 1,8,23,....,4j+1+3*2j+1
    - Hibbard's increments: 1,3,7,15,31,63,127....
    - papernov and stasevich increment: 1,3,5,9,17,33,65....
    - pratt: 1,2,3,4,6,9,8,12,18,27...
- Ssdsd



