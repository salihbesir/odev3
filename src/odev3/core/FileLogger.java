package odev3.core;

public class FileLogger implements ISaveLogger{
    @Override
    public void log(String data) {
        System.out.println("File'a loglandı "+ data);
    }
}
