DS
•	To organize and store data.
•	No best Data structure. All used as per requirement.

Algorithms
•	Many algorithms to solve a task.
•	Many implementations of an Algorithm.

Note: Space complexity NOT a big deal as memory is cheap. Time complexity is hardware independent.

Arrays
•	Contiguous block of memory
•	Every element occupies same amount of space in memory (Primitives by default and if we create array of objects, it will store the references of object and not actual object so references will be same size)
•	Finding any element if index is known become simple X + I*Y (X - start address, I – index, Y – size of element)
•	Retrieval when index known: O (1)
•	Retrieval when index NOT known: O (N)
•	Add element to full array: O (N)
•	Add element to array end with space left: O (1)
•	Insert/ Update specific index: O (1)
•	Delete element and set it to null: O (1)
•	Delete elements by shifting elements: O (N)


Sorting Algorithms
1.	Bubble Sort: Largest element bubbles to end.
•	In place algorithm: We don’t have create memory as per the size of input.
•	Time complexity bad: O (N^2)

Note: Stable sort vs Unstable sort : If while sorting we have duplicate elements and we change the relative position of the duplicate element, it will become unstable. Bubble sort is a stable sort algorithm.

2.	Selection Sort: Largest element in each iteration will swap with the last element of unsorted array.
•	In place algorithm: We don’t have create memory as per the size of input.
•	Time complexity bad: O (N^2)
•	Slightly better than bubble sort as less swapping required.
•	Unstable sort algorithm.

3.	Insertion Sort: We consider from left as the sorted array and we keep inserting elements into the sorted array from the unsorted array as per the applicable positon.
•	In place algorithm: We don’t have create memory as per the size of input.
•	Time complexity bad: O (N^2)
•	Stable sort algorithm.

