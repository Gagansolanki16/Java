import javax.swing.*; 
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
public class Form { 
    public static void main(String[] args) {  
        JFrame f = new JFrame();  
        Font font = new Font("Arial", Font.BOLD, 16);

        JLabel sname = new JLabel("Name:");  
        sname.setBounds(20, 50, 100, 20);
        sname.setFont(font); 

        JLabel age = new JLabel("Age: ");  
        age.setBounds(20, 100, 100, 20); 
        age.setFont(font);  

        JTextField snameTF = new JTextField();  
        snameTF.setBounds(120, 50, 100, 20);  

        JTextField ageTF = new JTextField();  
        ageTF.setBounds(120, 100, 100, 20);  

        JLabel gender = new JLabel("Gender:");
        gender.setBounds(20, 150, 100, 20);
        gender.setFont(font);
        ButtonGroup radioGroup = new ButtonGroup();
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        JRadioButton other = new JRadioButton("Other");
        radioGroup.add(male);
        radioGroup.add(female);
        radioGroup.add(other);
        male.setBounds(120, 150, 80, 20);
        female.setBounds(200, 150, 80, 20);
        other.setBounds(280, 150, 80, 20);

        JLabel sub = new JLabel("Subjects: ");
        sub.setBounds(20, 200, 100, 20);  
        sub.setFont(font);

        JCheckBox ma = new JCheckBox("Mathematics");
        ma.setBounds(150,200,80,20);

        JCheckBox sc = new JCheckBox("Science");
        sc.setBounds(250,200,80,20);

        JCheckBox en = new JCheckBox("English");
        en.setBounds(350,200,80,20);

        JLabel choice = new JLabel("Department: ");
        choice.setBounds(20, 250, 100, 20);  
        choice.setFont(font);

        String s1[] = { "CSE", "ECE", "ME"};
        JComboBox dept = new JComboBox(s1);
        dept.setBounds(150, 250, 100, 20);

        JLabel hobby = new JLabel("Hobbies:");
        hobby.setBounds(20, 300, 100, 20);
        hobby.setFont(font);
        String[] hobbiesList = {"Sports", "Music", "Arts"};
        JList<String> hobbies = new JList<>(hobbiesList);
        hobbies.setBounds(120, 300, 100, 60);
        hobbies.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        JLabel add = new JLabel("Additional: ");
        add.setBounds(20,400,100,50);
        add.setFont(font);
        TextArea area = new TextArea("");
        area.setBounds(150,400,100,100);  

        JButton submit = new JButton("Submit");  
        submit.setBounds(20,500,100,30); 

        JButton cls = new JButton("Clear");  
        cls.setBounds(120,500,100,30); 

        f.add(sname);
        f.add(snameTF);
        f.add(age);
        f.add(ageTF);
        f.add(gender);
        f.add(male);
        f.add(female);
        f.add(other);
        f.add(sub);
        f.add(ma);
        f.add(sc);
        f.add(en);
        f.add(choice);
        f.add(dept);
        f.add(hobby);
        f.add(hobbies);
        f.add(add);
        f.add(area);
        f.add(submit);
        f.add(cls);
        
        f.setSize(800,800);  
        f.setLayout(null);  
        f.setVisible(true);

        cls.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                snameTF.setText("");
                ageTF.setText("");
                radioGroup.clearSelection();
                ma.setSelected(false);
                sc.setSelected(false);
                en.setSelected(false);
                dept.setSelectedIndex(0);
                hobbies.clearSelection();
                area.setText("");
            }
        });

        submit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String name = snameTF.getText();
                String age = ageTF.getText();

                // Input Validation for age
                try {
                    Integer.parseInt(age);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(f, "Please enter a valid age", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                String gender = male.isSelected() ? "Male" : female.isSelected() ? "Female" : other.isSelected() ? "Other" : null;
                if (gender == null) {
                    JOptionPane.showMessageDialog(f, "Please select a gender", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                StringBuilder subjects = new StringBuilder();
                if (ma.isSelected()) subjects.append("Mathematics ");
                if (sc.isSelected()) subjects.append("Science ");
                if (en.isSelected()) subjects.append("English ");

                String department = dept.getSelectedItem().toString();

                StringBuilder hobbiesSelected = new StringBuilder();
                for (String hobby : hobbies.getSelectedValuesList()) {
                    hobbiesSelected.append(hobby).append(" ");
                }

                String additionalDetails = area.getText();

                JOptionPane.showMessageDialog(f, "Name: " + name +
                        "\nAge: " + age +
                        "\nGender: " + gender +
                        "\nSubjects: " + (subjects.length() > 0 ? subjects.toString() : "None") +
                        "\nDepartment: " + department +
                        "\nHobbies: " + (hobbiesSelected.length() > 0 ? hobbiesSelected.toString() : "None") +
                        "\nAdditional Details: " + (additionalDetails.isEmpty() ? "None" : additionalDetails),
                        "Student Details", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }
}
