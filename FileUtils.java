import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtils
{
    static
    {
        FileWriter fw = null;
        try {
            fw = new FileWriter("information.txt",true);
            fw.write("Name Age GPA" + "\n");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }





    public static void insert(Student student) throws IOException
    {
		// this function use to insert new student
        String sname = student.getName();
        int sage = student.getAge();
        double sgpa = student.getGpa();

        FileWriter fw = new FileWriter("information.txt",true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(sname + "  " + sage + "  " + sgpa + "\n");
        bw.close();
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