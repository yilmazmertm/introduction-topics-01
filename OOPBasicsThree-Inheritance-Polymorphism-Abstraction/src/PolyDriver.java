public class PolyDriver {
    public static void main(String[] args) {
        PolyAnimal animal = new PolyAnimal();
        PolyAnimal pig = new PolyPig();
        PolyAnimal dog = new PolyDog();

        animal.animalSound();
        pig.animalSound();
        dog.animalSound();

    }
}
