package com.example.demo.Services;

import com.example.demo.Entity.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CourseServiceImpl implements CourseServices{
    List<Course> list;

    public CourseServiceImpl() {
        list = new ArrayList<>();
        list.add(new Course(1,"Ankit","U.P"));
        list.add(new Course(2,"Ankita","U.P"));
        list.add(new Course(3,"Amit","Delhi"));
        list.add(new Course(4,"Arun","Delhi"));

    }

    public List<Course> getCourses()
    {
        return list;
    }
}
