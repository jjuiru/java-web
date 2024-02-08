package ioSaveFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class IOsaveFile {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis=new FileInputStream("c:temp/acc.db");
		ObjectInputStream ois= new ObjectInputStream(fis);
		Acc acc2 = (Acc) ois.readObject();
		System.out.println(acc2);
	}
}
