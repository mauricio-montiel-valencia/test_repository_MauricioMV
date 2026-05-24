package Controller;

import DBConnection.DBConnection;
import Model.CourseRegisterModel;
import View.CourseRegisterView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class CourseRegisterController {
    
    CourseRegisterView crView;
    CourseRegisterModel crModel;
    DBConnection dbConnection = new DBConnection();
    Connection connection_;
    PreparedStatement ps;
    ResultSet rs;
    
    public CourseRegisterController(CourseRegisterView view, CourseRegisterModel model){
        
        crView = view;
        crModel = model;
        connection_ = dbConnection.getConnection(); 
        addActionListeners();
    }
    
    private void addActionListeners(){
        
        crView.saveCourseButton.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){
                
                crModel.setCourseName(crView.courseNameTXT.getText().trim());
                crModel.setCourseCode(crView.courseCodeTXT.getText().trim());
                crModel.setprofessorCourseName(crView.professorCourseNameTXT.getText().trim());
                
                try{
                    ps = connection_.prepareStatement("insert into course_register (CourseName, CourseCode, professorCourseName) values (?,?,?)");
                    ps.setString(1, crModel.getCourseName());
                    ps.setString(2, crModel.getCourseCode());
                    ps.setString(3, crModel.getprofessorCourseName());
                    
                    int result = ps.executeUpdate(); 
                    
                    if(result > 0){
                        
                        JOptionPane.showMessageDialog(null, "Successfully inserted Data");
                        cleanTXTFields();
                    } 
                    else {
                        JOptionPane.showMessageDialog(null, "Unsuccessfully inserted Data");
                    }
                } catch(Exception ex){ System.err.println("Error " + ex);}
            }
        });
        
        crView.cleanTextFieldsButton.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){
                
                cleanTXTFields();
            }
        });
    }
    
    private void cleanTXTFields(){
        
        crView.courseCodeTXT.setText("");
        crView.courseNameTXT.setText("");
        crView.professorCourseNameTXT.setText("");
        
        crModel.setCourseName("");
        crModel.setCourseCode("");
        crModel.setprofessorCourseName("");
    }
}