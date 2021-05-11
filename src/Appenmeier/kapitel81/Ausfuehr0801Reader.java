package Appenmeier.kapitel81;

import java.io.*;
import java.util.ArrayList;

public class Ausfuehr0801Reader {

    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<>();

        File file = new File("/Users/jonasschirm/Downloads/persons.txt");

        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] tokens = line.split(", ");
                String name = tokens[0];
                int age = Integer.parseInt(tokens[1]);
                char gender = tokens[2].charAt(0);
                persons.add(new Person(name, age, gender));



                /*System.out.print("Name: " + name + "; ");
                System.out.print("Age: " + age + "; ");
                System.out.print("Gender: " + gender);
                System.out.println();*/
            }

            for (Person person : persons){
                person.print();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
