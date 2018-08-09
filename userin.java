import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;

public class userin
{

    public static void main(String[] args) throws IOException {
        JFrame jf = new JFrame("a little student manage system");
        jf.setSize(600,700);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);



        JPanel panel = new JPanel(null);


        JTextArea screen = new JTextArea();
        screen.setLineWrap(true);
        screen.setBounds(100,200,400,200);
        screen.append("Name" + "  " + "Age"+ "  " + "Gpa" + "\n");

        JScrollPane scrollPane = new JScrollPane(screen);
        //screen.add(scrollPane);
        //panel.add(scrollPane,BorderLayout.CENTER);

        panel.add(screen);




        BufferedReader bfr = new BufferedReader(new FileReader("information.txt"));
        String line = null;

        while ((line = bfr.readLine())!=null)
        {
            String[] strs = line.split("  ");
            String name = strs[0];
            String age = strs[1];
            String gpa = strs[2];
            screen.append(name + "   " + age + "   " + gpa + "\n");
        }

        JTextField name = new JTextField(8);
        name.setFont(new Font("name",Font.PLAIN,20));
        name.setBounds(20,50,150,50);
        panel.add(name);



        JTextField age = new JTextField(8);
        age.setFont(new Font(null,Font.PLAIN,20));
        age.setBounds(200,50,150,50);
        panel.add(age);

        JTextField gpa = new JTextField(8);
        gpa.setFont(new Font(null,Font.PLAIN,20));
        gpa.setBounds(400,50,150,50);
        panel.add(gpa);

        JButton btn = new JButton("insert");

        btn.setLocation(100,450);
        btn.setSize(100,50);
        btn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Student stu = new Student(name.getText(),Integer.parseInt(age.getText()),Double.parseDouble(gpa.getText()));
                try {
                    FileUtils.insert(stu);
                    screen.append(name.getText() +"  " + age.getText() + "  " + gpa.getText()+"\n");
                } catch (IOException e1) {
                    e1.printStackTrace();
                }

            }
        });


        panel.add(btn);

        JButton btn2 = new JButton("delete");
        btn2.setBounds(400,450,100,50);
        panel.add(btn2);
        jf.setContentPane(panel);

        btn2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                try {
                    Student stu = FileUtils.get();
                    FileUtils.delete(stu);
                    BufferedReader bfr = new BufferedReader(new FileReader("information.txt"));
                    //BufferedWriter bfw = new BufferedWriter(new FileWriter("information.txt"));

                    String line = null;
                    screen.setText("Name" + "  " + "Age"+ "  " + "Gpa" + "\n");
                    while ((line=bfr.readLine())!=null)
                    {
                        String[] strs = line.split("  ");
                        String name = strs[0];
                        String age = strs[1];
                        String gpa = strs[2];
                        screen.append(name + "   " + age + "   " + gpa + "\n");
                    }
                } catch (IOException e1) {
                    e1.printStackTrace();
                }

            }
        });





        jf.setVisible(true);





    }

}
