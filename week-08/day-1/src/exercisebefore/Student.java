package exercisebefore;

public class Student {
  private String name;
  private int age;
  private String gender;
  private String previousOrganization;
  private int skippedDays;

  public Student(String name, int age, String gender, String previousOrganization) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.previousOrganization = previousOrganization;
    this.skippedDays = 0;
  }

  public Student() {
    this.name = "Jane Doe";
    this.age = 30;
    this.gender = "female";
    this.previousOrganization = "TheSchoolOfLife";
    this.skippedDays = 0;

  }

  public void getGoal() {
    System.out.println("Be a junior software developer");

  }

  public void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");

  }

  public void skipDays(int numberOfDays) {
    skippedDays += numberOfDays;
  }

}
