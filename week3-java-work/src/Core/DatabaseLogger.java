package Core;

public class DatabaseLogger implements Logger{
    @Override
    public String log(String data) {
        return "Database'e loglama yapıldı.";
    }
}
