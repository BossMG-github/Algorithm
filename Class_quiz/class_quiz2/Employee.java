package class_quiz2;

public class Employee {
  private String name;
  private int age;
  private String dept;

  public void print(){
    System.out.println("이 름 : " + getName() + "\t\t나 이 : " + getAge() + "\t\t부 서 : " + getDept());
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

  public String getDept() {
    return dept;
  }

  public void setDept(String dept) {
    this.dept = dept;
  }
}
