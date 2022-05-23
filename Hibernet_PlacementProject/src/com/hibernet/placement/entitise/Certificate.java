package com.hibernet.placement.entitise;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="Certificate")
public class Certificate implements Serializable{
	
	
	private static final long serialVersionUID =1L;  
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="studentID")
	private int studentid;
	
	@Column(name="passingYear")
	private int passingyear;
	
	@Column(name="studentCollege")
	private String stdcollege;
	
	@OneToOne(mappedBy="studentCertificate")
	private Student student;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="College_Id")
	private College college;
	
	
	public Certificate() {
		
	}

	
	

	public Certificate(int studentid, int passingyear, String college) {
		super();
		this.studentid = studentid;
		this.passingyear = passingyear;
		this.stdcollege = stdcollege;
	}




	public int getStudentid() {
		return studentid;
	}




	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}




	public int getPassingyear() {
		return passingyear;
	}




	public void setPassingyear(int passingyear) {
		this.passingyear = passingyear;
	}




	public String getCollege() {
		return stdcollege;
	}




	public void setCollege(String college) {
		this.stdcollege = stdcollege;
	}
	
	public void setCollege(College college) {
		this.college = college;
	}
	
	@Override
	public String toString() {
		return "Certificate [studentid=" + studentid + ", passingyear=" + passingyear + ", college=" + stdcollege + "]";
	}




	
	

}
