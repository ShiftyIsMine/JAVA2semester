package chap0808.ex8_1;

public class mainHero {
    public static void main(String[] args){
        Hero ironMan = new Hero("아이어언맨",100,130);
        Hero hulk = new Hero("헐",200,100);

        System.out.println(ironMan); //ironMan.toString()  println에서는 생략가느으ㅡㅇ
        System.out.println(hulk);   //toString()없이 하면 주소 값 나옴ㅇㅇㅇ
    }
}
