package com.lambdaschool.school;

import com.lambdaschool.school.model.Course;
import com.lambdaschool.school.model.Instructor;
import com.lambdaschool.school.model.Student;
import com.lambdaschool.school.repository.InstructorRepository;
import com.lambdaschool.school.service.CourseService;
import com.lambdaschool.school.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;



@Transactional
@Component
public class SeedData implements CommandLineRunner
{
    @Autowired
    private StudentService studentService;

    @Autowired
    private CourseService courseService;

    @Autowired
    private InstructorRepository instructrepos;

    @Override
    public void run(String[] args) throws Exception
    {
        Instructor i1 = new Instructor("Sally");

        Instructor i2 = new Instructor("Lucy");

        Instructor i3 = new Instructor("Charlie");

        instructrepos.save(i1);
        instructrepos.save(i2);
        instructrepos.save(i3);


        Course c1 = new Course("Data Science", i1);

        Course c2 = new Course("JavaScript", i1);

        Course c3 = new Course("Node.js", i1);

        Course c4 = new Course("Java Back End", i2);

        Course c5 = new Course("Mobile IOS", i2);

        Course c6 = new Course("Mobile Android", i3);

        Student s1 = new Student("John");
        s1.getCourses().add(courseService.findCourseById(c1.getCourseid()));
        s1.getCourses().add(courseService.findCourseById(c4.getCourseid()));

        Student s2 = new Student("Julian");
        s2.getCourses().add(courseService.findCourseById(c2.getCourseid()));

        Student s3 = new Student("Mary");
        s3.getCourses().add(courseService.findCourseById(c3.getCourseid()));
        s3.getCourses().add(courseService.findCourseById(c1.getCourseid()));
        s3.getCourses().add(courseService.findCourseById(c6.getCourseid()));

        studentService.save(s1);
        studentService.save(s2);
        studentService.save(s3);

        System.out.println("*****COURSE SEED DATA ***");
        System.out.println(c1.getCoursename()+ " " + c1.getCourseid());
        System.out.println(c2.getCoursename()+ " " + c2.getCourseid());
        System.out.println(c3.getCoursename()+ " " + c3.getCourseid());
        System.out.println(c4.getCoursename()+ " " + c4.getCourseid());
        System.out.println(c5.getCoursename()+ " " + c5.getCourseid());
        System.out.println(c6.getCoursename()+ " " + c6.getCourseid());
        System.out.println("*****COURSE SEED DATA ***");
    }
}