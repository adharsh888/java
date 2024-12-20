 interface Animal {
    void makeSound();
    void eat();
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }

    public void eat() {
        System.out.println("Dog is eating.");
    }
}

class Cat implements Animal {
    public void makeSound() {
        System.out.println("Meow! Meow!");
    }

    public void eat() {
        System.out.println("Cat is eating.");
    }
}

 class Main1 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        dog.eat();

        cat.makeSound();
        cat.eat();
    }
}
