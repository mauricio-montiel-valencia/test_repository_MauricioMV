package View;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CourseRegisterView extends JFrame{
    
    JPanel panel;
    public JTextField courseNameTXT, courseCodeTXT, professorCourseNameTXT;
    public JButton saveCourseButton, cleanTextFieldsButton;
    
    public CourseRegisterView(){
    
        createWindow();
        createPanel();
        createLabels();
        createTextFields();
        createButtons();
    }
    
    private void createWindow(){
    
        setSize(800, 600);
        setTitle("Course Register");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
    
    private void createPanel(){
    
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
    }
    
    private void createLabels(){
    
        JLabel courseNameLabel = new JLabel("Course Name:");
        courseNameLabel.setBounds(200, 100, 150, 40);
        panel.add(courseNameLabel);
        
        JLabel courseCodeLabel = new JLabel("Course Code:");
        courseCodeLabel.setBounds(200, 200, 150, 40);
        panel.add(courseCodeLabel);
        
        JLabel courseProfessorNameLabel = new JLabel("Professor Course Name:");
        courseProfessorNameLabel.setBounds(200, 300, 150, 40);
        panel.add(courseProfessorNameLabel);
    }
    
    private void createTextFields(){
    
        courseNameTXT = new JTextField();
        courseNameTXT.setBounds(350, 110, 150, 20);
        panel.add(courseNameTXT);
        
        courseCodeTXT = new JTextField();
        courseCodeTXT.setBounds(350, 210, 150, 20);
        panel.add(courseCodeTXT);
        
        professorCourseNameTXT = new JTextField();
        professorCourseNameTXT.setBounds(350, 310, 150, 20);
        panel.add(professorCourseNameTXT);
    }
    
    private void createButtons(){
    
        saveCourseButton = new JButton("Save Course");
        saveCourseButton.setBounds(250, 450, 150, 40);
        panel.add(saveCourseButton);
        
        cleanTextFieldsButton = new JButton("Clean Text Fields");
        cleanTextFieldsButton.setBounds(450, 450, 150, 40);
        panel.add(cleanTextFieldsButton);
    }
}
