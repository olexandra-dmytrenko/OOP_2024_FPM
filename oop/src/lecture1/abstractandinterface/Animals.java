package lecture1.abstractandinterface;

public class Animals {
    // Використання
    public static void main(String[] args) {
        Animal dog = new Dog("Buddy");
        dog.makeSound();  // Виведе: Buddy barks: Woof!
        dog.eat();        // Виведе: Buddy is eating.

        Fish fish = new Fish("Nemo");
        fish.makeSound(); // Виведе: Nemo doesn't make a sound.
        fish.swim();      // Виведе: Nemo is swimming.
        fish.eat();       // Виведе: Buddy is eating.
    }
}

// Абстрактний клас
    abstract class Animal {
        protected String name;

        public Animal(String name) {
            this.name = name;
        }

        public abstract void makeSound();

        public void eat() {
            System.out.println(name + " is eating.");
        }
    }

    // Звичайний клас, що успадковує абстрактний
    class Dog extends Animal {
        public Dog(String name) {
            super(name);
        }

        @Override
        public void makeSound() {
            System.out.println(name + " barks: Woof!");
        }
    }

    // Інтерфейс
    interface Swimmable {
        void swim();
    }

    // Клас, що успадковує абстрактний клас та реалізує інтерфейс
    class Fish extends Animal implements Swimmable {
        public Fish(String name) {
            super(name);
        }

        @Override
        public void makeSound() {
            System.out.println(name + " doesn't make a sound.");
        }

        @Override
        public void swim() {
            System.out.println(name + " is swimming.");
        }
    }