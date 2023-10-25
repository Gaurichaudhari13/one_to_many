package com.jsp.one_to_many;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Branch {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String branch_name;
	private String branch_add;
	private long Branch_cno;

	@OneToMany
	private List<Hospital> hospitals;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBranch_name() {
		return branch_name;
	}

	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}

	public String getBranch_add() {
		return branch_add;
	}

	public void setBranch_add(String branch_add) {
		this.branch_add = branch_add;
	}

	public long getBranch_cno() {
		return Branch_cno;
	}

	public void setBranch_cno(long branch_cno) {
		Branch_cno = branch_cno;
	}

	public List<Hospital> getHospitals() {
		return hospitals;
	}

	public void setHospitals(List<Hospital> hospitals) {
		this.hospitals = hospitals;
	}

}
