package lessons.lesson2;

public class Dog {

    String name;

    int age;

    String breed;

    Boolean shortOrLong;

    public Dog() {
    }

    public Dog(String nameDog) {
        this.name = nameDog;
    }

    public Dog(String nameDog, int ageDog, String breedDog) {
        this.name = nameDog;
        this.age = ageDog;
        this.breed = breedDog;
    }

    public Dog(String name, int age, String breed, Boolean shortOrLong) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.shortOrLong = shortOrLong;
    }
}
