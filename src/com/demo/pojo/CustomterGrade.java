package com.demo.pojo;

/**
 * CustomterGrade entity. @author MyEclipse Persistence Tools
 */

public class CustomterGrade implements java.io.Serializable {

	// Fields

	private Integer gradeId;
	private String gradeName;
	private Integer state;

	// Constructors

	/** default constructor */
	public CustomterGrade() {
	}

	/** full constructor */
	public CustomterGrade(String gradeName, Integer state) {
		this.gradeName = gradeName;
		this.state = state;
	}

	// Property accessors

	public Integer getGradeId() {
		return this.gradeId;
	}

	public void setGradeId(Integer gradeId) {
		this.gradeId = gradeId;
	}

	public String getGradeName() {
		return this.gradeName;
	}

	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}

	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

}