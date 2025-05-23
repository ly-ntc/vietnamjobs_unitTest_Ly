package com.demo.entities;
// Generated May 5, 2024, 7:24:16 PM by Hibernate Tools 4.3.6.Final

import jakarta.persistence.*;
/**
 * Follow generated by hbm2java
 */
@Entity
@Table(name = "follow", catalog = "vietnamjobs")
public class Follow implements java.io.Serializable {

	private Integer id;
	private Employer employer;
	private Seeker seeker;
	private boolean status;

	public Follow() {
	}

	public Follow(Employer employer, Seeker seeker, boolean status) {
		this.employer = employer;
		this.seeker = seeker;
		this.status = status;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "employer_id", nullable = false)
	public Employer getEmployer() {
		return this.employer;
	}

	public void setEmployer(Employer employer) {
		this.employer = employer;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "seeker_id", nullable = false)
	public Seeker getSeeker() {
		return this.seeker;
	}

	public void setSeeker(Seeker seeker) {
		this.seeker = seeker;
	}

	@Column(name = "status", nullable = false)
	public boolean isStatus() {
		return this.status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
