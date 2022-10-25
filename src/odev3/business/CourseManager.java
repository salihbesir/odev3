package odev3.business;

import odev3.core.ISaveLogger;
import odev3.dataAccess.ICourseDao;
import odev3.entities.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    private ICourseDao courseDao;
    private ISaveLogger[] saveLogger;
    static List<Course> courseTmp;

    public CourseManager(ICourseDao coursedao, ISaveLogger[] saveLogger) {
        this.courseDao = coursedao;
        this.saveLogger=saveLogger;
        courseTmp= new ArrayList<>();
    }

    public void add(Course course)throws Exception {
        boolean isMatch =  courseTmp.stream().anyMatch(i-> i.getName() == course.getName());
        if(!isMatch && course.getPrice()>0) {
            courseDao.add(course);
            courseTmp.add(course);
        }
        else
            System.out.println("Ayni isme ait kayitli egitmen database veya hibernate kayit yapilmadi");

        for(ISaveLogger logger:saveLogger){
            logger.log(course.getName());
        }


    }

}
