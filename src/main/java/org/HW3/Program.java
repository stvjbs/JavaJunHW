package org.HW3;

import java.io.*;

public class Program {
    public static void serialObj(Object object, String filename) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(object);
            objectOutputStream.close();
        } catch (Exception e) {
            System.out.println("serial exception");
        }
    }

    public static Object deserialObj(String filename) throws IOException, ClassNotFoundException, IOException {
        FileInputStream fileInputStream = new FileInputStream(filename);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        return objectInputStream.readObject();
    }
}

