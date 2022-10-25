package odev3.dataAccess;

import odev3.entities.Course;
import odev3.entities.Teacher;

public class Hibernate implements ICourseDao, ITeacherDao{
    @Override
    public void add(Course course) {
        System.out.println("Hibarnate ile eklendi.");

    }

    @Override
    public void add(Teacher teacher) {
        System.out.println("Eğitmen eklendi.");
    }
}
