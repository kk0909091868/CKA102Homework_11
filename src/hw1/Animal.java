package hw1;

public class Animal {
int age;
    float weight;

    Animal(int a, float w) {
        age = a;
        weight = w;
    }

    void speak() {
        System.out.println("Age is " + age);
        System.out.println("Weight is " + weight);
    }

public static void main(String[] args) {

    Animal a1 = new Animal(2, 5.0f);

    a1.speak();

}
}
