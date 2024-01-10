package lesson_47.classwork.task03;

public class Main {
/*
Sdelati klass korobka, ii neskoliko klassow, kotorie prestowleaet obekti, kotorie mojno slojiti w korobku

 */

  public static void passToOtherPerson(Box box) {
    Object object = box.take();
    if (object instanceof Cat) {
      System.out.println("There is a cat in the box!");
    } else if (object instanceof Key) {
      System.out.println("There is a key in the box!");
    } else if (object instanceof Smartphone) {
      System.out.println("There is a smartphone in the box!");
    }
  }
  public static void main(String[] args) {
    Cat cat = new Cat();
    Smartphone smartphone = new Smartphone();
    Box<Cat> boxForCat = new Box<>();
    Box<Smartphone> boxForSmartphone = new Box<>();
    boxForSmartphone.put(smartphone);
    boxForCat.put(cat);
   // passToOtherPerson(boxForSmartphone);
    passToOtherPerson(boxForCat);

    Smartphone mySmartphone = boxForSmartphone.take();
    System.out.println(boxForSmartphone.isEmpty());


  }

}
