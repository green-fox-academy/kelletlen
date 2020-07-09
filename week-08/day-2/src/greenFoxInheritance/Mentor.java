package greenFoxInheritance;

public class Mentor extends Person {
  private String level;

  public Mentor(String name, int age, String gender, String level) {
    super(name, age, gender);
    this.level = level;
  }

  public Mentor() {
    this("Jane Doe", 30, "female", "intermediate");
  }
  public void getGoal () {
    System.out.println("My goal is: Educate brilliant junior software developers.");
  }
  @Override
  protected String getIntroductionString() {
    return super.getIntroductionString() + level + " mentor.";
  }


}
