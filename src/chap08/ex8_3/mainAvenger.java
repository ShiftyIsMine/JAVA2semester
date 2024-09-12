package chap08.ex8_3;

public class mainAvenger {
    public static void main(String[] args) {
        Avenger thor = new Avenger("토르",150);
        Avenger enemy = new Avenger("타노스",160);
        thor.punch(enemy);
        thor.punch(thor);
        enemy.punch(thor);
    }
}
