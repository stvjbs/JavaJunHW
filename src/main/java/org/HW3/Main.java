package org.HW3;


import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student = new Student("Steve Jobs", 23, 98);
        String fileName = "ser";
        System.out.println(student);
        Program.serialObj(student,fileName);
        student = (Student) Program.deserialObj(fileName);
        System.out.println(student);
    }



}
