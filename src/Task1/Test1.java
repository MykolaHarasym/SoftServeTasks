package Task1;

import java.io.*;
import java.util.ArrayList;

public class Test1  {

    public static void main(String[] args) {
        ArrayList<Persone> list = new ArrayList<>();
        Academy ac = new Academy(list);
        ac.addPersoneStudent("Jony", "Lnu");
        ac.addPersoneStudent("Sara", "Lnu");
        ac.addPersoneStudent("Meri", "Ptu");
        ac.addPersoneWorker("Vova", "SoftServe");
        ac.addPersoneWorker("Mykola", "SoftServe");
        ac.addPersoneWorker("Olga", "Epam");
        ac.showAll();

        try{
            FileOutputStream fos = new FileOutputStream("Student.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(ac);
            oos.close();
            fos.close();
            System.out.println("Serialzation Done!!");
        }catch(IOException ioe){
            System.out.println(ioe);
        }

        Academy o =null;
        try{
            FileInputStream fis = new FileInputStream("Student.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            o = (Academy) ois.readObject();
            ois.close();
            fis.close();
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
            return;
        }catch(ClassNotFoundException cnfe)
        {
            System.out.println("Student Class is not found.");
            cnfe.printStackTrace();
            return;
        }
        System.out.println("After deser");
        o.showAll();
    }
}
