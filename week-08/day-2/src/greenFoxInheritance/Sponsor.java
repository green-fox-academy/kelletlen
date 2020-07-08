package greenFoxInheritance;

public class Sponsor extends Person {
  private String company;
  private int hiredStudents;

  public Sponsor(String name, int age, String gender, String company) {
    super(name, age, gender);
    this.company = company;
    this.hiredStudents = 0;
  }

  public Sponsor() {
    this("Jane Doe", 30, "female", "Google");
  }
  public void hire() {
    hiredStudents +=1;
  }
  public void getGoal() {
    System.out.println("Hire brilliant junior software developers.");
  }
  @Override
  protected String getIntroductionString() {
    return super.getIntroductionString() + " who represents " + company + " and hired " + hiredStudents + " students so far.";
  }
}
