package travelzilla;
import javax.swing.*;
import java.awt.*;

public class SplashScreen {
    JFrame frame;
    JLabel image=new JLabel(new ImageIcon("fly.png"));
    JLabel text=new JLabel("Welcome");
    JProgressBar progressBar=new JProgressBar();
    JLabel message=new JLabel("Reach with us to reach your destination");
    SplashScreen()
    {
        createGUI();
        addText();
        addProgressBar();
        addMessage();
        runningPBar();
    }
    public void createGUI(){
        frame=new JFrame();
        frame.getContentPane().setLayout(null);
        frame.setUndecorated(true);
        frame.setSize(800,600);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(new Color(0,0,51));
        frame.setVisible(true);

    }
    public void addText()
    {
        text.setFont(new Font("lucida calligraphy",Font.BOLD,36));
        text.setBounds(320,150,600,40);
        text.setForeground(Color.WHITE);
        frame.add(text);
    }
    public void addMessage()
    {
        message.setBounds(150,220,600,40);
        message.setForeground(Color.WHITE);
        message.setFont(new Font("lucida calligraphy",Font.BOLD,24));
        frame.add(message);
    }
    public void addProgressBar(){
        progressBar.setBounds(10,550,780,15);
        progressBar.setBorderPainted(true);
        progressBar.setStringPainted(true);
        progressBar.setBackground(Color.WHITE);
        progressBar.setForeground(Color.BLACK);
        progressBar.setValue(0);
        frame.add(progressBar);
    }
    public void runningPBar(){
        int i=0;
        while( i<=100)
        {
            try{
                Thread.sleep(20);
                progressBar.setValue(i++);
                if(i==100){
                    new Dashboard().setVisible(true);
                    frame.dispose();
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    public static void main(String args[]){
        SplashScreen sc = new SplashScreen();
    }
}
