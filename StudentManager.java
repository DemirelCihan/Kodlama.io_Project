public class StudentManager extends UserManager{
  public void yeniHesap(Student student){
      System.out.println(student.getFirstname() + " yeni bir hesap oluşturuldu.");
  }
  public void yeniKurs(Student student){
      System.out.println(student.getCourseName() + " yeni bir kurs seçildi");
  }

}
