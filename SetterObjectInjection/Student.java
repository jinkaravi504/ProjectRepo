package SetterObjectInjection;

public class Student {
	
	Integer sid;
	String sname;
	Integer marks;
	Course c;
	@Override
	public String toString() {
		return "sid=" + sid + ", sname=" + sname + ", marks=" + marks+" "+c;
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Integer getMarks() {
		return marks;
	}
	public void setMarks(Integer marks) {
		this.marks = marks;
	}
	public Course getC() {
		return c;
	}
	public void setC(Course c) {
		this.c = c;
	}
	

}
