package SerializationAndDeserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestClass {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		DerivedSerial der = new DerivedSerial(10, 20);

		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(der);

		// closing streams
		oos.close();
		fos.close();

		System.out.println("The object has been serialized");

		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		DerivedSerial deserial = (DerivedSerial)ois.readObject();
		
		// closing streams
		ois.close();
		fis.close();
		
		System.out.println("The object has been de-serialized");
	}

}
