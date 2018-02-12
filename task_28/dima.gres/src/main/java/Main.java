public class Main {

  public static void main(String[] args) throws CloneNotSupportedException {
    Person person1 = new Person("John",
        "Murphy",
        new City("Odessa",
            new Country("Ukraine")),
        new PersonalData("KK-32-16-17", "st.Malovskogo 32, r.33", 47));

    Person person2 = person1.copyPerson();

    System.out.println(person1);
    System.out.println(person2);
  }
}
