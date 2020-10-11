package basics;

public class Loops {
    public static void main(String[] args) {
//         1. for-loop
//         initialize a var: setting an initial value
//         1. declare a var: give a type and name
        int age;
        age = 25;
        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }

        for (int i = 10; i >= 0; i--){
            System.out.println(i);
        }

        // infinite loop
        for (;;) {
            System.out.println("Hi");
            break;
        }

        while (true) {
            System.out.println("Bye");
            break;
        }

//         Using while-loop
//         2. print even numbers from 1 to 100
//         (output)
//         2,4,6,8,10

        for (int i = 1; i <= 20; i++){
            if (i % 10 == 0) {
                System.out.println(i);
            } else {
                System.out.println(i + "");
            }
        }
        int number = 2;
        while(number <= 100) {
            System.out.println(number);
            number += 2;
        }
    }
}
