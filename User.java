public class User {

    private int Id;
    private String firstname;
    private String lastname ;
    private String email;
    private String courseName;
    private String password;

    public User(int Id, String firstname, String lastname, String email,String courseName, String password) {
        this.Id = Id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.courseName = courseName;
        this.password = password;

    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
