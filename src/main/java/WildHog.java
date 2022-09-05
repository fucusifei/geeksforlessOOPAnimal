public class WildHog extends Pig{
    public WildHog(String name, int age) {
        super(name,age);
    }
    public WildHog(String name) {
        super(name);
    }

    public WildHog(int age) {
        super(age);
    }

    @Override
    public void voice() {
        System.out.println("angry squeal");
    }
}
