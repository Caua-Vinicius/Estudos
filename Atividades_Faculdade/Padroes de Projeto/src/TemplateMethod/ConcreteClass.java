package TemplateMethod;
public class ConcreteClass extends AbstractClass {
    @Override
    void step1() {
        System.out.println("ConcreteClass: Implementando o passo 1");
    }

    @Override
    void step2() {
        System.out.println("ConcreteClass: Implementando o passo 2");
    }
}
