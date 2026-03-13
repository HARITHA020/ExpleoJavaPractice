package fileIo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Employee implements java.io.Serializable{
	public int empID;
	public String EmpName;
	public Employee(int id, String name) {
		this.empID=id;
		this.EmpName=name;
	}
}
public class Serialization {

	public static void main(String[] args) {
		Employee object = new Employee(1,"haritha");
		String filename="file.ser";
		try {
			FileOutputStream file= new FileOutputStream(filename);
			ObjectOutputStream out=new ObjectOutputStream(file);
			//method for serialization of object
			out.writeObject(object);
			file.close();
			System.out.println("obejct has been serialized");
		}
		catch(IOException ex) {
			System.out.println("io exception is caught.");
		}
		
		Employee object1=null;
		try {
			FileInputStream file=new FileInputStream(filename);
			ObjectInputStream in=new ObjectInputStream(file);
			object1=(Employee)in.readObject();
			in.close();
			file.close();
			System.out.println("object has been deserialized");
			System.out.println("Employee Id: "+object1.empID+ " Employee name: "+object1.EmpName);
		}
		catch(IOException e) {
			System.out.println("io exception is caught");
		}
		catch(ClassNotFoundException ex) {
			System.out.println("class not found exception is caught");
		}
	}
	

}
