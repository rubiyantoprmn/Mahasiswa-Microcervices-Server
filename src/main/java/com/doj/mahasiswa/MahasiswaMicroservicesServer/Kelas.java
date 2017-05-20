package com.doj.mahasiswa.MahasiswaMicroservicesServer;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "kelas")
public class Kelas implements Serializable{
	
private static final long serialVersionUID = 1L;
	
	@Id	
	@Column(name= "id_kelas")
	private char id_kelas;
	
	@Column(name = "tingkat_mahasiswa")
	private char tingkat_mahasiswa;
	
	protected Kelas()
	{
		
	}
	
	public Kelas(char id_kelas, char tingkat_mahasiswa)
	{
		this.id_kelas = id_kelas;
		this.tingkat_mahasiswa = tingkat_mahasiswa;
	}
	
	public void setIdKelas(char id_kelas)
	{
		this.id_kelas = id_kelas;
	}
	
	public char getIdKelas()
	{
		return this.id_kelas;
	}
	
	public void setTingkatMahasiswa(char tingkat_mahasiswa)
	{
		this.tingkat_mahasiswa = tingkat_mahasiswa;
	}
	
	public char  getTingkatMahasiswa()
	{
		return this.tingkat_mahasiswa;
	}
	
	@Override
	public String toString()
	{
		return id_kelas + "\t" + tingkat_mahasiswa;
	}

}
