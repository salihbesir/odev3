package odev3.dataAccess;

import odev3.entities.Course;

public class Jdbc implements ICourseDao{
    @Override
    public void add(Course course) {
        System.out.println("Jdbc ile eklendi.");
    }
}
