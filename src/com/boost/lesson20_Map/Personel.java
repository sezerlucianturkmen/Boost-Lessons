package com.boost.lesson20_Map;

public class Personel {

	long id;
	String ad;
	String soyad;
	String telefon;
	Bolum bolum;

	public Personel(long id, String ad, String soyad, String telefon, Bolum bolum) {
		super();
		this.id = id;
		this.ad = ad;
		this.soyad = soyad;
		this.telefon = telefon;
		this.bolum = bolum;
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

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public Bolum getBolum() {
		return bolum;
	}

	public void setBolum(Bolum bolum) {
		this.bolum = bolum;
	}

	@Override
	public String toString() {
		return "Personel [id=" + id + ", ad=" + ad + ", soyad=" + soyad + ", telefon=" + telefon + ", bolum=" + bolum
				+ "]";
	}

}
