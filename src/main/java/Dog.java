public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog(String name) {
        super(name);
    }

    public Dog(int age) {
        super(age);
    }

    @Override
    public void voice() {
        System.out.println("Gav Gav");
    }
}
