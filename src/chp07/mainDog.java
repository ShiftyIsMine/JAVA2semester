package chp07;
import java.util.Scanner;

public class mainDog {
    public static void main(String[] args) {
        Dog d = new Dog();
        Dog d2 = new Dog();

        d.setName("꼬미");
        d.setBreeds("말티즈");
        d.setAge(8);

        d2.setName("바우");
        d2.setBreeds("비숑");
        d2.setAge(2);

        System.out.printf("d1 => (name: %s, breeds: %s, age: %d)\n ", d.getName(), d.getBreeds(), d.getAge());
        System.out.printf("d2 => (name: %s, breeds: %s, age: %d)\n ", d2.getName(),d2.getBreeds(),d2.getAge());

        d.wag();
        d2.wag();

        d.bark(3,"왈왕뢍뢍뢍뢍뢍롱라ㅘ");
        d2.bark(4,"멍멈ㅇ머엄엄엄어어");
    }
}
