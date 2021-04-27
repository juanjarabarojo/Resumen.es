package es.upm.dit.isst.resumen.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Resumen implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private int id;
	private String title; // No tiene por que ser único, ¿Puede haber varios resumenes del mismo libro?
	private String author; // Nombre y apellidos mejor, no creo que se busque solo por nombre o apellidos el autor
	@Lob
	private byte[] document; //El documento en si, seguramente un pdf
	@Lob 
	private byte[] image;
	//private String writter; //El autor del libro tambien lo podemos poner (poner get y set si se hace
	//categoria
	//Resto de atributos estan relacionados con autenticación se añadiran posteriormente
	
	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

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
