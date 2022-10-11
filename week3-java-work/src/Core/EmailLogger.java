package Core;

public class EmailLogger implements Logger{
    @Override
    public String log(String data) {
        return "E-Mail Loglama Yapıldı";
    }
}
