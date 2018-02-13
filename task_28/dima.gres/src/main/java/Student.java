import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Objects;

public class Student implements Externalizable {
  private static final long serialVersionUID = -1;

  private String name;
  private int age;
  private String password;

  public Student() {
  }

  public Student(String name, int age, String password) {
    this.name = name;
    this.age = age;
    this.password = password;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (!(object instanceof Student)) {
      return false;
    }
    Student student = (Student) object;
    return getAge() == student.getAge()
        && Objects.equals(getName(), student.getName())
        && Objects.equals(getPassword(), student.getPassword());
  }

  @Override
  public int hashCode() {

    return Objects.hash(getName(), getAge(), getPassword());
  }

  @Override
  public void writeExternal(ObjectOutput objectOutput) throws IOException {
    objectOutput.writeObject(name);
    objectOutput.writeInt(age);
    objectOutput.writeObject(password);
  }

  @Override
  public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
    name = (String) objectInput.readObject();
    age = objectInput.readInt();
    password = (String) objectInput.readObject();
  }

  @Override
  public String toString() {
    return "Student{"
        + "name='"
        + name
        + '\''
        + ", age="
        + age
        + ", password='"
        + password
        + '\''
        + '}'
        ;
  }
}
