package Bicycle;

public class Bicycle {

    public static void main(String[] args){
        classBicycle b = new classBicycle();
        b.name = "로드형 자전거";
        b.weight = 7.25;
        b.price = 326000;
        System.out.printf("b1=>{%s,%.2f,%d \n",b.name,b.weight,b.price);
    }
}
