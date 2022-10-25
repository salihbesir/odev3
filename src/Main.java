import odev3.business.CourseManager;
import odev3.business.TeacherManager;
import odev3.core.DatabaseLogger;
import odev3.core.FileLogger;
import odev3.core.ISaveLogger;
import odev3.core.MailLogger;
import odev3.dataAccess.Hibernate;
import odev3.dataAccess.ICourseDao;
import odev3.entities.Course;
import odev3.entities.Teacher;

public class Main {
    public static void main(String[] args) throws Exception {

        ISaveLogger[] loggers={new DatabaseLogger(), new FileLogger(), new MailLogger()
        };
        CourseManager courseManager= new CourseManager(new Hibernate(), loggers);
        Course c1= new Course(2, "java", 10);

        Course c2= new Course(2,"java",10);
courseManager.add(c2);
courseManager.add(c1);


        TeacherManager teacherManager= new TeacherManager(new Hibernate(),loggers );
        Teacher a1= new Teacher(1,"candan",30);
        teacherManager.add(a1);


    }
}