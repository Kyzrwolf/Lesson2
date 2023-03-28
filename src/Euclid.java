import java.util.Scanner;

public class Euclid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите два целых числа: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        System.out.println("Наибольший общий делитель: " + getGCD(a, b));
        System.out.println("Наименьшее общее кратное: " + getLCM(a, b));

    }

    private static int getGCD(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
    private static int getLCM(int a, int b) {
        return a*b / getGCD(a,b);
    }

}




