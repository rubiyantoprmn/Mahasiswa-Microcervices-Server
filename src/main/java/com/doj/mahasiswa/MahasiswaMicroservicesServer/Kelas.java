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
	@Column(name= "nama_kelas")
	private char nama_kelas;
	
	@Column(name = "tingkat_kelas")
	private int tingkat_kelas;
	
	protected Kelas()
	{
		
	}
	
	public Kelas(char id_kelas, int tingkat_mahasiswa)
	{
		this.nama_kelas = id_kelas;
		this.tingkat_kelas = tingkat_mahasiswa;
	}
	
	public void setNamaKelas(char id_kelas)
	{
		this.nama_kelas = id_kelas;
	}
	
	public int getNamaKelas()
	{
		return this.nama_kelas;
	}
	
	public void setTingkatKelas(int tingkat_mahasiswa)
	{
		this.tingkat_kelas = tingkat_mahasiswa;
	}
	
	public int  getTingkatKelas()
	{
		return this.tingkat_kelas;
	}
	
	@Override
	public String toString()
	{
		return nama_kelas + "\t" + tingkat_kelas;
	}

}
