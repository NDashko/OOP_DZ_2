package task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Main implements Constants {
    
    public static void main(String[] args) {
    
        Cat cat = new Cat();
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Мурка", 3, "Иванов"));
        cats.add(new Cat("Васька", 2, "Петров"));
        cats.add(new Cat("Барсик", 5, "Сидоров"));
        cats.add(new Cat("Нюся", 8, "Васечкин"));

        cat.setName(CAT_NAME);
        cat.setAge(CAT_AGE);
        cat.setOwnerName(OWNER_NAME);

        cat.greet();
        cat.makeSound();
        cat.favoriteFood();
        cat.favoriteToy();
        cat.unlovedAnimal();
        cat.move();

        System.out.println("\nСписок кошек до сортировки: ");
        for (Cat person : cats) {
        System.out.println(person);
        }

        // Создаем компаратор для сортировки по возрасту в порядке возрасатния
        Comparator<Cat> ageComparator = Comparator.comparingInt(person -> person.age);

        // Сортируем список с помощью компаратора 
        Collections.sort(cats, ageComparator);

        System.out.println("\nСписок кошек после сортировки по возрасту: ");
        for (Cat person : cats){
            System.out.println(person);
        }
       
}
}



