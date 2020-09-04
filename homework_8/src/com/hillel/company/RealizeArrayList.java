package com.hillel.company;

public class RealizeArrayList<T> {
    private int default_size = 10;
    private Object[] array = new Object[default_size];
    private int size = 0;

    public void add(T element){
        if(size == array.length){
            grow(array.length + (array.length / 2));
        }
        array[size++] = element;
    }

    public void add(T element, int index){
        if(index < 0 || index > size )
            throw new IndexOutOfBoundsException("Index is: " + index + " Size is : " + size);
        System.arraycopy(array, index, array, index + 1, size - index);
        array[index] = element;
        size++;
    }

    private void grow(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array,0 , newArray, 0, size);
        array = newArray;
    }

    public int size() {
        return  size;
    }

    public T get(int index){
        if(index < 0 || index > size )
            throw new IndexOutOfBoundsException("Index is: " + index + " Size is : " + size);
        return (T) array[index];
    }

}
