import java.time.LocalDate;

public class SeniorPupil extends Pupils implements Smoke, Love {
    public SeniorPupil(String firstName, String lastName, String birthDay, String className) {
        super(firstName, lastName, birthDay, className);
    }

    @Override
    public void learn() {
        System.out.println("Я должен учиться");
    }

    @Override
    public void smoke() {
        System.out.println("Я бросяю курить");
    }

    public void love(){
        System.out.println("Я ищу любовь");
    }
}
