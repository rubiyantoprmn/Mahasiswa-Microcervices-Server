package com.doj.mahasiswa.MahasiswaMicroservicesServer;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.doj.mahasiswa.MahasiswaMicroservicesServer.Kelas;

public interface KelasRepository extends JpaRepository<Kelas, Long>{
	static List<Kelas> getAllKelas() {
		// TODO Auto-generated method stub
		return null;
	}
	static Kelas getKelas(String id_kelas) {
		// TODO Auto-generated method stub
		return null;
	}

	//List<Kelas> findByName(String name);
}
