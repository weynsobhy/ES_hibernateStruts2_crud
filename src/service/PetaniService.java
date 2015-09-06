package service;

import java.util.List;

import model.Petani;
import model.Sawah;

public interface PetaniService {

	public void save(Petani petani);

	public List<Petani> findall();

	public List<Sawah> sawahfindbyid(long id_sawah);
	public List<Petani> petanifindbyid(long id_petani);


}
