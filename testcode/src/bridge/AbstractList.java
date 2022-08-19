package bridge;

public interface AbstractList<T> {
    public void addElement(T obj);
    public T deleteElement(int i);
    public void insertElement(T obj, int i); // 반환값이 왜 int였을까?
    public T getElement(int i);
    public int getElementSize();
}
