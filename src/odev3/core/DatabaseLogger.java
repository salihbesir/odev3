package odev3.core;

public class DatabaseLogger implements ISaveLogger{
    @Override
    public void log(String data) {
        System.out.println("Veritabanına loglandı " + data);
    }
}
