# BINARY HEAP

## Balanced Binary Tree
- O(log n) insertion worst time complexity
- O(log n) searching worst time complexity
- O(log n) Removing an element worst time complexity

`Priority Queue will be implemented in binary heap`

## Binary Heap
- inserting an element is O(log n) time complexity
- accessing an element with the highest priority is O(1)
- Removing an element is O(log n) time complexity
- binary heap can be represented as an array
- binary heap can be of two types. MAX HEAP or MIN HEAP
- if the height of the tree is h. the leaf nodes should be at h or h-1
- the heap should form a complete binary tree - all levels should be filled except the child nodes, 
  the child nodes should be filled from the left side
- sd

    ### MIN HEAP
    - the node value should be less than or equal to it's children
    - the smallest element should be at the root node
    
    ### MAX HEAP
    - the node value should be greater than or equal to its children.
    - the largest element should be the root node
    
>In order to represent binary heap we choose array rather than a node based implementation.
>In node based implementation we require pointers to two child nodes as well as the parent node.
> so for every bit of information we need to store 3 additional bits. 
> 
> In an array implementation there is a implicit relation between parent and child nodes


```If parent node is at index i, then left child is at index 2i+1 and right child is at 2i+2 ```

```for a child at index i the parent node will be at (i-1)/2```
<br><br>
This is only possible because it is a complete binary tree.<br>
Heapify is a process in which we reposition an element in a binary heap to the right place.

Sift Down: movement of elements from the top to bottom<br>
Sift Up: movement of elements from the bottom to top
