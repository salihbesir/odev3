package odev3.business;

import odev3.core.ISaveLogger;
import odev3.dataAccess.ICourseDao;
import odev3.dataAccess.ITeacherDao;
import odev3.entities.Course;
import odev3.entities.Teacher;

import java.util.ArrayList;

public class TeacherManager {
    private ITeacherDao teacherDao;
    private ISaveLogger[] saveLogger;

    public TeacherManager(ITeacherDao teacherDao, ISaveLogger[] saveLogger) {
        this.teacherDao = teacherDao;
        this.saveLogger=saveLogger;

    }

    public void add(Teacher teacher)throws Exception {
       teacherDao.add(teacher);
        for(ISaveLogger logger:saveLogger){
            logger.log(teacher.getName());
        }




    }

}
