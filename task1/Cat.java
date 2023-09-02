// package task1;

// class Cat extends Owner implements SoundMarker {
//     private String name;
//     private Integer age;

package task1;
// Базовый класс для кошек
class Cat implements SoundMarker, LikeEat, FavoriteToy, UnlovedAnimal, Animal {
    private String name;
    private int age;


    // Конструктор класса Cat
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Геттер для получения имени кошки
    public String getName() {
        return name;
    }

    
    // Геттер для получения возраста кошки
    public int getAge() {
        return age;
    }

    public String getOwner() {
        return null;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " мяукает.");
    }

    
    @Override
    public void favoriteFood() {
        System.out.println(name + " любит рыбку.");
    }

    @Override
    public void favoriteToy() {
        System.out.println(name + " больше всего любит играть с шерстяным клубком.");
    }

    @Override
    public void unlovedAnimal() {
        System.out.println(name + " не любит собак.");
    }

    @Override
    public String move() {
    return "бегает";
    }
}


