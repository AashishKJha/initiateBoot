package examples.designPatterns;

/******************************************************************************************************
 *                                                                                                    *
 *         A Factory Pattern or Factory Method Pattern says that just define an interface             *
 * or abstract class for creating an object, but let the subclasses decide which class to instantiate.*
 *         In other words, subclasses are responsible to create the instance of the class             *
 *                                                                                                    *
 *                The Factory Method Pattern is also known as Virtual Constructor.                    *
 *                                                                                                    *
 ******************************************************************************************************/
public class FactoryPattern {
    public static void main(String[] args) {
        String type = AnimalFactory.getFactory("cat").getAnimalType();
        System.out.println(type);
    }
}

interface Animal {
    String type = null;

    String getAnimalType();

}

class Dog implements Animal {

    @Override
    public String getAnimalType() {
        return "Dog";
    }
}

class Cat implements Animal {
    @Override
    public String getAnimalType() {
        return "Cat";
    }
}

class Elephant implements Animal {
    @Override
    public String getAnimalType() {
        return "Elephant";
    }
}

class AnimalFactory {
    public static Animal getFactory(String type) {
        Animal animal;
        switch (type) {
            case "ele": {
                animal = new Elephant();
            }
            break;
            case "dog": {
                animal = new Dog();
            }
            break;
            case "cat": {
                animal = new Cat();
            }
            break;
            default: {
                animal = new Dog();
            }
            break;
        }

        return animal;
    }
}
