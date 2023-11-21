public class Main {
    public static void main(String[] args) {
        System.out.println("Here's a simple solution to the FizzBuzz problem!!! :D");

        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz ("+i+")");
            } else if (i % 5 == 0) {
                System.out.println("Buzz ("+i+")");
            } else if (i % 3 == 0) {
                System.out.println("Fizz ("+i+")");
            } else System.out.println(i);
        }
    }
}