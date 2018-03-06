/**
 * 
 */
package com.ocarmon.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/** 
* @author 李浩铭 
* @since 2018年3月6日 上午9:47:50
*/
@Document(collection = "ocarmon")
public class People {
	
	@Id
	private String id;
	private String name;
	
	private String grade;
	
	private Integer age;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the grade
	 */
	public String getGrade() {
		return grade;
	}

	/**
	 * @param grade the grade to set
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}

	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "People [id=" + id + ", name=" + name + ", grade=" + grade + ", age=" + age + "]";
	}


	
	
}
