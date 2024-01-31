package lesson_55;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main01 {
  /*
  Разработчики Олег, Лена, Маша, Даня сейчас работают дизайном и интерфейсом сайта
  Разработчики Маша, Вася, Петя работают над базой данных
  Разработчики Даня, Петя, Олег, Илья, Дима работают над бекендом сайта
  Разработчики Вася и Лена работают над связыванием этого всего в единый продукт.
   */


  public static void main(String[] args) {
    List<String> frontEndTeam = List.of("Олег", "Лена", "Маша", "Даня");
    List<String> databaseTeam = List.of("Маша", "Вася", "Петя");
    List<String> backendTeam = List.of("Даня", "Петя", "Олег", "Илья", "Дима");
    List<String> developerTeam = List.of("Вася", "Лена");

    Set<String> fullStackTeam = new HashSet<>();
    fullStackTeam.addAll(frontEndTeam);
    fullStackTeam.addAll(databaseTeam);
    fullStackTeam.addAll(backendTeam);
    fullStackTeam.addAll(developerTeam);

    System.out.println("Team: " + fullStackTeam);
    System.out.println("Members amount: " + fullStackTeam.size());


  }

}
