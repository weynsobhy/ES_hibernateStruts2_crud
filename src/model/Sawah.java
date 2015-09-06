package model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sawah")
public class Sawah implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long id_sawah;
	private String nama_sawah;
	private String alamat_sawah;
	private Date tgl_akte_sawah;
	private int luas;
	private long id_transaksi;
	/**
	 * @return the id_sawah
	 */
	
	@Id
	@GeneratedValue
	public long getId_sawah() {
		return id_sawah;
	}
	/**
	 * @param id_sawah the id_sawah to set
	 */
	public void setId_sawah(long id_sawah) {
		this.id_sawah = id_sawah;
	}
	/**
	 * @return the nama_sawah
	 */
	public String getNama_sawah() {
		return nama_sawah;
	}
	/**
	 * @param nama_sawah the nama_sawah to set
	 */
	public void setNama_sawah(String nama_sawah) {
		this.nama_sawah = nama_sawah;
	}
	/**
	 * @return the alamat_sawah
	 */
	public String getAlamat_sawah() {
		return alamat_sawah;
	}
	/**
	 * @param alamat_sawah the alamat_sawah to set
	 */
	public void setAlamat_sawah(String alamat_sawah) {
		this.alamat_sawah = alamat_sawah;
	}
	/**
	 * @return the tgl_akte_sawah
	 */
	public Date getTgl_akte_sawah() {
		return tgl_akte_sawah;
	}
	/**
	 * @param tgl_akte_sawah the tgl_akte_sawah to set
	 */
	public void setTgl_akte_sawah(Date tgl_akte_sawah) {
		this.tgl_akte_sawah = tgl_akte_sawah;
	}
	/**
	 * @return the luas
	 */
	public int getLuas() {
		return luas;
	}
	/**
	 * @param luas the luas to set
	 */
	public void setLuas(int luas) {
		this.luas = luas;
	}
	/**
	 * @return the id_transaksi
	 */
	public long getId_transaksi() {
		return id_transaksi;
	}
	/**
	 * @param id_transaksi the id_transaksi to set
	 */
	public void setId_transaksi(long id_transaksi) {
		this.id_transaksi = id_transaksi;
	}
	

}
