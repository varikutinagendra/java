
public class java {
    public static void main(String[] args) {
        animal genericAnimal = new animal("Generic Animal");
        dog myDog = new dog("Buddy");

        genericAnimal.speak(); // Output: This animal makes a sound.
        myDog.speak(); // Output: Buddy says Woof!
    }
}
