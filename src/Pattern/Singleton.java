package Pattern;

import com.sun.org.apache.xpath.internal.operations.String;

public class Singleton { // early singleton
    public static final Singleton instance = new Singleton();

    public Singleton() {
    }

    @Override
    public java.lang.String toString() {
        return "I am a singleton";
    }
}
