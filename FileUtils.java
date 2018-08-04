import java.io.*;

public class FileUtils
{
    static FileReader fr = null;

    static {
        try {
            fr = new FileReader("information.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    static BufferedReader bf = new BufferedReader(fr);


//    static
//    {
//
//        FileWriter fw = null;
//        try {
//            fw = new FileWriter("information.txt",true);
//            fw.write("Name Age GPA" + "\n");
//            fw.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }





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

	public static void /*Student*/ get() throws IOException
    {
		// this function ues to get one student

        String line = bf.readLine();
        String[] strs = line.split("  ");
        for (int i=0, len=strs.length ; i<len;i++)
        {
            System.out.println(strs[i].toString());
        }




	}

}