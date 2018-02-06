package Task1;
import java.util.ArrayList;
public class Test  {

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
    }
}
