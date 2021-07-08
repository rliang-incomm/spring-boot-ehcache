package guru.springframework.ehcache.rest;

import guru.springframework.ehcache.model.Student;
import guru.springframework.ehcache.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/rest/students")
public class StudentRestController {

  private final StudentService studentService;

  @Autowired
  public StudentRestController(StudentService studentService) {
    this.studentService = studentService;
  }

    //curl http://localhost:8080/rest/students/1
  @GetMapping(path = "/{id}", produces = MediaType.TEXT_PLAIN_VALUE)
  public String get(@PathVariable Long id) {
    Optional<Student> student = studentService.find(id);

    if (student.isPresent()) {
      return student.get().toString();
    }

    return "";
  }

  //curl http://localhost:8080/rest/students/json/1
    @GetMapping(path = "/json/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Student getJson(@PathVariable Long id) {
        Optional<Student> student = studentService.find(id);

        if (student.isPresent()) {
            return student.get();
        }

        return null;
    }

  @PostMapping(produces = MediaType.TEXT_PLAIN_VALUE)
  public String create(@RequestParam String firstName, @RequestParam String lastName, @RequestParam String courseOfStudies) {
    Student newStudent = studentService.create(firstName, lastName, courseOfStudies);

    return newStudent.toString();
  }

}
