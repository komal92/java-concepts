package DefautlMethodInterface;

public interface PI2 {
	default void show() 
    { 
        System.out.println("Default PI2"); 
    } 
}
