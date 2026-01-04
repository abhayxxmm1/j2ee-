package com.jsp.unimapWithCascading2.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Branches {


	@Id
	private int id;
	private String branch;
	
	@OneToMany(cascade = CascadeType.ALL)
	List<BranchHead> branchHeads;
	
	public Branches() {
	}

	public Branches(int id, String branch, List<BranchHead> branchHeads) {
		this.id = id;
		this.branch = branch;
		this.branchHeads = branchHeads;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public List<BranchHead> getBranchHeads() {
		return branchHeads;
	}

	public void setBranchHeads(List<BranchHead> branchHeads) {
		this.branchHeads = branchHeads;
	}
}
