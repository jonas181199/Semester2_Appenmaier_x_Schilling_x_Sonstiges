package Appenmeier.kapitel81;

public class Person {

    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public String getName(){
        return name;
    }

    public void print() {
        System.out.println(name + "; " + age + "; " + gender);
    }
}
