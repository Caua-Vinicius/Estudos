import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import Builder.Computer;
import Builder.ComputerBuilder;
import DecoratorPattern.BubbleLights;
import DecoratorPattern.ChristmasTree;
import DecoratorPattern.ChristmasTreeImpl;
import Facade.Facade;
import Singleton.Singleton;
import TemplateMethod.AbstractClass;
import TemplateMethod.ConcreteClass;

public class App {
    public static void main(String[] args) throws Exception {

        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();

        Computer computer = new ComputerBuilder()
                .setHDD("500GB")
                .setRAM("8GB")
                .enableGraphicsCard(true)
                .enableBluetooth(false)
                .build();

        Facade facade = new Facade();
        facade.loadCompleteData();

        ChristmasTree tree1 = new BubbleLights(new ChristmasTreeImpl());
        System.out.println(tree1.decorate());

        AbstractClass class1 = new ConcreteClass();
        class1.templateMethod();

        //Iterator

        List<String> nomes = Arrays.asList("alex", "brian", "charles");

        Iterator<String> iteradorNomes = nomes.iterator();

        while (iteradorNomes.hasNext()) {
            String nomeAtual = iteradorNomes.next();
            System.out.println(nomeAtual);
        }

    }
}
