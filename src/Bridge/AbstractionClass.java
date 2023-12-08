package Bridge;

public abstract class AbstractionClass {
    protected Implementor implementor;
    public abstract void someMethod();

    public AbstractionClass(Implementor implementor){
        this.implementor = implementor;
    }
}
