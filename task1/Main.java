package task1;

public class Main {
    public static void main(String[] args) {
        // Создание объекта кошки
        Cat Abyssinian = new Owner(Constants.CAT_NAME, Constants.CAT_AGE, Constants.CAT_OWNER);
        Owner owner = new Owner(null, 0, null);

        // Использование геттеров и сеттеров
        System.out.println("Мяу! Меня зовут " + Abyssinian.getName());
        System.out.println("Мне " + Abyssinian.getAge() + " года (лет)");
        System.out.println("Мой владелец - " + Abyssinian.getOwner());
        Abyssinian.makeSound();
        Abyssinian.favoriteFood();
        Abyssinian.favoriteToy();
        Abyssinian.unlovedAnimal();
        owner.unlovedThing();
    }
}

