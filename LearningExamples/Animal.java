package LearningExamples;

public class Animal {
    public void animalSound() {
        System.out.println("Aniaml says: Animal sound");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("Pig says: oink oink!");
        super.animalSound();
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("Dog says: bow wow!");
    }
}
