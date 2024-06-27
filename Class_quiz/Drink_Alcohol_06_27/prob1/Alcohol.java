package Quiz_6_27.prob1;

public class Alcohol extends Drink{
  double alcper;

  Alcohol(){}

  Alcohol(String name, int price, int count, double alcper){
    this.name = name;
    this.price = price;
    this.count = count;
    this.alcper = alcper;
  }


  static void printTitle(){
    System.out.println("상품명(도수[%])\t단가\t수량\t금액");
  }

  @Override
  void printData(){
    System.out.println(this.name+"("+alcper+")\t"+this.price + "\t" + this.count + "\t" + getTotalPrice());

  }
}
