# ComparisonOfHeapsortShellsortIntrosort
Comparison of Heapsort, Shellsort and Introsort

![image](https://github.com/SelimErenKarar/ComparisonOfHeapsortShellsortIntrosort/assets/121455925/b5a9ebab-bf52-4133-af1c-fb58d4db9512)

# HeapSort
	Heap sort is a comparison-based sorting technique based on Binary Heap data structure. It is similar to selection sort where we first find the minimum element and place the minimum element at the beginning. We repeat the same process for the remaining elements.
	Heapsort is the fastest in the best case (O(n)). Heap sort's best case is when all elements are the same number.
The worst case of the heapsort is O(nlgn).

# ShellSort
	ShellSort is mainly a variation of Insertion Sort. In insertion sort, we move elements only one position ahead. When an element has to be moved far ahead, many movements are involved. The idea of shellSort is to allow exchange of far items. In shellSort, we make the array h-sorted for a large value of h. We keep reducing the value of h until it becomes 1. An array is said to be h-sorted if all sublists of every h’th element is sorted.
	Shell sort works fastest when numbers were increasing or decreasing (O(nlgn)), but in the worst case, the slowest running shell is sort (O(n2)).
	


# IntroSort
	Introsort (Introspective sort) is a comparison based sort that consists of three sorting phases. They are Quicksort, Heapsort, and Insertion sort. 
The following section shows how the Introsort algorithm is formulated, after reviewing the pros and cons of the respective algorithms.
Quicksort 
The Quicksort is an efficient sorting algorithm but has the worst-case performance of O(N ^ 2) comparisons with O(N) auxiliary space. This worst-case complexity depends on two phases of the Quicksort algorithm. 
1. Choosing the pivot element 
2. Recursion depth during the course of the algorithm

# Heapsort 
  Heapsort has O(nlgn) worst-case time complexity, which is much better than the worst case of Quicksort. So, is it evident that Heapsort is the best? No, the secret of Quicksort is that it does not swap already elements that are already in order, which is unnecessary, whereas with the Heapsort, even if all of the data is already sorted, the algorithm swaps all of the elements to order the array. Also, by choosing the optimal pivot, the worst-case of O(N ^ 2) can be avoided in quicksort. But, the swapping will pay more time in the case of Heapsort that is unavoidable. Hence, Quicksort outperforms Heapsort.
The best things about Heapsort is that, if the recursion depth becomes too large like (log N), the worst case complexity would be still O(nlgn).
 
 # Mergesort 
The Mergesort has the worst case complexity only as O(nlgn). Mergesort can work well on any type of data sets irrespective of its size whereas the Quicksort cannot work well with large data sets. But, Mergesort is not in-place whereas Quicksort is in-place, and that plays a vital role in here. Mergesort goes well with LinkedLists whereas Quicksort goes well with arrays. The locality of reference is better with Quicksort, whereas with Mergesort it is bad. So, for conventional purposes, having memory constraints in hand, Quicksort outperforms Mergesort.
 
 # Insertion sort 
The main advantage of the insertion sort is its simplicity. It also exhibits a good performance when dealing with a small list. The insertion sort is an in-place sorting algorithm so the space requirement is minimal. The disadvantage of the insertion sort is that it does not perform as well as the other sorting algorithms when the size of the data gets larger.
The introsort theoretically works at very close speeds in worst case and best case (O(nlgn)).
According to my tests, introsort runs much slower than other algorithms when all elements are equal.
According to my tests, introsort usually runs faster or at similar speeds than other algorithms when the array has a small number of elements, but as the number of elements in the array increases, it starts to perform slower than other algorithms. Therefore, it may make more sense to use introsort algorithm when working with fewer data.
Introsort works slower than other algorithms when the elements in the array are decreasing.

#Scenario
Since we receive the grades of the students randomly, it would be more logical to use the fastest running algorithm when the data is random.
Since the number of students is high, it is necessary to choose the fastest algorithm when there are many of data.
Considering these, the most logical option is heapsort.
