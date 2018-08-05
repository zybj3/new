import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main{
	// please add some functions to handle user input
	// for example()
	public static void handle(){
		// first get user input
		// second, choose correspond operator, like FileUtils.insert()
	} 


	public static void main(String[] args) throws IOException {
        Student s1 = new Student("hiall1",20,4.0);
	    Student s2 = new Student("hiall2",30,4.0);
	    FileUtils.insert(s1);
        FileUtils.insert(s2);
        FileUtils.delete(s2);
	}
}