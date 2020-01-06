package by.tms;

import java.util.Scanner;

public class Objects {
    Integer integer = 56;
    Short aShort = 45;
    Byte aByte = 8;
    Long aLong = 56L;

    Double aDouble = 56.;
    Float aFloat = 56f;

    Boolean aBoolean = false;

    Character character = 'G';
    Character character2 = '\u021f';

    char[] b = new char[]{'H','e','l','l','o'};


    {
        System.out.println(character2);
    }

    void abc1(String a) {
        switch(a) {
            case "Hello":
                System.out.println("Hello");
                stop();
                break;
            default:
                System.out.println("Нет такого");
        }
    }

    private void stop() {
        System.out.println("Stop");
    }

    private boolean is_polidrom(String a) {
        for (int i = 0, j = a.length() - 1; i < j; i++, j--)
            if (a.charAt(i) != a.charAt(j)) {
                System.out.println("не полидром");
                return false;
            }
        System.out.println("полидром");
        return true;
    }

    private int is_polidrom(int a) {
        int x = a;
        while (x > 0) {
            System.out.println(x % 10);
            x = (int) x / 10;
        }
        return a % 10;
    }

    public static void main(String[] args) {
        Objects objects = new Objects();

        String string = "Hello";
        String string2 = " Test";
        String string3 = "Hello";
        String x = string + string2;
        System.out.println(x);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello ");
        stringBuilder.append("Test");

//        System.out.println(stringBuilder.toString());
//        System.out.println(stringBuilder.equals("Hello Test"));
//        System.out.println(string.equals(string3));

        System.out.println(string.substring(2, 3));
        Integer a1 = 22;
        Integer b1 = 22;
        int c1 = 22;

//        System.out.println("ВВведите команду");
//        Scanner scanner = new Scanner(System.in);
//        objects.abc1(scanner.next());

        String ss1 = "test";
        String ss2 = "";
        for(int i = ss1.length() - 1; i >= 0; i--)
            ss2 = ss2 + ss1.charAt(i);
        System.out.println(ss2);

//        objects.is_polidrom("TestseT");
        objects.is_polidrom(12321);
    }
}
