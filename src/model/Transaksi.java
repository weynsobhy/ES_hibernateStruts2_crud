package model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Transaksi")
public class Transaksi implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long id_transaksi;
	private long id_petani;
	private int hargabeli;
	private int hargajual;
	private Date tgl_beli_sawah;
	private String belidari;
	/**
	 * @return the id_transaksi
	 */
	
	@Id
	@GeneratedValue
	public long getId_transaksi() {
		return id_transaksi;
	}
	/**
	 * @param id_transaksi the id_transaksi to set
	 */
	public void setId_transaksi(long id_transaksi) {
		this.id_transaksi = id_transaksi;
	}
	/**
	 * @return the id_petani
	 */
	public long getId_petani() {
		return id_petani;
	}
	/**
	 * @param id_petani the id_petani to set
	 */
	public void setId_petani(long id_petani) {
		this.id_petani = id_petani;
	}
	/**
	 * @return the hargabeli
	 */
	public int getHargabeli() {
		return hargabeli;
	}
	/**
	 * @param hargabeli the hargabeli to set
	 */
	public void setHargabeli(int hargabeli) {
		this.hargabeli = hargabeli;
	}
	/**
	 * @return the hargajual
	 */
	public int getHargajual() {
		return hargajual;
	}
	/**
	 * @param hargajual the hargajual to set
	 */
	public void setHargajual(int hargajual) {
		this.hargajual = hargajual;
	}
	/**
	 * @return the tgl_beli_sawah
	 */
	public Date getTgl_beli_sawah() {
		return tgl_beli_sawah;
	}
	/**
	 * @param tgl_beli_sawah the tgl_beli_sawah to set
	 */
	public void setTgl_beli_sawah(Date tgl_beli_sawah) {
		this.tgl_beli_sawah = tgl_beli_sawah;
	}
	/**
	 * @return the belidari
	 */
	public String getBelidari() {
		return belidari;
	}
	/**
	 * @param belidari the belidari to set
	 */
	public void setBelidari(String belidari) {
		this.belidari = belidari;
	}
	
	
	

}
