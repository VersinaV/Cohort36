package lesson_54.exemple06;

public class Main {

  public static void main(String[] args) {
  WebTabHistory tabHistory = new WebTabHistory("https://www.google.com");
    tabHistory.goToPage("https://www.google.com/search?q=java");
    tabHistory.goToPage("https://www.java.com/en/");
    tabHistory.goToPage("https://www.java.com/en/download/");

    System.out.println("Currently on page: " + tabHistory.getCurrentPage());
    System.out.println("Going back to times...");
    tabHistory.goBack();
    tabHistory.goBack();
    System.out.println("Currently on page: " + tabHistory.getCurrentPage());

    System.out.println("Going forward");
    tabHistory.goForward();
    System.out.println("Currently on page: " + tabHistory.getCurrentPage());
  }
}
