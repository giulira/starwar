package br.com.starwar.model;

import javax.persistence.Entity;

@Entity
public class Planet extends AbstractEntity{
	private String name;
	private String climate;
	private String terrain;
	private Integer films;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClimate() {
		return climate;
	}
	public void setClimate(String climate) {
		this.climate = climate;
	}
	public String getTerrain() {
		return terrain;
	}
	public void setTerrain(String terrain) {
		this.terrain = terrain;
	}
	public Integer getFilms() {
		return films;
	}
	public void setFilms(Integer films) {
		this.films = films;
	}
	
}
