package task1;

class Cat extends Owner implements SoundMarker, LikeEat, FavoriteToy, UnlovedAnimal, Animal {
private String name;
    Integer age;

    public Cat(String name, Integer age, String ownerName) {
        super(ownerName);
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + age + " лет";
    }

    public Cat(String name, Integer age) {
        this("", null, null);
    }

    public Cat(String name) {
        this("", null);
    }

    public Cat() {
        this("");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void greet() {
        if (getOwnerName() != null){
            System.out.println("Мяу! Меня зовут " + name + ". Мне " + age + " года(лет). Мой владелец " + getOwnerName() + ".");
        } else {
            System.out.println("Вы не указали имя владельца");
        }
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