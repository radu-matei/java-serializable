import java.io.*;

/**
 * Created by Radu on 3/25/16.
 */
public class FileManager{

    public static void saveObject(Serializable object, String fileName) throws IOException {

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName));

        objectOutputStream.writeObject(object);

        objectOutputStream.close();
    }

    public static Object loadObject(String fileName) throws Exception{

        ObjectInputStream objectOutputStream = new ObjectInputStream(new FileInputStream(fileName));

        Object object = objectOutputStream.readObject();

        objectOutputStream.close();

        return object;
    }
}
