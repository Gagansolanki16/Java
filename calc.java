import javax.swing.*; 
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
public class calc { 
 public static void main(String[] args) {  
   JFrame f = new JFrame();  
   Font font = new Font("Arial", Font.BOLD, 16);
   JLabel fno = new JLabel("Number 1:");  
   fno.setBounds(20, 50, 85, 20);
   fno.setFont(font); 
   JLabel sno = new JLabel("Number 2: ");  
   sno.setBounds(20, 80, 85, 20); 
   sno.setFont(font);  
   JTextField fnoTF = new JTextField();  
   fnoTF.setBounds(120, 50, 100, 20);  
   JTextField snoTF = new JTextField();  
   snoTF.setBounds(120, 80, 100, 20);  
   JButton add = new JButton("+");  
   add.setBounds(20, 160, 100, 30);  
   JButton sub = new JButton("-");  
   sub.setBounds(120,160,100,30); 
   JButton mul = new JButton("*");  
   mul.setBounds(20,190,100,30); 
   JButton div = new JButton("/");  
   div.setBounds(120,190,100,30); 
   JButton cls = new JButton("Clear");  
   cls.setBounds(70,240,100,30); 
   JLabel res = new JLabel("Result: ");  
   res.setBounds(20, 280, 100, 30); 
   res.setFont(font); 
   f.add(fno);  
   f.add(sno);  
   f.add(fnoTF);  
   f.add(snoTF);  
   f.add(add);  
   f.add(sub);
   f.add(mul);  
   f.add(div);
   f.add(cls);
   f.add(res);  
   f.setSize(500,400);  
   f.setLayout(null);  
   f.setVisible(true); 
   add.addActionListener(new ActionListener(){
     @Override
     public void actionPerformed(ActionEvent e){
        try {
                int a = Integer.parseInt(fnoTF.getText());
                int b = Integer.parseInt(snoTF.getText());
                res.setText("Result: " +(a+b));
            }
        catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(f,"Invalid Input");
            }
         f.getContentPane().setBackground(Color.BLUE);
    }
  });
   sub.addActionListener(new ActionListener(){
     @Override
     public void actionPerformed(ActionEvent e){
        try {
                int a = Integer.parseInt(fnoTF.getText());
                int b = Integer.parseInt(snoTF.getText());
                res.setText("Result: " +(a-b));
            }
        catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(f,"Invalid Input");
            }
        f.getContentPane().setBackground(Color.GREEN);
    }
  });
   mul.addActionListener(new ActionListener(){
     @Override
     public void actionPerformed(ActionEvent e){
        try {
                int a = Integer.parseInt(fnoTF.getText());
                int b = Integer.parseInt(snoTF.getText());
                res.setText("Result: " +(a*b));
            }
        catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(f,"Invalid Input");
            }
        f.getContentPane().setBackground(Color.RED);
    }
  });
   div.addActionListener(new ActionListener(){
     @Override
     public void actionPerformed(ActionEvent e){
        try {
                int a = Integer.parseInt(fnoTF.getText());
                int b = Integer.parseInt(snoTF.getText());
                res.setText("Result: " +(a/b));
            }
        catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(f,"Invalid Input");
            }
        f.getContentPane().setBackground(Color.YELLOW);
    }
  });
  cls.addActionListener(new ActionListener(){
     @Override
     public void actionPerformed(ActionEvent e){
        fnoTF.setText("");
        snoTF.setText("");
        res.setText("Result: ");
        f.getContentPane().setBackground(null);
    }
  });
 }
} 
