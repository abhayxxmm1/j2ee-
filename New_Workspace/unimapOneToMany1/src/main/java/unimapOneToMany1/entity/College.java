package unimapOneToMany1.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class College {

	@Id
	private int id;
	private String name;
	private String loc;
	
	@OneToMany
	List<Student> students;
	
	public College() {
	}




	public College(int id, String name, String loc, List<Student> students) {
		this.id = id;
		this.name = name;
		this.loc = loc;
		this.students = students;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLoc() {
		return loc;
	}


	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	public List<Student> getStudents() {
		return students;
	}




	public void setStudents(List<Student> students) {
		this.students = students;
	}

}
