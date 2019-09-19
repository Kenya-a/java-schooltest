package com.lambdaschool.school.service;

//import org.jboss.arquillian.container.test.api.Deployment;
//import org.jboss.arquillian.junit.Arquillian;
//import org.jboss.shrinkwrap.api.ShrinkWrap;
//import org.jboss.shrinkwrap.api.asset.EmptyAsset;
//import org.jboss.shrinkwrap.api.spec.JavaArchive;
import com.lambdaschool.school.SchoolApplication;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityNotFoundException;
import javax.swing.text.html.parser.Entity;

import static org.junit.jupiter.api.Assertions.*;

//--Generated with test
//@RunWith(Arquillian.class)

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SchoolApplication.class)
public class CourseServiceImplUnitTest
{
    //--Generated with test
//    @Deployment
//    public static JavaArchive createDeployment()
//    {
//        return ShrinkWrap.create(JavaArchive.class).addClass(CourseServiceImpl.class).addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
//    }

    @Autowired
    private CourseService courseService;


    @BeforeEach
    public void setUp()
    {
        MockitoAnnotations.initMocks(this);
    }

    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void findCourseById()
    {
        assertEquals("Java Back End", courseService.findCourseById(4).getCoursename());
    }

    @Test
    public void findAll()
    {
        assertEquals(6, courseService.findAll().size());
    }

    @Test
    public void getCountStudentsInCourse()
    {
    }

    @Test
    public void delete()
    {
        courseService.delete(1);
        assertEquals(5, courseService.findAll().size());

    }

    @Test(expected = EntityNotFoundException.class)
    public void deleteNotFound()
    {
        courseService.delete(12);
        assertEquals(6, courseService.findAll().size());
    }
}
