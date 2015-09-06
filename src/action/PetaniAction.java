package action;

import java.util.Date;
import java.util.List;

import model.Petani;
import model.Sawah;
import service.PetaniService;
import utils.DateUtils;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class PetaniAction extends ActionSupport implements Preparable {

	private static final long serialVersionUID = 1L;
    private PetaniService petaniService;
    private List<Petani> petanis;
    private List<Sawah> sawahs;
    private Petani petani;
    private Sawah sawah;
    private String nama_petani;
    private String alamat_petani;
    private int umur_petani;
    private String tgl_member_petani;
    private long id_petani;
    private long id_sawah;
    private String nama_sawah;
    private String alamat_sawah;
    private int luas;
    private String tgl_akte_sawah;
	private long id;
	
	public PetaniAction(PetaniService petaniService){
		this.petaniService = petaniService;
	}
	public String execute(){
		return SUCCESS;
		
	}
	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	public String DataPetani(){
		
		petanis = petaniService.findall();
		System.out.println("petani "+petanis);
		return SUCCESS;		
	}
	
	public String Lihatdata(){
		petanis = this.petaniService.petanifindbyid(id);
		nama_petani = petani.getNama_petani();
		alamat_petani = petani.getAlamat_petani();
		umur_petani = petani.getUmur_petani();
		id_sawah = petani.getId_sawah();
		tgl_member_petani = DateUtils.convertDateIntoString(petani.getTgl_member_petani());
		sawahs = this.petaniService.sawahfindbyid(id_sawah);
		nama_sawah = sawah.getNama_sawah();
		alamat_sawah = sawah.getAlamat_sawah();
		luas = sawah.getLuas();
		tgl_akte_sawah = DateUtils.convertDateIntoString(sawah.getTgl_akte_sawah());
		return SUCCESS;
	}
	public String DaftarPetaniBaru(){
		petani = new Petani();
		petani.setNama_petani(nama_petani);
		petani.setAlamat_petani(alamat_petani);
		petani.setUmur_petani(umur_petani);
		petani.setTgl_member_petani(new Date());
	    petaniService.save(petani);
	
		
		return SUCCESS;
	}
	/**
	 * @return the petaniService
	 */
	public PetaniService getPetaniService() {
		return petaniService;
	}
	/**
	 * @param petaniService the petaniService to set
	 */
	public void setPetaniService(PetaniService petaniService) {
		this.petaniService = petaniService;
	}
	/**
	 * @return the petanis
	 */
	public List<Petani> getPetanis() {
		return petanis;
	}
	/**
	 * @param petanis the petanis to set
	 */
	public void setPetanis(List<Petani> petanis) {
		this.petanis = petanis;
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
	 * @return the petani
	 */
	public Petani getPetani() {
		return petani;
	}
	/**
	 * @param petani the petani to set
	 */
	public void setPetani(Petani petani) {
		this.petani = petani;
	}
	/**
	 * @return the tgl_member_petani
	 */
	public String getTgl_member_petani() {
		return tgl_member_petani;
	}
	/**
	 * @param tgl_member_petani the tgl_member_petani to set
	 */
	public void setTgl_member_petani(String tgl_member_petani) {
		this.tgl_member_petani = tgl_member_petani;
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
	 * @return the sawahs
	 */
	public List<Sawah> getSawahs() {
		return sawahs;
	}
	/**
	 * @param sawahs the sawahs to set
	 */
	public void setSawahs(List<Sawah> sawahs) {
		this.sawahs = sawahs;
	}
	/**
	 * @return the sawah
	 */
	public Sawah getSawah() {
		return sawah;
	}
	/**
	 * @param sawah the sawah to set
	 */
	public void setSawah(Sawah sawah) {
		this.sawah = sawah;
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
	 * @return the tgl_akte_sawah
	 */
	public String getTgl_akte_sawah() {
		return tgl_akte_sawah;
	}
	/**
	 * @param tgl_akte_sawah the tgl_akte_sawah to set
	 */
	public void setTgl_akte_sawah(String tgl_akte_sawah) {
		this.tgl_akte_sawah = tgl_akte_sawah;
	}
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

}
