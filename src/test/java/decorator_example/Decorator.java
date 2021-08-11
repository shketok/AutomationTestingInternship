package decorator_example;

public abstract class Decorator {


    public abstract void methodToExecute();

    public void decoratorMethodToExecute() {
        System.out.println("actions before");

        methodToExecute();

        System.out.println("actions after");
    }
}
