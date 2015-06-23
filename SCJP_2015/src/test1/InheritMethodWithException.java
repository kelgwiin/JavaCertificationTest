package test1;

import java.io.FileNotFoundException;
import java.io.IOException;

public class InheritMethodWithException {
	public void testException() throws FileNotFoundException {
		System.out.println("IO Exception");
		//throw new IOException("Test IO Ex");
	}
}
