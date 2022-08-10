import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] m = {-1,0,1};
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            m[a] = 150/a;
            System.out.println(m[a]);
        } catch (ArithmeticException e) {
            System.out.println("Неприпустима арифметична помилка");
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Звернення до неприпустимого індексу массива");
        }
    }
}