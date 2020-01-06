package by.tms.home.writer;


// final static default
public class ConsoleWriter implements IWriter {

    public void WriteString(String out) {
        System.out.println(out);
    }

    public void WriteDouble(Double out) {
        System.out.println(out);
    }
}