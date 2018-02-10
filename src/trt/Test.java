package trt;



import java.io.*;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5));
        shapes.add(new Circle(6));
        shapes.add(new Circle(3));
        shapes.add(new Circle(8));
        shapes.add(new Rectangle(5, 4));
        shapes.add(new Rectangle(3, 8));
        shapes.add(new Rectangle(2, 2));
        shapes.add(new Rectangle(7, 5));
        for (Shape sh: shapes
             ) {
            sh.findSquare();
        }



        ArrayList<Shape> shapesAftesSer;
        try{
            FileOutputStream fos = new FileOutputStream("Shape.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(shapes);
            oos.close();
            fos.close();
            System.out.println("Serialzation Done!!");
        }catch(IOException ioe){
            System.out.println(ioe);
        }



        try{
            FileInputStream fis = new FileInputStream("Shape.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            shapesAftesSer = (ArrayList<Shape>) ois.readObject();
            ois.close();
            fis.close();
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
            return;
        }catch(ClassNotFoundException cnfe)
        {
            System.out.println("Academy Class is not found.");
            cnfe.printStackTrace();
            return;
        }



    }
}
