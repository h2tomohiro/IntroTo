package collections.list;

import java.util.*;


public class MyArrayList implements List, RandomAccess {
    private static final int DEFAULT_SIZE = 10;
    private Object[] elementData;
    private int size;

    public MyArrayList() {
        elementData = new Object[DEFAULT_SIZE];
    }

    public MyArrayList(int initialCapacity) {
        if (initialCapacity >= 0) {
            elementData = new Object[initialCapacity];
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
        }
    }

    public MyArrayList(Collection c) {
        elementData = c.toArray();
    }

    @Override
    public int size() {
        // TODO: Implement Me
        return size;
    }

    @Override
    public boolean isEmpty() {
        // TODO: Implement Me
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }

    @Override
    public Iterator iterator() {
        // DO NOT NEED TO IMPLEMENT
        return null;
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(elementData, size);
    }

    @Override
    public Object[] toArray(Object[] a) {
        // DO NOT NEED TO IMPLEMENT
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        // TODO: Implement Me
        if (size == elementData.length) {
            elementData = grow(size + 1);
        }
        elementData[size] = o;
        size++;
        return true;
    }

    private Object[] grow(int minCapacity) {
        return elementData = Arrays.copyOf(elementData, minCapacity + minCapacity / 2);
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < elementData.length; i++) {
            if (elementData[i] == o) {
                for (int j = i; j < elementData.length - 1; j++) {
                    elementData[j] = elementData[j + 1];
                }
                break;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        for (int i = 0; i < elementData.length; i++) {
            if (elementData[i] == c) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        // TODO: Implement Me
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        boolean flag = true;
        for (Object obj : c) {
            flag &= remove(obj);
        }
        return flag;
    }

    @Override
    public boolean removeAll(Collection c) {
        // TODO: Implement Me
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        if (c == null) {
            throw new NullPointerException("collection is null");
        }
        Iterator itr = iterator();
        boolean found = false;
        while (itr.hasNext()) {
            if (!c.contains(itr.next())) {
                itr.remove();
                found = true;
            }
        }
        return found;
    }

    @Override
    public void clear() {
        // TODO: Implement Me
        for (int i = 0; i < size; i++) {
            elementData[i] = null;
        }
    }

    @Override
    public Object get(int index) {
        // TODO: Implement Me
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return elementData[index];
    }

    @Override
    public Object set(int index, Object element) {
        Objects.checkIndex(index, size);
        Object oldVal = elementData[index];
        elementData[index] = element;
        return oldVal;
    }

    @Override
    public void add(int index, Object element) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + ", size: " + size);
        }
        add(element);

        for (int i = size - 1; i > index; i++) {
            elementData[i] = elementData[i - 1];
        }
        elementData[index] = element;
    }

    @Override
    public Object remove(int index) {
        // TODO: Implement Me
        return null;
    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elementData[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        for (int i = size - 1; i >= 0; i++) {
            if (o.equals(elementData[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public ListIterator listIterator() {
        // DO NOT NEED TO IMPLEMENT
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        // DO NOT NEED TO IMPLEMENT
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        if (fromIndex < 0 || toIndex >= size || fromIndex > toIndex) {
            throw new IndexOutOfBoundsException();
        }
        return null;
    }
}