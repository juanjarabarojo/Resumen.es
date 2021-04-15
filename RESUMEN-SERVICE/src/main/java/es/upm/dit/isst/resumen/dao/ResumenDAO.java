package es.upm.dit.isst.resumen.dao;

import java.util.List;
import es.upm.dit.isst.resumen.model.Resumen;

public interface ResumenDAO {
	
	public Resumen create(Resumen res);

	public Resumen read(String id);

	public Resumen update(Resumen res);

	public Resumen delete(Resumen res);

	public List<Resumen> readAll();

	public List<Resumen> readAll(String author);

}
