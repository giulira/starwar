package br.com.starwar.model;

import java.util.List;

import com.google.gson.internal.LinkedTreeMap;

public class ListaPlanetas {

	private Long count;
	private String next ;
	private List results;
	public Long getCount() {
		return count;
	}
	public void setCount(Long count) {
		this.count = count;
	}
	public String getNext() {
		return next;
	}
	public void setNext(String next) {
		this.next = next;
	}
	public List getResults() {
		return results;
	}
	public void setResults(List results) {
		this.results = results;
	}
	
}
