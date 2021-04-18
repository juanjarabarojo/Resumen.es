package es.upm.dit.isst.resumen.model;

import java.io.Serializable;

//Generar getters y setters, equals para id, Tambien añadir librerias de persistencia en el Maven.
public class Resumen implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private String title; // No tiene por que ser único, ¿Puede haber varios resumenes del mismo libro?
	private String author; // Nombre y apellidos mejor, no creo que se busque solo por nombre o apellidos el autor
	private byte[] document; //El documento en si, seguramente un pdf
	//private String writter; //El autor del libro tambien lo podemos poner (poner get y set si se hace
	//Resto de atributos estan relacionados con autenticación se añadiran posteriormente
	
	public Resumen() {}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public byte[] getDocument() {
		return document;
	}
	public void setDocument(byte[] document) {
		this.document = document;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Resumen other = (Resumen) obj;
		if (id != other.id)
			return false;
		return true;
	}
	

}
