package org.jake.write.time.wheel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestMain {
    public static void main(String[] args) {
        Singleton s1 = null;
        Singleton s2 = Singleton.getInstance();
        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream("singleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();

            oos.close();

            Class<Singleton> singletonClass = Singleton.class;

            FileInputStream fis = new FileInputStream("singleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (Singleton) ois.readObject();
            ois.close();
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1 == s2);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
