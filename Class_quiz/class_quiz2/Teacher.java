package class_quiz2;

public class Teacher {
  private String name;
  private int age;
  private String subject;

  public void print(){
    System.out.println("이 름 : " + getName() + "\t\t나 이 : " + getAge() + "\t\t담당과목 : " + getSubject());
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

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }
}
