package br.com.starwar.model;

import java.util.List;

public class PlanetObject{

	
	private String name;
	private Long rotation_period;
	private Long orbital_period;
	private Double diameter ;
	private String climate;
	private String gravity;
	private String terrain;
	private Long surface_water;
	private Double population;
	private List films;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getRotation_period() {
		return rotation_period;
	}
	public void setRotation_period(Long rotation_period) {
		this.rotation_period = rotation_period;
	}
	public Long getOrbital_period() {
		return orbital_period;
	}
	public void setOrbital_period(Long orbital_period) {
		this.orbital_period = orbital_period;
	}
	public Double getDiameter() {
		return diameter;
	}
	public void setDiameter(Double diameter) {
		this.diameter = diameter;
	}
	public String getClimate() {
		return climate;
	}
	public void setClimate(String climate) {
		this.climate = climate;
	}
	public String getGravity() {
		return gravity;
	}
	public void setGravity(String gravity) {
		this.gravity = gravity;
	}
	public String getTerrain() {
		return terrain;
	}
	public void setTerrain(String terrain) {
		this.terrain = terrain;
	}
	public Long getSurface_water() {
		return surface_water;
	}
	public void setSurface_water(Long surface_water) {
		this.surface_water = surface_water;
	}
	public Double getPopulation() {
		return population;
	}
	public void setPopulation(Double population) {
		this.population = population;
	}
	public List getFilms() {
		return films;
	}
	public void setFilms(List films) {
		this.films = films;
	}

	
}
