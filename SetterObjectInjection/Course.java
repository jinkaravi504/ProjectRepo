package SetterObjectInjection;

public class Course {
	
	String course_id;
	String course_name;
	@Override
	public String toString() {
		return "course_id="+course_id+" "+"course_name="+course_name;
	}
	public String getCourse_id() {
		return course_id;
	}
	public void setCourse_id(String course_id) {
		this.course_id = course_id;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

}
