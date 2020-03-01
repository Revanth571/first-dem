package com.myproject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="booking", uniqueConstraints = { @UniqueConstraint(columnNames = "subjectId")})
public class Booking {
	
	@Id
	@GeneratedValue
	@Column(name="subjectid", unique = true, nullable = false)
	private Long subjectid;
	
	@Column(name="subject", nullable = false)
	private String subject;
	
	
	
	public Booking() {
		super();
	}

	public Booking(Long subjectId, String subject) {
		super();
		this.subjectid = subjectId;
		this.subject = subject;
	}

	public Long getSubjectid() {
		return subjectid;
	}

	public void setSubjectid(Long subjectid) {
		this.subjectid = subjectid;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
	
	
}
