public class Pig extends Animal {
    public Pig(String name, int age) {
        super(name, age);
    }

    public Pig(String name) {
        super(name);
    }

    public Pig(int age) {
        super(age);
    }

    @Override
    public void voice() {
        System.out.println("squeal");
    }
}
