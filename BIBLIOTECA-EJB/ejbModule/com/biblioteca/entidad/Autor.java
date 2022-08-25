package com.biblioteca.entidad;


public class Autor {
	
	private Integer codigo;
	private String nombre;
	private byte[] foto;
	public Autor(Integer codigo, String nombre, byte[] foto) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.foto = foto;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public byte[] getFoto() {
		return foto;
	}
	public void setFoto(byte[] foto) {
		this.foto = foto;
	}
	
	

}
