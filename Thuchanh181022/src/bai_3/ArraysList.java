package bai_3;

public class ArraysList<E> {

        private int size = 0;
        private static final int DEFAULT_CAPACITY = 10;
        private Object[] elements;

        public ArraysList() {
            elements = new Object[DEFAULT_CAPACITY];
        }

        public ArraysList(int capacity) {
            elements = new Object[capacity];
        }

        public Object[] getElements() {
            return elements;
        }

        public int size() {
            return size;
        }

        public void ensureCapacity(int minCapacity) {
            if (size == elements.length) {
                Object[] newElements = new Object[elements.length + minCapacity];
                System.arraycopy(elements, 0, newElements, 0, size);
                elements = newElements;
            }
        }

        public void add(int index, E element) {
            ensureCapacity(1);
            if (index > 0 && index < elements.length) {
                for (int i = size - 1; i >= index; i--) {
                    elements[i + 1] = elements[i];
                }
                elements[index] = element;
            }
            size++;
        }


        public E remove(int index) {
            E element = null;
            if (index > 0 && index < elements.length) {
                element = (E) elements[index];
                for (int i = index; i < size - 1; i++) {
                    elements[i] = elements[i + 1];
                }
            }
            size--;
            return element;
        }

        public boolean contains(E e) {
            for (int i = 0; i < size; i++) {
                if (elements[i].equals(e)) {
                    return true;
                }
            }
            return false;
        }

        public int indexOf(E e) {
            for (int i = 0; i < size; i++) {
                if (elements[i].equals(e)) {
                    return i;
                }
            }
            return -1;
        }

        public boolean add(E e) {
            ensureCapacity(1);
            elements[size] = e;
            size++;
            return true;
        }

        public E get(int index) {
            E element = null;
            if (index > 0 && index < elements.length) {
                element = (E) elements[index];
            }
            return element;
        }

        public void clear() {
            elements = new Object[DEFAULT_CAPACITY];
            size = 0;
        }
//        public Object clone(E element) {
//            Object clone = new Object(element.size());
//            System.arraycopy(element, 0, clone, 0, element.length);
//            return clone;
//        }

}
