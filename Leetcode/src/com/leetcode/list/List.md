# List interface

## sử dụng - Operations in a List interface

1. Operation 1:  Adding elements to List class using add() method

```
- add(Object): This method is used to add an element at the end of the List.
	Chèn vào cuối list
- add(int index, Object): This method is used to add an element at a specific index in the List
	Chèn vào vị trí index
```

2. Operation 2: Updating elements

using the set() method to change is referenced by the index of the element. Therefore, this method takes an index and the updated element which needs to be inserted at that index. 

3. Operation 3: Removing Elements

```
- remove(Object): Phương thức này được sử dụng để loại bỏ một đối tượng khỏi List một cách đơn giản. Nếu có nhiều đối tượng như vậy, thì lần xuất hiện đầu tiên của đối tượng đó sẽ bị loại bỏ.
- remove(int index): Vì một List được lập chỉ mục, nên phương thức này nhận một giá trị số nguyên, điều này chỉ đơn giản là loại bỏ phần tử hiện diện tại chỉ mục cụ thể đó trong List. Sau khi loại bỏ phần tử, tất cả các phần tử được di chuyển sang bên trái để lấp đầy khoảng trống và chỉ số của các đối tượng được cập nhật.
```

