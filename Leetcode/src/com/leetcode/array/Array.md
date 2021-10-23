# Array in Java

## Summary
- All Arrays are dynamically allocated.<br> 
First, you must declare a variable of the desired array type. Second, you must allocate the memory that will hold the array, using new, and assign it to the array variable. Thus, in Java all arrays are dynamically allocated.<br>
 Ex: int[] arr = new int[5];
<br>
- Each variables in the array have an index beginning from 0.
<br>
- **Arrays are objects**, Can find their length using the object property **length**
<br>
- The size of an array must be specified by an int or short value and not long. 
<br>int[] arr = new int[**int/short**];
<br>
- Every array type implements the interfaces Cloneable and java.io.Serializable.

### Notes 
- [Default Array Values](./DefaultArray.java)
<br>
- we try to access element outside the array size ==> **ArrayIndexOutOfBoundsException**
<br>
- [clone() array](./CopyArray.java):

>
``a single dimensional array(Object[]) => deep copy``<br>
``a multi-dimensional array(Object[][]) => shallow copy``


![Deep copy in a single dimensional array](https://media.geeksforgeeks.org/wp-content/cdn-uploads/Blank-Diagram-Page-1-11.jpeg)
<br>
![shallow copy in a multi-dimensional array](https://media.geeksforgeeks.org/wp-content/cdn-uploads/Blank-Diagram-Page-1-12.jpeg)
