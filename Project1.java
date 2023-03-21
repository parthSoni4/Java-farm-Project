import javax.swing.*;

public class Project1{
    void SignUp()
    {
        JFrame f1=new JFrame();
        JButton submit=new JButton("Submit");
        submit.setSize(20,20);
        JTextField password=new JTextField("Enter your username");
        password.setSize(20,20);
        JTextField username=new JTextField("Enter your username");
        username.setSize(20,20);
        JPanel signup=new JPanel();
        signup.add(submit);
        signup.add(password);
        signup.add(username);
        f1.add(signup);
        f1.setSize(500,500);
        f1.setVisible(true);

    }
    public static void main(String atgs[])
    {
        Project1 p1=new Project1();
        p1.SignUp();
    }
}