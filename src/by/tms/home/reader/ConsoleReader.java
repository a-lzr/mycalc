package by.tms.home.reader;

import java.util.Scanner;

public class ConsoleReader implements IReader {

    static private Scanner init_scanner() {
        return new Scanner(System.in);
    }

    public double ReadDouble() {
        return init_scanner().nextDouble();
    };
    public int ReadInteger() {
        return init_scanner().nextInt();
    };
    public String ReadString() {
        return init_scanner().next();
    };
}
