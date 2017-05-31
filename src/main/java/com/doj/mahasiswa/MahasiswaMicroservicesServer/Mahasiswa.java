package com.doj.mahasiswa.MahasiswaMicroservicesServer;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;


import com.doj.mahasiswa.MahasiswaMicroservicesServer.Kelas;


@Entity
@Table(name= "mahasiswa")
public class Mahasiswa implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id	
	@Column(name= "nim_mahasiswa")
	private String nim_mahasiswa;
	
	@Column(name = "nama_mahasiswa")
	private String nama_mahasiswa;
	
	@JoinColumn(name = "nama_kelas", referencedColumnName = "nama_kelas", nullable = false)
	@ManyToOne(optional = false)
	@NotFound(action = NotFoundAction.IGNORE)
	private Kelas nama_kelas;
	
	@JoinColumn(name = "tingkat_kelas", referencedColumnName = "tingkat_kelas", nullable = false)
	@ManyToOne(optional = false)
	@NotFound(action = NotFoundAction.IGNORE)
	private Kelas tingkat_kelas;
	
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
	
	public void setKelas(Kelas kelas)
	{
		this.nama_kelas = kelas;
	}
	
	public Kelas getKelas()
	{
		return this.nama_kelas;
	}
	
	public void setTingkatKelas(Kelas tingkat_mahasiswa)
	{
		this.tingkat_kelas = tingkat_mahasiswa;
	}
	
	public Kelas getTingkatKelas(Kelas tingkat_mahasiswa)
	{
		return this.tingkat_kelas;
	}
	
	public String toString()
	{
		return nim_mahasiswa + "\t" + nama_mahasiswa + "\t" + nama_kelas.toString() + "\t" + tingkat_kelas.toString();
	}
}
