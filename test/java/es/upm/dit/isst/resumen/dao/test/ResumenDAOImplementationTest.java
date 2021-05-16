package es.upm.dit.isst.resumen.dao.test;



import static org.junit.jupiter.api.Assertions.*;



import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



import es.upm.dit.isst.resumen.dao.ResumenDAO;
import es.upm.dit.isst.resumen.dao.ResumenDAOImplementation;
import es.upm.dit.isst.resumen.model.Resumen;



class ResumenDAOImplementationTest {

@Test
final void testResumen() {
ResumenDAO resumendao = ResumenDAOImplementation.getInstance();

Resumen resumen = new Resumen();
resumen.setId("0");
resumen.setAuthor("Cervantes");
resumen.setDocument("/documento");
resumen.setImage("/imagen");

resumendao.create(resumen);

Resumen resumen2 = resumendao.read("0");
assertEquals(resumen2.getId(), resumen.getId());

resumen.setAuthor("Pepe");
resumendao.update(resumen);
resumen2 = resumendao.read("0");
assertNotEquals(resumen2.getAuthor(), "Cervantes");


resumendao.delete(resumen);
resumen2 = resumendao.read("0");
assertNull(resumen2);




  }
}
