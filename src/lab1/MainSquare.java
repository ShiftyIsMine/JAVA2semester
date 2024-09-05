package lab1;
import java.util.Scanner;

public class MainSquare {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Square sq = new Square();
        int a = input.nextInt();
        sq.setLength(a);
        System.out.printf("%d",sq.area(sq.getLength()));
    }
}
