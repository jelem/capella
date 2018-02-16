import java.util.HashMap;

public class Admin {
  HashMap<Author, Integer> authors;

  private static final String SELECTAUTHORS = "select a.id, a.name, a.age\n"
      + "from authors a\n"
      + ";"
      ;

  public Admin() {
    this.authors  = new HashMap<>();
  }

  public HashMap<Author, Integer> getAuthors() {
    return authors;
  }
}
