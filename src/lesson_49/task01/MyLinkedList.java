package lesson_49.task01;


import java.util.Iterator;

public class MyLinkedList<E> implements Iterable<E> {

  private Node<E> first;
  private int size;

  public MyLinkedList() {
    first = null;
    size = 0;
  }

  public int size() {
    return size;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public void add(E value) {
    if (isEmpty()) {
      size = 1;
      first = new Node<>(value);
      return;
    }
    Node<E> node = first;
    while (node.hasNext()) {
      node = node.getNext();
    }
    Node<E> newNode = new Node<>(value);
    node.setNext(newNode);
    size++;
  }

  public void add(E value, int index) {
    if (index >= size) {
      return;
    }
    if (isEmpty()) {
      size = 1;
      first = new Node<>(value);
      return;
    }
    Node<E> node = first;
    for (int i = 0; i < index - 1; i++) {
      node = node.getNext();
    }
    Node<E> newNode = new Node<>(value);
    newNode.setNext(node.getNext());
    node.setNext(newNode);
    size++;
  }

  public E get(int index) {
    if (isEmpty() || index >= size) {
      return null;
    }
    if (size == 1) {
      return first.getValue();
    }
    Node<E> node = first;
    for (int i = 0; i < index; i++) {
      node = node.getNext();
    }
    return node.getValue();
  }

  public E remove(int index) {
    if (index >= size || isEmpty()) {
      return null;
    }
    Node<E> node = first;
    for (int i = 0; i < index - 1; i++) {
      node = node.getNext();
    }
    E oldValue = node.getNext().getValue();
    node.setNext(node.getNext().getNext());
    size--;
    return oldValue;
  }

  public int indexOf(E value) {
    Node<E> node = first;
    int index = 0;
    while (node.hasNext()) {
      if (node.getValue().equals(value)) {
        return index;
      }
      node = node.getNext();
      index++;
    }
    return -1;
  }

  @Override
  public Iterator<E> iterator() {
    return new MyIterator<>(first);
  }

  private static class MyIterator<E> implements Iterator<E> {

    private Node<E> current;

    public MyIterator(Node<E> first) {
      current = first;
    }

    @Override
    public boolean hasNext() {
      return current != null;
    }

    @Override
    public E next() {
      E oldValue = current.getValue();
      current = current.getNext();
      return oldValue;
    }
  }


  private static class Node<E> {

    private E value;
    private Node<E> next;

    public Node(E value, Node<E> next) {
      this.value = value;
      this.next = next;
    }

    public Node(E value) {
      this(value, null);
    }

    public boolean hasNext() {
      return next != null;
    }

    public E getValue() {
      return value;
    }

    public void setValue(E value) {
      this.value = value;
    }

    public Node<E> getNext() {
      return next;
    }

    public void setNext(Node<E> next) {
      this.next = next;
    }
  }

}

