package greenFoxInheritance;

public class Person {
  private String name;
  private int age;
  private String gender;

  public Person(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  public Person() {
    this.name = "Jane Doe";
    this.age = 30;
    this.gender = "female";
  }

  public void introduce() {

    System.out.println(getIntroductionString());
  }
  public void getGoal() {

    System.out.println("My goal is: live for the moment!");
  }
  protected String getIntroductionString() {
    return "Hi, I'm " + name + ", a " + age + " year old " + gender;
  }
}
