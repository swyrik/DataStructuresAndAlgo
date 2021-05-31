# Searching

## Linear Search
- linear search will be performed on sorted or unsorted list
- O(N) is the time complexity

## Binary Search
- binary search operates on divide and conquer strategy
- O(log n) is the time complexity
- binary search wil be performed on a sorted items.
- mid index = (first index + last index)/2

## Jump Search
- jump search is an improvement than linear search
- for best performance the jump length should be Math.floor(Math.sqrt(arr.length));
- O(N/M + (M-1)) is the time complexity
    - N length of array
    - M jump length
- O(sqrt(n)) is the best time complexity

## Interpolation Search
- It is an improvement over binary search
- mid index = firstIndex + ( (data - arr[firstIndex]) * (lastIndex - firstIndex) )/ (arr[lastIndex] - arr[firstIndex]);
- interpolation search will be perform well for an evenly distributed elements
