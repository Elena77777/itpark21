package lesson2;

public class SecondProgram<resultOfMinus> {

    public static void main(String[] args) {
        //сложение
        long summa = summa(3,5);
        long minus = minus(18,2);
        long prod = prod(5,5);
        long div = div(18,2);
        System.out.println(minus);
        System.out.println(summa);
        System.out.println(prod);
        System.out.println(div);
    }
        public static long summa(int arg1, int arg2) {
        int result = arg1 + arg2;
        return result;
    }

    public static long minus(int arg1, int arg2) {
        int result= arg1- arg2;
        return result;

    }
    public static long prod(int arg1, int arg2) {
        int result = arg1 * arg2;
        return result;
    }

    public static long div(int arg1, int arg2) {
        int result = arg1 / arg2;
        return result;

    }

}