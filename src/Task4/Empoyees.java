package Task4;

public abstract class Empoyees {
    private String name;
    private static long counter ;
    private final long id = counter++;

    public Empoyees(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Persone{" +
                "name='" + getName() + '\'' +
                ", id=" + getId() +
                '}';
    }

    public abstract double calculateAverageMonthlySalary();

}
