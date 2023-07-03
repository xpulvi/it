package it.generics_and_wilcards;

public class UserFromDb extends Usrebase {

    public String name;
    public String surname;
    public int age;

    @Override
    public String getCompleteName() {
        return name + " " + surname;
    }

    @Override
    public String toString() {
        return "UserFromDb{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    public UserFromDb(){

    }

    public UserFromDb(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
}
