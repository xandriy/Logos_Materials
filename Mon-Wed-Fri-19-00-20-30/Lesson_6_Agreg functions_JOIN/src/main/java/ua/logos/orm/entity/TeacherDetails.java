package ua.logos.orm.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "teacher_details")
public class TeacherDetails extends BaseEntity {

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "age")
	private int age;

	@Column(name = "hobby")
	private String hobby;

	@OneToOne(mappedBy = "teacherDetails", cascade = CascadeType.ALL)
	private Teacher teacher;

	public TeacherDetails() {
		// TODO Auto-generated constructor stub
	}

	public TeacherDetails(String firstName, String lastName, int age, String hobby) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.hobby = hobby;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	
	
	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "TeacherDetails [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", hobby=" + hobby
				+ ", getId()=" + getId() + "]";
	}

}
