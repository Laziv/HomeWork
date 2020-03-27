package com.laziv.lesson12.task3;

import java.util.Objects;

public class MyArrayList<E> {
    private static final int MINIMUM_SIZE = 10;
    private int amountOfElements;
    private int lastIndex;
    private E[] array;

    public MyArrayList(int size) {
        amountOfElements = size > MINIMUM_SIZE ? size : MINIMUM_SIZE;

        array = (E[]) new Object[amountOfElements];
    }

    public MyArrayList() {
        this(MINIMUM_SIZE);
    }

    public void add(E element) {
        add(lastIndex, element);
    }

    public void add(int index, E element) {
        if (index <= lastIndex && index >= 0) {
            if (lastIndex == amountOfElements) {
                changeSize();
            }

            if (index != lastIndex) {
                System.arraycopy(array, index, array, index + 1, lastIndex - index);
            }

            array[index] = element;
            lastIndex++;
        } else {
            throw new IndexOutOfBoundsException(" Index: " + index + ", Size: " + lastIndex);
        }
    }

    public E get(int index) {
        if (index < lastIndex && index >= 0) {
            return (E) array[index];
        } else {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + lastIndex);
        }
    }

    public E set(int index, E element) {
        if (index < lastIndex  && index >= 0) {
            E oldValue = array[index];
            array[index] = element;
            return oldValue;
        } else {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + lastIndex);
        }
    }

    public E remove(int index) {
        if (index < lastIndex  && index >= 0) {
            E remoteValue = array[index];

            if (index == lastIndex - 1) {
                array[index] = null;
            }
            else {
                array[index] = null;
                System.arraycopy(array, index + 1, array, index, lastIndex - index);
            }
            lastIndex--;
            return remoteValue;
        } else {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + lastIndex);
        }
    }


    public int size() {
        return lastIndex;
    }


    private void changeSize() {
        amountOfElements += (amountOfElements / 2) + 1;
        E[] arrayTemp = (E[]) new Object[amountOfElements];
        System.arraycopy(array, 0, arrayTemp, 0, lastIndex);
        array = arrayTemp;
    }
}
