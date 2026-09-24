# heap

Heap implementations.

## binary-heap

Make a binary heap out of a list. Doesn't have to be in heap-order.

### example

```
[1,2,5,10,3,7,11,15,17,20,9,15,8,16,21]
```

generates the binary beap

```
Make left node: 2
Make right node: 5
Make left node: 7
Make right node: 11
Make left node: 16
Make right node: 21
Make left node: 15
Make right node: 8
Make left node: 10
Make right node: 3
Make left node: 20
Make right node: 9
Make left node: 15
Make right node: 17
```

(which is correct)

## min-heap

A min heap implementation with add, remove, and reheap-up and reheap-down.

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

