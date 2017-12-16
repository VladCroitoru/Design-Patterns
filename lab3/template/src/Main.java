public class Main {
    public static void main(String[] args) {
        AbstractClass abstractClass;
        abstractClass = new ConcreteClassA();
        abstractClass.TemplateMethod();

        abstractClass = new ConcreteClassB();
        abstractClass.TemplateMethod();
    }
}

