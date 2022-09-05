public class WildDog extends Dog{
    public WildDog(String name, int age) {
        super(name, age);
    }

    public WildDog(String name) {
        super(name);
    }

    public WildDog(int age) {
        super(age);
    }

    @Override
    public void voice() {
        System.out.println("howl");
    }
}
