package com.springboot.apitesting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImple implements CourseService{

    //List<Course> list;

    @Autowired
    CourseDao courseDao;

    public CourseServiceImple(){
        /*
        list = new ArrayList<>();

        list.add(new Course(145, "Core Java", "This is complete core java course"));
        list.add(new Course(4343, "Spring Boot", "This is complete Spring Boot course"));

         */
    }



    @Override
    public List<Course> getCourses() {
        return courseDao.findAll();
    }

    @Override
    public Course getCourse(long courseId){
        /*
        Course c = null;
        for (Course course: list){
            if (course.getId()==courseId){
                c = course;
                break;
            }
        }

        return c;
         */

        return courseDao.getOne(courseId);

    }

    @Override
    public Course addCourse(Course course){
        /*
        list.add(course);
        return course;
         */
        courseDao.save(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course){
        /*
        list.add(course);
        return course;
        */
        courseDao.save(course);
        return course;
    }

    @Override
    public void deleteCourse(long parseLong){
        Course entity = courseDao.getOne(parseLong);
        courseDao.delete(entity);
    }

}
