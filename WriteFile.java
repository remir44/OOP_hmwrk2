import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class WriteFile {

    public void save(Serializable serializable) {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                    new FileOutputStream("familyTree.out"));
            objectOutputStream.writeObject(serializable);
            objectOutputStream.close();
            System.out.println("Дерево сохранено в файл!");
        } catch (IOException ioErr) {
            System.out.println("Ошибка записи в файл: " + ioErr);
        }
    }
}