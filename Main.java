public class Main {
    public static void main(String[] args) {
        Student student = new Student(1,"cihan", "demirel","demirelcihan@hotmail", "java kursu","1235",
                "Eskişehir","Engin");

        Instructor instructor = new Instructor(5,"Engin","Demiroğ", "engin@info","java kursu","789456",12 );

        StudentManager studentManager = new StudentManager();
        studentManager.yeniHesap(student);
        studentManager.yeniKurs(student);

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.sistemeGiris(instructor);
    }

}
/*Yapılan bu ödevde inheritance yapısı kullanılmıştır. Inheritance yapısı ile alt sınıflar üst sınıftan miras alması sağlanmıştır 'extends komutu ile' .
* Instructor ve Students sınıflarında kullanılan 'super' yapısı ile bir alt sınıfın üst sınıfa ait olan nesneleri veya metotları kullanmasına olanak sağlar.
* Modellenen UserManager,InstructorManager ve StudentManager sınıflarında  daha önce belirttiğimiz User Instructor ve Student sınıflarının içlerinde nasıl
* yönetileceğine dair kısa bir  çalışma yapılmıstır.*/
