
public class Euclid {

    public static void main(String[] args) {

        System.out.println(getGCD(25,45) == 5);
        System.out.println(getGCD(45,25) == 5);
        System.out.println(getGCD(17,23) == 1);
        System.out.println(getGCD(Integer.MAX_VALUE,Integer.MAX_VALUE) == Integer.MAX_VALUE);
        System.out.println(getLCM(25, 45) == 225);
        System.out.println(getLCM(45, 25) == 225);
        System.out.println(getLCM(7,8) == 56);
        System.out.println(getLCM(Integer.MAX_VALUE, Integer.MAX_VALUE) == Integer.MAX_VALUE);

    }

    private static int getGCD(int a, int b) {
        while (a > 0 && b > 0) {
            if ((b % a) == 0) {
                return a;
            }
            b %= a;
            if ((a % b) == 0) {
                return b;
            }
            a %= b;
        }
        if (a == 0) {
            return b;
        }
        return a;
    }

    private static int getLCM(int a, int b) {
        long lcm = ((long) a / getGCD(a, b)) * b;
        return (int) lcm;
    }

}




