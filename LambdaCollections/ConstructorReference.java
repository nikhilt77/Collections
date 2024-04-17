class ConstructorReference {

	public static void main(String[] args) {
		MyInterface m=Student::new;
		Student s=m.getStudent("Troy");
	}

}
class Student{
	Student(String name){
		System.out.println(name+" enrolled");
	}
}
interface MyInterface{
	public Student getStudent(String name);
}
