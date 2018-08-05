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

	    //System.out.println("abc"=="abc");
        Student s1 = new Student("hiall1",20,4.0);
	    Student s2 = new Student("hiall2",30,4.0);
        Student s3 = new Student("hiall3",30,4.0);
        Student s4 = new Student("hiall4",30,4.0);
        Student s5 = new Student("hiall5",30,4.0);
	    FileUtils.insert(s1);
        FileUtils.insert(s2);
        FileUtils.insert(s3);
//        FileUtils.insert(s4);
//        FileUtils.insert(s5);

        FileUtils.delete(s2);


	}
}