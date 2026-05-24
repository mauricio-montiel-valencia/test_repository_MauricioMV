package Main;

import Controller.CourseRegisterController;
import DBConnection.DBConnection;
import Model.CourseRegisterModel;
import View.CourseRegisterView;

public class Main {
    
    public static void main(String[] args){
        
        CourseRegisterView crView = new CourseRegisterView();
        CourseRegisterModel crModel = new CourseRegisterModel();
        CourseRegisterController crController = new CourseRegisterController(crView, crModel);
        crView.setVisible(true);
        DBConnection dbConnection = new DBConnection();
    }
}
