package lesson2;

public class SecondProgram<resultOfMinus> {

    public static void main(String[] args) {
        //сложение
        long summa = summa(3, 5);
        long resultOfMinus = minus(18, 2);
        System.out.println(resultOfMinus);
    }

    public static long summa(int arg1, int arg2) {
        int result = arg1 + arg2;
        System.out.println(result);
        return result;
    }

    public static long minus(int arg1, int arg2) {
        int result = arg1 - arg2;
        return result;

    }

}