package com.jsp.unimapOneToMany3.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class F1 {

	@Id
	private int id ;
	private String eventLocation;
	private double pricePool;
	
	@OneToMany
	List<Players> players;

	public F1() {
	}

	public F1(int id, String eventLocation, double pricePool, List<Players> players) {
		this.id = id;
		this.eventLocation = eventLocation;
		this.pricePool = pricePool;
		this.players = players;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEventLocation() {
		return eventLocation;
	}

	public void setEventLocation(String eventLocation) {
		this.eventLocation = eventLocation;
	}

	public double getPricePool() {
		return pricePool;
	}

	public void setPricePool(double pricePool) {
		this.pricePool = pricePool;
	}

	public List<Players> getPlayers() {
		return players;
	}

	public void setPlayers(List<Players> players) {
		this.players = players;
	}

	@Override
	public String toString() {
		return "F1 [id=" + id + ", eventLocation=" + eventLocation + ", pricePool=" + pricePool + ", players=" + players
				+ "]";
	}
	
	
}
