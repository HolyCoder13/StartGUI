import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class main {
    public static ImageIcon i;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        JFrame f1 = new JFrame("Java gui");
        f1.setBackground(Color.WHITE);

        JLabel label = new JLabel();
        label.setText("code itd");


        JPanel panel = new JPanel();
        panel.setBackground(Color.red);
        panel.setBounds(0,0,100,100);

        JPanel panel1 = new JPanel();
        panel.setBackground(Color.blue);
        panel.setBounds(200,0,100,100);

        System.out.println("Do you want to initialize experimental grapihic GUI?");

        String ans = sc.nextLine();
        ans=ans.toUpperCase();

        if(ans.equals("YES")){
            f1.setSize(640,800);
            f1.setVisible(true);
            f1.add(label);
            f1.add(panel);
            f1.add(panel1);
        }else{
            System.out.println("GUI disabled...");
        }

    }
}
