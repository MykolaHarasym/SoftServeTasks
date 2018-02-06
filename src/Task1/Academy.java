package Task1;

import java.util.ArrayList;

public class Academy implements java.io.Serializable{

    public ArrayList<Persone> academy;

    public ArrayList<Persone> getAcademy() {
        return academy;
    }

    public void setAcademy(ArrayList<Persone> academy) {
        this.academy = academy;
    }

    public Academy(ArrayList<Persone> academy) {
        this.academy = academy;
    }

    public void addPersoneStudent(String name, String educations){
        academy.add(new Student(name, educations));
    }
    public void addPersoneWorker(String name, String workPlace){
        academy.add(new Worker(name, workPlace));
    }

    public void showAll(){
        for (Persone p: academy
             ) {
            System.out.println(p.showData());
        }
        }
    }

