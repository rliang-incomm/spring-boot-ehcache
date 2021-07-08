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

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCourseOfStudies() {
        return courseOfStudies;
    }


  private final long id;
  private final String firstName;
  private final String lastName;
  private final String courseOfStudies;

}
