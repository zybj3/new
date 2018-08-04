import java.io.FileWriter;
import java.io.IOException;

public class FileUtils
{

    public static void insert(Student student) throws IOException
    {
		// this function use to insert new student
        FileWriter fw = new FileWriter("information.txt",true);
        String sname = student.getName();
        int sage = student.getAge();
        double sgpa = student.getGpa();
        fw.write(sname + " " + sage + " "+ sgpa + "\n");
        fw.close();
    }

	public static void delete(Student student)
    {
		// this function use to delete one student
	}

//	public static Student get()
//    {
//		// this function ues to get one student
//
//	}

}