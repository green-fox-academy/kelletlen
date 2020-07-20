package greenFoxInheritance;

public class Student extends Person implements Cloneable {
  private String previousOrganization;
  private int skippedDays;

  public Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
    this.skippedDays = 0;
  }

  public Student() {
    this("Jane Doe", 30, "female", "The SchoolOfLife");
  }

  @Override
  public void getGoal() {
    System.out.println("My goal is: Be a junior software developer");
  }

  @Override
  protected String getIntroductionString() {
    return super.getIntroductionString() + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.";
  }

  public void skipDays(int numberOfDays) {

    skippedDays += numberOfDays;
  }

  protected Student clone() {
    return new Student(name, age, gender, previousOrganization);
  }

  @Override
  public String toString() {
    return name;
  }
}
