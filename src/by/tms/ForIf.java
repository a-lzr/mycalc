package by.tms;

import java.util.Arrays;

public class ForIf {

/*    void abc(double a) {
        System.out.println(a);
    }

    void abc(int a) {
        System.out.println(a);
    } */

    void abc(long a) {
        System.out.println(a);
    }

//    void abc(float a) {
//        System.out.println(a);
//    }

    void abc(byte a) {
        System.out.println(a);
    }

 //   void abc(Object a) {
 //       System.out.println(a);
 //   }

    int count(int a) {
        return a;
//        int res = 1;
//        while (i / 10 < 10) {
//           System.out.println(i);
//            i++;
//        }
    }

    void equal(int a, int b) {
        if (a == b) {
            System.out.println(a + " equal " + b);
        } else if (a > b) {
            System.out.println(a + " > " + b);
        } else {
            System.out.println(a + " < " + b);
        }
    }

    void fora() {
        int i = 0;
        for (;i<10;i++) {
            System.out.println(i);
        }
        i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
//            try {
//                Thread.sleep(1000);
//            }
        }
        i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 10);
    }

    public static void main(String[] args) {
        ForIf forif = new ForIf();
//        forif.equal(2, 2);
//        forif.equal(4, 16);
//        forif.fora();
//        forif.abc(2);

//        int[] a = new int [10];
//        for (int i = 1, ii = 0; i <= 10; i++, ii++) {
//            a[ii] = i;
//        }
        //for(int i : a) {
//        for(int aa = 0; aa<a.length;aa++) {
//            System.out.println(a[aa]);
//        }
//        System.out.println(Arrays.toString(a));

        //int[] a = new int [5]{2, 4, 6, 7, 12};

//        for (int i = 1; i <= 10; i++) {
//           a[i - 1] = i;
//        }



//        for (int i = 0; i < 10; i++)
//            if (a[i] % 2 == 0)
//                System.out.println(a[i]);
        //  3, 6

        int[] a = new int []{2, 3, 6, 1, 7, 12, 5, 4545, 343, 33444};
        for (int i = 1; i < a.length - 1; i++) {
           if (a[i] == a[i - 1] * 2)
              System.out.println(a[i]);
        }

        int min = a[0];
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min > a[i])
                min = a[i];
            if (max < a[i])
                max = a[i];
        }
        System.out.println("min=" + min);
        System.out.println("max=" + max);

        for (int i = 0; i < a.length; i++)
            for (int j = i; j < a.length; j++){
                if (a[i] > a[j]) {
                    int b = a[i];
                    a[i] = a[j];
                    a[j] = b;
                }
            }
        System.out.println(Arrays.toString(a));

        int[] x = new int [15];
        x[0] = 0;
        x[1] = 1;
        for (int i = 2; i < x.length; i++) {
            x[i] = x[i - 1] + x[i - 2];
        }
        System.out.println(Arrays.toString(x));

        int[] y = new int [15];
        y[0] = 0;
        for (int i = 1; i < x.length; i++) {
            y[i] = y[i - 1] + i;
        }
        System.out.println(Arrays.toString(y));

//        int[] a = new int []{2, 3, 6, 1, 7, 12, 5, 4545, 343, 33444};
        for (int i = 1; i < x.length; i++) {
            y[i] = y[i - 1] + i;
        }
        System.out.println(Arrays.toString(y));
    }
}
