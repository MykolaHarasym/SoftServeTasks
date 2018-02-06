package Task1;

public class Student extends Persone implements java.io.Serializable{
    private String education;

    public Student(String name, String education) {
        super(name);
        this.education = education;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return "Student{" +"Name" + "=" + getName() +" "+
                "education='" + education + '\'' +
                '}';
    }

    @Override
    public String showData() {
        return  "Name=" + getName() + ", " + "Education=" + education;
    }
}
