package com.lambdaschool.school.service;

//import org.jboss.arquillian.container.test.api.Deployment;
//import org.jboss.arquillian.junit.Arquillian;
//import org.jboss.shrinkwrap.api.ShrinkWrap;
//import org.jboss.shrinkwrap.api.asset.EmptyAsset;
//import org.jboss.shrinkwrap.api.spec.JavaArchive;
import com.lambdaschool.school.SchoolApplication;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//import static org.junit.Assert.*;

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
    
    @Before
    public void setUp() throws Exception
    {
    }

    @After
    public void tearDown() throws Exception
    {
    }

    @Test
    public void findCourseById()
    {
    }

    @Test
    public void findAll()
    {
    }

    @Test
    public void getCountStudentsInCourse()
    {
    }

    @Test
    public void delete()
    {
    }
}
