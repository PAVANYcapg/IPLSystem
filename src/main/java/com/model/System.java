package com.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="systemtable")
public class System {
	
	@Id
	@GeneratedValue
	private int systemid;
	
	@OneToOne
	private Admin admin;
	
	@OneToMany(mappedBy="teamid")
	private List<Team> teamList;
	
	@OneToMany(mappedBy="bidderId")
	private List<Bidder> bidderList;
	
	@OneToMany()
	private List<Result> resultList;

	public int getSystemid() {
		return systemid;
	}

	public void setSystemid(int systemid) {
		this.systemid = systemid;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public List<Team> getTeamList() {
		return teamList;
	}

	public void setTeamList(List<Team> teamList) {
		this.teamList = teamList;
	}

	public List<Bidder> getBidderList() {
		return bidderList;
	}

	public void setBidderList(List<Bidder> bidderList) {
		this.bidderList = bidderList;
	}

	public List<Result> getResultList() {
		return resultList;
	}

	public void setResultList(List<Result> resultList) {
		this.resultList = resultList;
	}
	


	
}
