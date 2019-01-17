package DefautlMethodInterface;

public interface PI1 {
	default void show() 
    { 
        System.out.println("Default PI1"); 
    } 
}
