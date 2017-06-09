package com.doj.mahasiswa.MahasiswaMicroservicesServer;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "mahasiswa")
public class Mahasiswa implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id	
	@Column(name= "nim_mahasiswa")
	private String nim_mahasiswa;
	
	@Column(name = "nama_mahasiswa")
	private String nama_mahasiswa;
	
	protected Mahasiswa()
	{
		
	}
	
	public Mahasiswa(String nim_mahasiswa, String nama_mahasiswa)
	{
		this.nim_mahasiswa = nim_mahasiswa;
		this.nama_mahasiswa = nama_mahasiswa;
	}
	
	public void setNimMahasiswa(String nim_mahasiswa)
	{
		this.nim_mahasiswa = nim_mahasiswa;
	}
	
	public String getNimMahasiswa()
	{
		return this.nim_mahasiswa;
	}
	
	public void setNamaMahasiswa(String nama_mahasiswa)
	{
		this.nama_mahasiswa = nama_mahasiswa;
	}
	
	public String getNamaMahasiswa()
	{
		return this.nama_mahasiswa;
	}
	
	
	
	public String toString()
	{
		return nim_mahasiswa + "\t" + nama_mahasiswa ;
	}
}
