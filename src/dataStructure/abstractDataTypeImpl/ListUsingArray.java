package dataStructure.abstractDataTypeImpl;

import dataStructure.abstractDataType.List;

public class ListUsingArray<E> implements List<E> {

   private Object[] arr;
   private static final int DEFAULT_CAPACITY = 10;
   private int capacity;
   private int size;

   public ListUsingArray() {
      this(DEFAULT_CAPACITY);
   }

   public ListUsingArray(int capacity) {
      this.capacity = capacity;
      arr = new Object[this.capacity];
   }

   @Override
   public boolean add(E elem) {
      ensureCapacity();
      arr[size++] = elem;
      return true;
   }

   @Override
   public boolean add(int index, E elem) {
      ensureCapacity();
      System.arraycopy(arr, index, arr, index + 1, size - index);
      arr[index] = elem;
      size++;
      return true;
   }

   @Override
   public E get(int index) {
      return elementData(index);
   }

   @Override
   public void set(int index, E elem) {
      arr[index] = elem;
   }

   @Override
   public boolean contains(Object o) {
      // TODO Auto-generated method stub
      return false;
   }

   @Override
   public int indexOf(Object o) {
      // TODO Auto-generated method stub
      return 0;
   }

   @Override
   public int size() {
      return size;
   }

   @Override
   public E remove(int index) {
      E deletedElem = elementData(index);
      System.arraycopy(arr, index + 1, arr, index, size - index);
      arr[size] = null;
      size--;
      return deletedElem;
   }

   @Override
   public boolean remove(Object o) {
      // TODO Auto-generated method stub
      return false;
   }

   @SuppressWarnings("unchecked")
   private E elementData(int index) {
      return ((E) arr[index]);
   }

   private void ensureCapacity() {
      if (arr.length == size) {
         Object[] arr1 = new Object[size + this.capacity];
         System.arraycopy(arr, 0, arr1, 0, size);
         arr = arr1;
      }
   }

}
