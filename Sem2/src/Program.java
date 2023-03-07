import java.util.LinkedList;

public class Program {
    public static void getInfo(LinkedList<Pupils> pupils) {
        for (Pupils pupil: pupils) {
            pupil.learn();
            if (pupil instanceof Play){
                ((Play) pupil).play();
            }
            if (pupil instanceof Smoke){
                ((Smoke) pupil).smoke();
            }
            if (pupil instanceof GoExtension){
                ((GoExtension) pupil).goExtension();
            }
            if (pupil instanceof Love){
                ((Love) pupil).love();
            }
        }
    }
}
