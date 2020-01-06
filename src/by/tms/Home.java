package by.tms;

import by.tms.vehicle.VehicleRoadCar;
import by.tms.home.calculator.ConsoleApplication;

import java.util.Scanner;

public class Home {

    private int count_nums(int a) {
        int i = 0, x = a;
        while (x > 0) {
            x = (int) x / 10;
            i++;
        }
        return i;
    }

    private int num_by_pos(int a, int aPos) {
        int x = a;
        for (int i = 0; i < aPos; i++, x = (int) x / 10) ;
        return x % 10;
    }

    private boolean is_polidrom(int[] aNums) {
        for (int i = 0, j = aNums.length - 1; i < j; i++, j--)
            if (aNums[i] != aNums[j])
                return false;
        return true;
    }

    private boolean is_polidrom(int a) {
        int aCount = count_nums(a);
        int[] aNums = new int[aCount];
        for (int i = 0; i < aCount; i++)
            aNums[i] = num_by_pos(a, i);
        return is_polidrom(aNums);
    }

    private void init_cars() {
        CarImpl car = new CarImpl("Porshe", 1999);
        CarImpl car2 = new CarImpl("Porshe", 1980);
        CarImpl car3 = new CarImpl("Porshe", 1999);
        System.out.println(car.equals(car2));
        System.out.println(car.equals(car3));
    }

    private void init_vehicles() {
        VehicleRoadCar car = new VehicleRoadCar();
        System.out.println(car.action_movement());
    }

    private void go_menu(String a) {
        switch (a) {
            case "1":
                System.out.println(is_polidrom(123321));
                break;
            case "2":
                init_cars();
                break;
            case "3":
                init_vehicles();
                break;
            default:
                System.out.println("Задачи с таким номером не существует");
        }
    }

    private void go_menu() {
        boolean aContinue;
        do {
            System.out.println("Введите номер задачи");
            Scanner scanner = new Scanner(System.in);
            go_menu(scanner.next());
            System.out.println("Для продолжения работы нажмите y");
            aContinue = scanner.next().equals("y");
        } while (aContinue);
        System.out.println("1");
    }

    public static void main(String[] args) {
//        Home home = new Home();
//        home.go_menu("4");
//        String a = "2";
//        Pattern compile = Pattern.compile("\\d+");
//        boolean matches = a.matches(compile.pattern());
//        System.out.println(matches);
//        a.split()
        ConsoleApplication app = new ConsoleApplication();
        app.run();
    }
}