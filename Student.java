public class Student extends User {
    private String studentAddress;
    private String instructorName;

    public Student(int Id, String firstname, String lastname, String email,String courseName,
                   String password, String studentAddress,String instructorName){
        super(Id,firstname,lastname,email,courseName,password);
        /*super metodu ile bir alt sınıf üst sınıfın nesnelerini kullanacağı zaman işe yarar*/
        this.studentAddress = studentAddress;
        this.instructorName = instructorName;

    }
    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }
/*getter ve setter metotları sınıflarda olusturduğumuz metot veya değişkenlerin
* özelliklerini belirtmek için kullanılır.Get ve Set metodları ile verilerin korunumu sağlamır
* Bu durum 'data encapsulation' olarak geçer*/
}
