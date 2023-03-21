import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// import javax.swing.JTabbedPane;
public class Project1{
    void Option()
    {

        JFrame f1=new JFrame();
        
        JPanel signup=new JPanel();
        JPanel login=new JPanel();
        JPanel admin=new JPanel();
        JTabbedPane main=new JTabbedPane();
        // Three panel for user login , sign up and admin
        main.addTab("login",login);
        main.addTab("sign up",signup);
        main.addTab("admin",admin);

        // Content of user sign up
        JTextField password=new JTextField("Enter your username");
        JButton submit1=new JButton("Submit");
        JTextField username=new JTextField("Enter your username");
        submit1.setSize(20,20);
        password.setSize(20,20);
        username.setSize(20,20);
        signup.add(submit1);
        signup.add(password);
        signup.add(username);


        //  Content of user login
        JTextField name=new JTextField("Enter your name");
        JTextField username2= new JTextField("Enter your username");
        JTextField password2=new JTextField("Enter the password");
        JButton submit2=new JButton("Submit");
        submit2.setSize(20,20);
        name.setSize(20,20);
        username2.setSize(20,20);
        password2.setSize(20,20);
        login.add(submit2);
        login.add(username2);
        login.add(password2);
        login.add(name);

        // content of admin login
        JTextField admin_username=new JTextField("Enter your username");
        JTextField admin_password=new JTextField("Enter your password");
        JButton submit3=new JButton("Submit");
        submit3.setSize(20,20);
        admin_password.setSize(20,20);
        admin_username.setSize(20,20);
        admin.add(submit3);
        admin.add(admin_password);
        admin.add(admin_username);
       
        
        f1.add(main);
        f1.setSize(500,500);
        f1.setVisible(true);

    }
    public static void main(String atgs[])
    {
        Project1 p1=new Project1();
        p1.Option();
    }
}