import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils
{
    private static FileReader fr = null;

    static {
        try {
            fr = new FileReader("information.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static BufferedReader bf = new BufferedReader(fr);


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

	public static void delete(Student student) throws IOException
    {
		String name = student.getName();

        String line = null;
        FileReader delreader = new FileReader("information.txt");
        BufferedReader bf = new BufferedReader(delreader);


        int row = 0;
        while ((line=bf.readLine())!=null)
        {
            String[] strs = line.split("  ");

            String delname = strs[0];
            int age = Integer.parseInt(strs[1]);
            double gpa = Double.parseDouble(strs[2]);

            if (delname==name)
            {
                bf.close();
                break;
            }

            row++;
        }


        List list = new ArrayList();

        String line1 = null;
        FileReader delreader1 = new FileReader("information.txt");
        BufferedReader bf1 = new BufferedReader(delreader);

        int num = 0;
        while((line1=bf1.readLine())!=null)
        {
            if (num == row)
            {
                continue;
            }
            else
            {
                list.add(line);
                num++;
            }
        }

        BufferedWriter bfw = new BufferedWriter(new FileWriter("information.txt") );
        for (int i = 0; i<list.size();i++)
        {
            System.out.println(list.get(i).toString());
            bfw.write(list.get(i).toString());
            bfw.newLine();
        }

        bf1.close();
        bfw.close();
    }

	public static Student get() throws IOException
    {
		// this function ues to get one student

        String line = bf.readLine();
        String[] strs = line.split("  ");

        String name = strs[0];
        int age = Integer.parseInt(strs[1]);
        double gpa = Double.parseDouble(strs[2]);

        Student s = new Student(name,age,gpa);

        //System.out.println(s.getAge() + ","+ s.getName()+","+s.getGpa());
        return s;






	}

}