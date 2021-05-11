package Appenmeier.kapitel81;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ausfuehr0801Writer {
    public static void main(String[] args) {

        Person timm = new Person("Timm", 29, 'm');
        Person felix = new Person("Felix", 19, 'd');
        Person simone = new Person("Simone", 17, 'w');

        File file = new File("/Users/jonasschirm/Downloads/persons.txt");


        try (FileWriter fileWriter = new FileWriter(file, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            bufferedWriter.write(timm.getName() + ", " + timm.getAge() + ", " + timm.getGender());
            bufferedWriter.newLine();
            bufferedWriter.write(felix.getName() + ", " + felix.getAge() + ", " + felix.getGender());
            bufferedWriter.newLine();
            bufferedWriter.write(simone.getName() + ", " + simone.getAge() + ", " + simone.getGender());
            bufferedWriter.newLine();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

