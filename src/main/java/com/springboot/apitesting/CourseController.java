package com.springboot.apitesting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/courses")
    public List<Course> getCoursess(){

        return this.courseService.getCourses();
    }

    @GetMapping("/abc")
    public String handle(){
        return "This is dfgdf dfgdf e d home";
    }

}
