package Quiz_6_27.Student_Test;

public class Student {
  private String name;
  private String subject;
  private int fee;
  private double returnFee;

  public Student(){
  }
  public Student(String name, String subject, int fee){
    this.name = name;
    this.subject = subject;
    this.fee = fee;
  }

  public void calcReturnFee(){
    if(subject.equals("javaProgram")){
      returnFee = fee * 0.25; // 25퍼로 계산.
    }
    else if(subject.equals("jspprogram")){
      returnFee = fee * 0.2; // 20퍼로 계산.
    }
    else
    {
      System.out.println("그런 과정명은 없어용 ㅋ");
    }
  }

  public void print(){
    System.out.println(name + "씨의 과정명은 "+subject+" 이고 교육비는 "+ fee +" 이며 환급금은 " + returnFee+" 입니다.");
  }

  public static void main(String args[]){
    Student stu = new Student("차은우", "jspprogram",
        500000);
    stu.calcReturnFee();
    stu.print();
  }

}
