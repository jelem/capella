public class PersonalData {
  private String passport;
  private String adress;
  private int  age;

  public PersonalData() {
  }

  public PersonalData(String passport, String adress, int age) {

    this.passport = passport;
    this.adress = adress;
    this.age = age;
  }

  public String getPassport() {
    return passport;
  }

  public void setPassport(String passport) {
    this.passport = passport;
  }

  public String getAdress() {
    return adress;
  }

  public void setAdress(String adress) {
    this.adress = adress;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
