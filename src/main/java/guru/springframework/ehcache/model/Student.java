package guru.springframework.ehcache.model;

public class Student {
    public Student(long id, String firstName, String lastName, String courseOfStudies) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.courseOfStudies = courseOfStudies;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCourseOfStudies() {
        return courseOfStudies;
    }

    public void setCourseOfStudies(String courseOfStudies) {
        this.courseOfStudies = courseOfStudies;
    }

    private long id;
  private String firstName;
  private String lastName;
  private String courseOfStudies;

}
