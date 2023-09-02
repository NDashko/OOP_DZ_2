package task1;
// Подкласс для владельца кошки

class Owner extends Cat implements UnlovedThing {
    private String owner;

    // Конструктор класса Owner
    public Owner(String name, int age, String owner) {
        super(name, age);
        this.owner = owner;

    }

    // Геттер для получения владельца кошки
    public String getOwner() {
        return owner;
    }

    @Override
    public void unlovedThing() {
        System.out.println(Constants.CAT_OWNER + " не любит, когда " + Constants.CAT_NAME + " пакостит.");
    }

}
