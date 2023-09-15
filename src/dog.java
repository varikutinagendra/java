
public class dog extends animal {
    public dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getName() + " says Woof!");
    }
}

