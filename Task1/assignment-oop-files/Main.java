import java.util.*;
public class Main{

  public static void main(String[] args){
    UtilStorage.fillStorage();
    List<Person> persons = Storage.fetchPersons();
    System.out.println(persons);
  }
}
