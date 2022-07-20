package com.boost.lesson20_Map;

public class Bolum {

	long id;
	String ad;

	public Bolum(long id, String ad) {
		super();
		this.id = id;
		this.ad = ad;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	@Override
	public String toString() {
		return "Bolum [id=" + id + ", ad=" + ad + "]";
	}

}
