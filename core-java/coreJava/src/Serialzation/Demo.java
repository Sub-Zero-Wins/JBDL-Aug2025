package Serialzation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import lambdaExpressions.AtmData;

public class Demo {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException
	{
		AtmData amtData = new AtmData(1, 123456, "SyedSaqib", 1234, 19000);

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("atmData.txt"));

		oos.writeObject(amtData);


		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("atmData.txt"));

		AtmData data=(AtmData)ois.readObject();
		System.out.println(data);
	}
}
