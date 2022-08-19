package bridge;

import java.util.LinkedList;

public class LinkedListImpl<T> implements AbstractList<T>{
    LinkedList<T> link;
    public LinkedListImpl(){
        link = new LinkedList<T>();
    }

    @Override
    public void addElement(T obj) {
        link.add(obj);
    }

    @Override
    public T deleteElement(int i) {
        return link.remove(i);
    }

    @Override
    public void insertElement(T obj, int i) {
        link.add(i, obj);
    }

    @Override
    public T getElement(int i) {
        return link.get(i);
    }

    @Override
    public int getElementSize() {
        return link.size();
    }
}
