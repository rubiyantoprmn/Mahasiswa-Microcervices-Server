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
	
	@JoinColumn(name = "id_kelas", referencedColumnName = "id_kelas", nullable = false)
	@ManyToOne(optional = false)
	@NotFound(action = NotFoundAction.IGNORE)
	private Kelas id_kelas;
	
	@JoinColumn(name = "tingkat_mahasiswa", referencedColumnName = "tingkat_mahasiswa", nullable = false)
	@ManyToOne(optional = false)
	@NotFound(action = NotFoundAction.IGNORE)
	private Kelas tingkat_mahasiswa;
	
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
		this.id_kelas = kelas;
	}
	
	public Kelas getKelas()
	{
		return this.id_kelas;
	}
	
	public void setTingkatMahasiswa(Kelas tingkat_mahasiswa)
	{
		this.tingkat_mahasiswa = tingkat_mahasiswa;
	}
	
	public Kelas getTingkatMahasiswa(Kelas tingkat_mahasiswa)
	{
		return this.tingkat_mahasiswa;
	}
	
	public String toString()
	{
		return nim_mahasiswa + "\t" + nama_mahasiswa + "\t" + id_kelas.toString() + "\t" + tingkat_mahasiswa.toString();
	}
}
