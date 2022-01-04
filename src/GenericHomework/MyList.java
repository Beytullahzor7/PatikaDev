package GenericHomework;

import java.util.Arrays;

public class MyList <T> {

    private int size = 0;
    private static final int default_capacity = 10;

    private Object elements[];

    public MyList() {
        elements = new Object[default_capacity];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public int size(){
        return size;
    }

    public int getCapacity(){
        return elements.length;
    }

    public void add(T data){
        if(size == elements.length){
            int newSize = elements.length * 2;
            elements = Arrays.copyOf(elements, newSize);
        }
        elements[size++] = data;
    }

    public T get(int index){
        if(index>= size || index<0){
            return null;
        }
        return (T) elements[index];
    }

    public T remove(int index) {
        if (index >= size || index < 0) {
            return null;
        }
        Object item = elements[index];
        int numberElements = elements.length - (index + 1);
        System.arraycopy(elements, index + 1, elements, index, numberElements);
        size--;
        return (T) item;
    }

    public T set(int index, T data){
        if (index >= size || index < 0) {
            return null;
        }
        T value;
        value = remove(index);
        elements[index] = data;
        return value;
    }






}
