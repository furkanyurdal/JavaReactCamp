package oopIntroWork;

public class CourseManager {

	public void registerToCourse(Course course) {
		System.out.println("Kay�t oldunuz. : " + course.name);
		
	}
	
	public void completedToCourse(Course course) {
		System.out.println(course.name + " kursunu ba�ar�yla tamamlad�n�z.");
	}
}
