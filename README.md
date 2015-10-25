# Quicksort

In this project, I implemented the simplest Quicksort algorithm and utilized two different select algorithms.
The first pivot was found by selecting the last element in the list, while the second one was found by using the Median of Medians method, which put the list into groups of 5s, found the median of those subgroups, then used the kth (middle) largest element as the pivot.


In theory, the second select algorithm should yield a faster runtime due to its worst-case linear time complexity, while the last element pivot selection should yield a worst-case O(n^2) time. However, after comparing the two runtimes in JUnit, I found that the Median of Medians algorithm caused the runtime to take much longer than the last element selection. This could have been due to the number of comparisons used as well as variable initializations. Optimizing the code may result in faster runtimes.
