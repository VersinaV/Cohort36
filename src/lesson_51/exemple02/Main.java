package lesson_51.exemple02;

public class Main {

  public static void main(String[] args) {
    String s1 = "a";
    String s2 = "3";
    String regex = "[abc124]";

    System.out.println(s1.matches(regex));
    System.out.println(s2.matches(regex));
    System.out.println();

    System.out.println("[-]");
    s1 = "g";
    s2 = "3";
    regex = "[a-zA-Z]";

    System.out.println(s1.matches(regex));
    System.out.println(s2.matches(regex));
    System.out.println();

    System.out.println("[.]");
    s1 = "hi";
    s2 = "bye";
    regex = "...";

    System.out.println(s1.matches(regex));
    System.out.println(s2.matches(regex));
    System.out.println();

    System.out.println("^$");
    s1 = "Hi world";
    s2 = "Hello";
    regex = "^Hello$";

    System.out.println(s1.matches(regex));
    System.out.println(s2.matches(regex));
    System.out.println();

    System.out.println("\\d");
    s1 = "Java";
    s2 = "2 Apples";
    regex = "\\d\\s[a-zA-Z]";

    System.out.println(s1.matches(regex));
    System.out.println(s2.matches(regex));
    System.out.println();

    System.out.println("[n+]");
    s1 = "Java";
    s2 = "2 Apples";
    regex = "[a-zA-Z]+";

    System.out.println(s1.matches(regex));
    System.out.println(s2.matches(regex));
    System.out.println();

    System.out.println("[n*]");
    s1 = "I have two apples";
    s2 = "Wow, 10 euro";
    regex = "[a-zA-Z\\s]+\\d*[a-zA-Z\\s]+";

    System.out.println(s1.matches(regex));
    System.out.println(s2.matches(regex));
    System.out.println();

    System.out.println("[n?]");
    s1 = "Hello, my dear friend";
    s2 = "Nice to meet you!!!";
    regex = "[a-zA-Z\\s]+,?[a-zA-Z\\s]+(!!!)?";

    System.out.println(s1.matches(regex));
    System.out.println(s2.matches(regex));
    System.out.println();

    System.out.println("[n{x}]");
    s1 = "Hello!!!";
    s2 = "Nice to meet you!";
    regex = ".+!{3}";

    System.out.println(s1.matches(regex));
    System.out.println(s2.matches(regex));
    System.out.println();

    System.out.println("[n{x,y}]");
    s1 = "Hello!!";
    s2 = "Nice to meet you!!!!";
    regex = "[^!]+!{1,3}";

    System.out.println(s1.matches(regex));
    System.out.println(s2.matches(regex));
    System.out.println();





  }
}
