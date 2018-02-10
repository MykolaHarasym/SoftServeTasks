package Pattern;

public class Singleton1 {                   //lazy singleton, поки хтось не викличе інстанса не буд
    private static  Singleton1 instance;    //"synchronized" is important
    public static synchronized Singleton1 getInstance(){
      if (instance == null){
          instance = new Singleton1();
      }
      return instance;
    }

    @Override
    public String toString() {
        return "I am a singleton1";
    }
}
