import java.util.HashMap;

public class Admin {
  HashMap<Author, Integer> authors;

  public Admin() {
    this.authors  = new HashMap<>();
  }

  public HashMap<Author, Integer> getAuthors() {
    return authors;
  }
}
