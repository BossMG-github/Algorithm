package Class_quiz3;

public class Account {
  String accNo;
  int balance;

  public void setAccNo(String accNo){
    this.accNo = accNo;
    System.out.println(this.accNo +" 계좌가 개설되었습니다.");
  }
  public void save(int x){
    balance += x;
    System.out.println(this.accNo + " 계좌에 " + x +"만원이 입금되었습니다.");
  } // 입금
  public void deposit(int x){
    balance -= x;
    System.out.println(this.accNo + " 계좌에 " + x +"만원이 출금되었습니다.");
  } // 출금

  public int getBalance(){
    return balance;
  }
  public String getAccNo(){
    return accNo;
  }

}
