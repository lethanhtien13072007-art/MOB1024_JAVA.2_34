package UTIL;

import java.io.*;

public class FileUtil {

    public static void save(Object data, String file) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(data);
        oos.close();
    }

    public static Object load(String file) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        Object obj = ois.readObject();
        ois.close();
        return obj;
    }
}