package lesson3;

public class ThirdProgram {
    public static void main(String[] args) {
        int a = 1;
        int b = -4;
        int c = 4;
        calculatedRoots(a, b, c);
    }
        private static void calculatedRoots (int a, int b, int c) {
        int discriminant = b * b - 4 * a * c;
        if (discriminant < 0) {
            System.out.println("Корней квадратного уравнения с коэффициентом a = " + a + " b = " + b + " c "
                            + c + " не может быть найдено, поскольку дискриминант =  " +
                             discriminant + " и является отрицательным числом");
        } else if (discriminant == 0){
            int x = -b / (2 * a);
            System.out.println("Найден единственный корень квадратного уравнения с коэффициентом a = " + a + " b = "
                    + b + " c = " + c + " и он равен " + x );

            } else  {
                int x1 = (int) (-b + Math.sqrt(discriminant) / (2 * a));
                int x2 = (int) (-b - Math.sqrt(discriminant) / (2 * a));
                System.out.println("Найдены корни квадратного уравнения с коэффициентом a = " + " b = " + b + " c "
                        + " и они равны " + x1 + "и " + x2);


            }
            }

}