package es.upm.dit.isst.resumen.dao;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import es.upm.dit.isst.resumen.model.Resumen;

public class ResumenDAOImplementation implements ResumenDAO {
	private static  ResumenDAOImplementation instancia = null;
    private ResumenDAOImplementation() {
    }
    public static ResumenDAOImplementation getInstance() {
	    if( null == instancia )
	      instancia = new ResumenDAOImplementation();
	    return instancia;
    }
	
	@Override
	public Resumen create(Resumen res) {
		Session session = SessionFactoryService.get().openSession();
		session.beginTransaction();
		try {
			session.save(res);
		} catch(Exception e) {
			res = null;
		}
		session.getTransaction().commit();
		session.close();
		return res;
	}

	@Override
	public Resumen read(String id) {
		  Session session = SessionFactoryService.get().openSession();
		  session.beginTransaction();
		  Resumen res = session.get(Resumen.class, id);
		  session.getTransaction().commit();
		  session.close();
		  return res;
	}

	@Override
	public Resumen update(Resumen res) {
		Session session = SessionFactoryService.get().openSession();
		session.beginTransaction();
		session.saveOrUpdate(res);
		session.getTransaction().commit();
		session.close();
		return res;
	}

	@Override
	public Resumen delete(Resumen res) {
		Session session = SessionFactoryService.get().openSession();
		session.beginTransaction();
		session.delete(res);
		session.getTransaction().commit();
		session.close();
		return res;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Resumen> readAll() {
		List<Resumen> resumenes = new ArrayList<Resumen> ();
		Session session = SessionFactoryService.get().openSession();
		session.beginTransaction();
		resumenes.addAll(session.createQuery("from Resumen").list());
		session.getTransaction().commit();
		session.close();
		return resumenes;
	}

	@Override
	public List<Resumen> readAll(String author) {
		List<Resumen> result = new ArrayList<Resumen> ();
		for (Resumen res : this.readAll())
			if (res.getAuthor().equals(author))
				result.add(res);
		return result;
	}

}
