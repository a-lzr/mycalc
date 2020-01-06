package by.tms;

public class Main {

    double sum(double a, double b) {
        return (int) (a + b);
    }

    public static void main(String[] args) {
        Main main = new Main();
        double sum = main.sum(2, 5);
        System.out.println(sum);

        boolean b21= 2 > 5;
        boolean b2 = 2 < 5;
        boolean b3 = 2 == 5;
        boolean b4 = 2 != 5;

        Dog dog = new Dog("Test", 22);
        Dog dog2 = new Dog("Test2", 24);
        
        System.out.println(dog.equals(dog2));

/*        int a = 2 + 2;
        int b = 2 - 2;
        double c = 2 / 5;
        int d = 2 % 2;
        int e = 2 * 2;

        byte aa = -128; // -128 - 127 // 8
        short bb = -32768; // -32768 - 32767 // 16
        int cc = -2111111111; // 32
        long dd = 1242343243L; // 64

        double ee = 333333333.444; //64
        float ff = 3232323.65f; // 32

        boolean fff = true;

        char ffff = 'a';

        Dog dog3;

        int i = a - 2;
        System.out.println(i); */
    }
}
