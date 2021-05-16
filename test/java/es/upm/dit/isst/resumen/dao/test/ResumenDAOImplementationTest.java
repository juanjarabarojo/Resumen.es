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

/*
@AfterEach
void finish() {

Resumen resumen = new Resumen();
Resumen resumen2 = new Resumen();

ResumenDAOImplementation.getInstance().delete(resumen);
ResumenDAOImplementation.getInstance().delete(resumen2);
}





@Test
void testRead() {

Resumen resumen2 = new Resumen();

resumen2.setId("0");



Resumen resumen = ResumenDAOImplementation.getInstance().read("0");

assertEquals(resumen,resumen2);
}



@Test
void testUpdate() {
ResumenDAO resumenDAO = ResumenDAOImplementation.getInstance();

Resumen resumen = new Resumen();
Resumen resumen2 = resumenDAO.read("0");

resumen.setId("0");
resumenDAO.update(resumen);
resumen2 = resumenDAO.read("0");
assertNotEquals(resumen2.getId(), "1");
}



@Test
void testDelete() {
ResumenDAO resumenDAO = ResumenDAOImplementation.getInstance();

Resumen resumen = new Resumen();



resumen.setId("0");



resumen.setTitle("EL Quijote");



resumenDAO.delete(resumen);



assertNull(ResumenDAOImplementation.getInstance().read("0"));
}



@Test
void testReadAll() {
fail("Not yet implemented");
}



@Test
void testReadAllString() {
fail("Not yet implemented");
}
*/
}
