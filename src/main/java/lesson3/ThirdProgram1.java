package lesson3;

public class ThirdProgram1 {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("Факториал числа " + number + " = " + factorial(number));
    }

    public static int factorial(int value) {
        int result = 1;

        if (value < 0) {
            return -1;
        } else if (value! = 0) {
            for (int i = 1; i <= value; i + +) {
                result * = i;
            }

            return result;
        }

    }


}
