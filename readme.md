# heap

Heap implementations.

## binary-heap

Make a binary heap out of a list. Doesn't have to be in heap-order. I sort of stretch the definition of a heap to simply be a mapping between a list and a binary tree. It's helpful I think.

### example

```
[21,19,17,16,14,18,12,9,6,4,1]
```

generates the binary tree

```
21: [19: [16: [9: [none, none], 6: [none, none]], 14: [4: [none, none], 1: [none, none]]], 17: [18: [none, none], 12: [none, none]]]
```

in other words

```
                                     21
                                     /\
                                    /  \
                                   /    \
                                  /      \
                                 19       17
                                / \      / \
                               /   \    /   \
                              16    14 18   12 
                             / \   / \
                            9  6  4   1
```

## min-heap

A min-heap implementation with add, remove, and reheap-up and reheap-down.

### example

Adding the sequence

```
[21,19,17,16,14,18,12,9,6,4,1]
```

builds the Min-Heap
 
```
                                      1
                                     /\
                                    /  \
                                   /    \
                                  /      \
                                 4        6
                                / \      / \
                               /   \    9  19
                              14   12  
                             / \   / \
                            16 21 17 18
```

and then repeatedly removing index 0 and reheaping downward results in the sorted list

```
[1,4,6,9,12,14,16,17,18,19,21]
```

a.k.a heapsort.

## t-min-heap

A min-heap implementation that keeps track of a partner `<T>` value. Basically a generic priority queue. Useful for maintaining heaps of nodes, edges, etc.

### example

```
[21, 17, 19]
[1, 2, 3]
```

is sorted into

```
[17, 19, 21]
[2, 3, 1]
```

in O(nlogn) time.
