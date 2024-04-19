package TemplateMethod;
public abstract class AbstractClass {
    public void templateMethod() {
        // Etapas comuns que permanecem consistentes
        step1();
        step2();
        step3();
    }
    abstract void step1(); 
    abstract void step2(); 

    void step3() {
        System.out.println("AbstractClass: Implementação padrão do passo 3");
    }

}
