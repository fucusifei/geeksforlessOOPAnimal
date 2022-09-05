public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name,age);
    }
    public Cat(int age) {
        super(age);
    }
    public Cat(String name) {
        super(name);
    }
    @Override
    public void voice() {
        System.out.println("Mew Mew");
    }
}
