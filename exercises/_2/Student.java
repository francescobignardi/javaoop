package javaoop.exercises._2;

public class Student {

    String name;
    int age;


    Student(String name, int age){

        this.name = name;
        this.age = age;
        //System.out.println("Nome: " + name + ", età: " + age);     //Serve per secondo esercizio e basta,
                                                                     // Scombina esercizio 1

    }


    Student(String name){
        this.name = name;
        System.out.println("Nome: " + name);
    }
    Student(int age){
        this.age = age;
        System.out.println("Età: " + age);
    }
    Student(){

    }
}
