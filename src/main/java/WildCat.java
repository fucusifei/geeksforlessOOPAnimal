public class WildCat extends Cat {
    public WildCat(String name, int age) {
        super(name, age);
    }

    public WildCat(int age) {
        super(age);
    }

    public WildCat(String name) {
        super(name);
    }


    @Override
    public void voice() {
        System.out.println("angry growl");
    }
}
