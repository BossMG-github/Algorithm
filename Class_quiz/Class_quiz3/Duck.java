package Class_quiz3;

public class Duck {
  String name;
  String legs;
  String length;

  public void setName(String name){
    this.name = name;
  }

  public void fly(){
    System.out.println("오리("+name+")는 날지 않습니다.");
  }
  public void sing(){
    System.out.println("오리("+name+")가 소리내어 웁니다.");
  }
  public String toString(){
    return "오리의 이름은 " + name+" 입니다.";
  }
}
