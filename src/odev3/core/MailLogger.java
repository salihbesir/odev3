package odev3.core;

public class MailLogger implements ISaveLogger {
    @Override
    public void log(String data) {
        System.out.println("Maile loglandı " + data);
    }
}
