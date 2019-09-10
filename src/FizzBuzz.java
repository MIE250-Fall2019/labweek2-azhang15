public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if ((i%5 == 0) && (i%7 == 0)) {
                return (System.out.println("fizzbuzz"));
            } if (i%5 == 0) {
                return System.out.println("fizz");
            } if (i%7 == 0) {
                return System.out.println("buzz");
            } else {
                return System.out.println(i);
        }
    }
}
