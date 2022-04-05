public class Instructor extends User  {

    private int courseNumber;


    public Instructor(int Id, String firstname, String lastname, String email,String courseName, String password,int courseNumber){
  super(Id, firstname,lastname,email,courseName,password);
   this.courseNumber = courseNumber;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

}
