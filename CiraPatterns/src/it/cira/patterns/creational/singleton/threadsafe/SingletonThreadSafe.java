package it.cira.patterns.creational.singleton.threadsafe;
public class SingletonThreadSafe {

    /** The unique instance **/
    private volatile static SingletonThreadSafe instance;
    
    /** The private constructor **/
    private SingletonThreadSafe() {}

    public static SingletonThreadSafe getInstance() {
      if (instance == null) {
          synchronized(SingletonThreadSafe.class) {
             if (instance == null) {
                instance = new SingletonThreadSafe();
             }
          }
       }
       return instance;
    }
    
    public void print(String msg){
		System.out.println(msg);
	}
}