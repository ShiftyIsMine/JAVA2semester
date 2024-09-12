package chap08.ex8_2;

class Drink {
    String name;
    int price;

    Drink(String n, int p) {
        name = n;
        price = p;

    }
    public String toString() {
        return String.format("Drink{%s %d}", name, price);
    }

}