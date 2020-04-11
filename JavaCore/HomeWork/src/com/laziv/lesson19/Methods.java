package com.laziv.lesson19;

import java.io.*;

public class Methods {
    public static void serialize(Object ob) throws IOException {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("object.bin"));
            objectOutputStream.writeObject(ob);
            objectOutputStream.close();
    }

    public static Object deserealize() throws IOException, ClassNotFoundException {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("object.bin"));
            return  objectInputStream.readObject();
    }


}
