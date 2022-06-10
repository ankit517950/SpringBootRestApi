package com.example.demo.Controller;
import java.util.List;

import com.example.demo.Entity.Course;
import com.example.demo.Services.CourseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @Autowired
    private CourseServices courseServices;

    @GetMapping("/home")
    public String home()
    {
        return "This is Ankit here";
    }
    @GetMapping("/courses")
    public List<Course> getCourses()
    {
    return this.courseServices.getCourses();
    }
}
