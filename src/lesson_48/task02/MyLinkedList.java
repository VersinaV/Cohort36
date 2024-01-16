package lesson_48.task02;

public class MyLinkedList<E> {

  private static class Node<E> {
    private Node<E> first;
    private int size;

    public void MyLinkedList() {
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
      // silka na perwii element, c nei budem prohoditza do posledniwa elementa
      Node<E> node = first;
      // posle wipolnenie etawa zikla budet zapisan poslednii element
      while (node.hasNext()) {
        // perezapisawaem silku na sledusii element
        node = node.getNext();
      }
      // Sozdaem uzel dle nowowo znacenie
      Node<E> newNode = new Node<>(value);
      // Priwizaewm nowi uzel k tomu, kotorii do etowa bil posledni.
      //Takim obrozawa, dobowleaem nowii element
      node.setNext(newNode);
      //uwelicewaem razmer na 1
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
      // Silka na perwii element, c neee budem prohoditza do posledniwa elementa
      Node<E> node = first;
      // Delaem stoliko sagow, koae znacenie indexa
      for (int i = 0; i < index - 1; i++) {
        // Perezapisawaem silku na sledusii element(eto ii esti odin sag)
        node = node.getNext();
      }
      // Sozdaem uzel dlea nowowo znacenie
      Node<E> newNode = new Node<>(value);
      //Ustanawliwaem dle nowowo uzla sledusim tot uzel, kotorii sledusii dlea towo kotorii mi
      newNode.setNext(node.getNext());
      // Ustanawliwaem dlea tawo uzla kotorii nasli w tikle nowii uzel kak sledusii
      node.setNext(newNode);
      //uwelicewaem razmer na 1
      size++;
    }

    public E get(int index) {
      if (isEmpty()) {
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
