package model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="petani")
public class Petani implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id_petani;
	private String nama_petani;
	private int umur_petani;
	private long id_sawah;
	private Date tgl_member_petani;
	private String alamat_petani;
	/**
	 * @return the id_petani
	 */
	
	@Id
	@GeneratedValue
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
	 * @return the nama_petani
	 */
	public String getNama_petani() {
		return nama_petani;
	}
	/**
	 * @param nama_petani the nama_petani to set
	 */
	public void setNama_petani(String nama_petani) {
		this.nama_petani = nama_petani;
	}
	
	/**
	 * @return the umur_petani
	 */
	public int getUmur_petani() {
		return umur_petani;
	}
	/**
	 * @param umur_petani the umur_petani to set
	 */
	public void setUmur_petani(int umur_petani) {
		this.umur_petani = umur_petani;
	}
	/**
	 * @return the id_sawah
	 */
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
	 * @return the tgl_member_petani
	 */
	public Date getTgl_member_petani() {
		return tgl_member_petani;
	}
	/**
	 * @param tgl_member_petani the tgl_member_petani to set
	 */
	public void setTgl_member_petani(Date tgl_member_petani) {
		this.tgl_member_petani = tgl_member_petani;
	}
	/**
	 * @return the alamat_petani
	 */
	public String getAlamat_petani() {
		return alamat_petani;
	}
	/**
	 * @param alamat_petani the alamat_petani to set
	 */
	public void setAlamat_petani(String alamat_petani) {
		this.alamat_petani = alamat_petani;
	}
	
	

}
