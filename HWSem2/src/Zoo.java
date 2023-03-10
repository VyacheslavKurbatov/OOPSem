import Animal.Animal;
import Animal.AnimalInterface;

import java.util.LinkedList;

public class Zoo {
    private LinkedList<Animal> zoo = new LinkedList<>();

    @Override
    public String toString() {
        return "Zoo{" +
                "zoo=" + zoo +
                '}';
    }

    public LinkedList<Animal> addAnimal(Animal addedAnimal){
        zoo.addLast(addedAnimal);
        return zoo;
    }
    public LinkedList<Animal> removeAnimal(int i){
        zoo.remove(i);
        return zoo;
    }
    public Animal getInfo(int i){
        return zoo.get(i);
    }
    public void makeSound(int i) {
        ((AnimalInterface) zoo.get(i)).makeSound();
    }
    public void getAll(){
        for (int i = 0; i < zoo.size(); i++) {
            System.out.printf("%d: ", i);
            System.out.println(zoo.get(i));
        }
    }
    public void makeAllSound(){
        for (Animal animal: zoo) {
            ((AnimalInterface) animal).makeSound();
        }
    }

    public int size(){
        return zoo.size();
    }
}
