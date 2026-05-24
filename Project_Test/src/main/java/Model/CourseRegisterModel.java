package Model;

public class CourseRegisterModel {
   
    private String courseName_M, professorCourseName_M, courseCode_M;
    
    public void setCourseName(String courseName_M){this.courseName_M = courseName_M;}
    public String getCourseName(){return courseName_M;}
    
    public void setCourseCode(String courseCode_M){this.courseCode_M = courseCode_M;}
    public String getCourseCode(){return courseCode_M;}

    public void setprofessorCourseName(String professorCourseName_M){this.professorCourseName_M = professorCourseName_M;}
    public String getprofessorCourseName(){return professorCourseName_M;}
}
