package Quiz_6_27.prob1;

public class Drink {
  String name;
  int price;
  int count;

  Drink(){}

  Drink(String name, int price, int count){
    this.name = name;
    this.price = price;
    this.count = count;
  }

  int getTotalPrice(){
    return price*count;
  }
  static void printTitle(){
    System.out.println("상품명\t단가\t수량\t금액");
  }

  void printData(){
    System.out.println(this.name+"\t"+this.price + "\t" + this.count + "\t" + getTotalPrice());
  }

}
