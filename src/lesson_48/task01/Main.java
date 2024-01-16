package lesson_48.task01;

  public class Main {

    public static void main(String[] args) {
     MyArray<String> greetings = new MyArray<>();
      greetings.add("Hello");
      greetings.add("Hey");
      greetings.add("Greetings");
      greetings.add("Hi");

      for (String s : greetings) { // foreach
        System.out.println(s + " world");
      }

      /*
      eta toje samoe
      for (int i = 0; i < greetings.size(); i++) {
        Object s = greetings.get(i);
        System.out.println(s + " world");
      }
       */
    }
}
