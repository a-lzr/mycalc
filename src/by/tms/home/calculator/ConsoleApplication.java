package by.tms.home.calculator;

import by.tms.home.reader.IReader;
import by.tms.user.Users;
import by.tms.home.writer.IWriter;
import by.tms.home.reader.ConsoleReader;
import by.tms.home.writer.ConsoleWriter;
import by.tms.home.user.User;


import java.io.IOException;

public class ConsoleApplication {
    IReader in = new ConsoleReader();
    IWriter out = new ConsoleWriter();
    User current = null;

    public void run() {
        while (true) {
            out.WriteString("Нажмите 1 - для авторизации пользователя, 2 - для регистрации нового пользователя, иначе произойдет выход из программы");
            switch (in.ReadString()) {
                case "1":
                    if (run_authorize()) {
                        run_task();
                        current = null;
                    }
                    continue;
                case "2":
                    run_registrate("");
                    continue;
                default:
                    return;
            }
        }
    }

    public Boolean run_authorize() {
        while (true) {
            out.WriteString("Введите логин для входа");
            String login = in.ReadString();
            User user = Users.get(login);

            if (user == null) {
                out.WriteString("Пользователя с таким логином не сущестует.");
                out.WriteString("Нажмите 1 - для регистрации пользователя, 2 - для повторения операции, иначе операция будет отменена");
                switch (in.ReadString()) {
                    case "1":
                        if (run_registrate(login))
                            continue;
                        else
                            return false;
                    case "2":
                        continue;
                    default:
                        return false;
                }
            }
            else {
                for (int i = 0; i < 3; i++) {
                    out.WriteString("Введите пароль для входа");
                    if (in.ReadString().equals(user.UserPswd))
                        return true;
                    else {
                        out.WriteString("Вход невозможен");
                        continue;
                    }
                }
                out.WriteString("Вход невозможен: вы исчерпали попытки для входа");
                out.WriteString("Нажмите 1 - для повторения операции, иначе операция будет отменена");
                switch (in.ReadString()) {
                    case "1":
                        continue;
                    default:
                        return false;
                }
            }
        }
    }

    public Boolean run_registrate(String LoginName) {
        while (true) {
            if (LoginName.isEmpty()) {
                out.WriteString("Введите логин для нового пользователя:");
                LoginName = in.ReadString();
            }
            else {
                User user = Users.get(LoginName);
                if (user == null)
                    break;
                else {
                    out.WriteString("Введенный логин нельзя использовать для регистрации.");
                    out.WriteString("Нажмите 1 - для повторения операции, иначе операция будет отменена");
                    switch (in.ReadString()) {
                        case "1":
                            continue;
                        default:
                            return false;
                    }
                }
            }
        }

        while (true) {
            out.WriteString("Введите пароль для входа");
            String pswd = in.ReadString();
            out.WriteString("Повторите пароль для входа");
            if (pswd == in.ReadString()) {
                Users.users.add(new User(LoginName, pswd));
                return true;
            }
            else {
                out.WriteString("Регистрация невозможна: пароли не совпадают");
                out.WriteString("Нажмите 1 - для повторения операции, иначе операция будет отменена");
                switch (in.ReadString()) {
                    case "1":
                        continue;
                    default:
                        return false;
                }
            }
        }
    }

    public void run_task() {
        while (true) {
            out.WriteString("Нажмите 1 - для выполнения задачи, 2 - для просмотра истории, иначе произойдет деавторизация");
            switch (in.ReadString()) {
                case "1":
                    out.WriteString("Введите номер задачи");
                    run_task(in.ReadInteger());
                    continue;
                case "2":
                    continue;
                default:
                    return;
            }
        }
    }

    public void run_task(int task) {
        switch (task) {
            case 1:
                run_calculate();
                break;
            case 2:
                trycatch();
                break;
            default:
                System.out.println("Задачи с таким номером не существует");
        }
    }

    private void run_calculate() {
        ICalculator calc = new Calculator();

        out.WriteString("Введите 1-е число:");
        double a = in.ReadDouble();
        out.WriteString("Введите 2-е число:");
        double b = in.ReadDouble();
        out.WriteString("Введите операцию:");
        String op = in.ReadString();


        try {
            out.WriteDouble(calc.calc(a, b, op));
        } catch (IOException e) {
            if (e.getMessage() == "error")
                out.WriteString("Операция " + op + " не поддерживается");
            else
                e.printStackTrace();
        }
    }

    private void trycatch() {
        ICalculator calc = new Calculator();

        int v = 0, a = 1, b = 0;
        try {
            v = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Bad format");
        }
        System.out.println(v);
        readFile();
    }

    void readFile()  {
        //try {
        //    FileReader fileReader = new FileReader(new File("C:\1.txt"));
        try {
            //MyException me = new MyException("444");
            //me.IOException
            throw new MyException("444");
        } catch (MyException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {

        }
        //} catch (FileNotFoundException e) {
        //    e.printStackTrace();
        //}
    }
}
