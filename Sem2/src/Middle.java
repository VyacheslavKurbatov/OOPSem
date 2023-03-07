import java.time.LocalDate;

public class Middle extends Pupils implements Play, Smoke {
    public Middle(String firstName, String lastName, String birthDay, String className) {
        super(firstName, lastName, birthDay, className);
    }

    @Override
    public void learn() {
        System.out.println("Я не навижу учиться");
    }

    @Override
    public void play() {
        System.out.println("Я играю в Minecraft");
    }

    @Override
    public void smoke() {
        System.out.println("Я начинаю курить");
    }
}
