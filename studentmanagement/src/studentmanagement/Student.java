package studentmanagement;

	public class Student {
	    private int id;
	    private String name;
	    private int age;
	    private String course;

	    public Student(int id, String name, int age, String course) {
	        this.id = id;
	        this.name = name;
	        this.age = age;
	        this.course = course;
	    }

	    public int getId() {
	        return id;
	    }

	    public void displayInfo() {
	        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age + ", Course: " + course);
	    }
	}



