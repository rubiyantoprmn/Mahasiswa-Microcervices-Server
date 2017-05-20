package com.doj.mahasiswa.MahasiswaMicroservicesServer;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.doj.mahasiswa.MahasiswaMicroservicesServer.Mahasiswa;

public interface MahasiswaRepository extends JpaRepository<Mahasiswa, Long>{

	static List<Mahasiswa> getAllMahasiswa() {
		// TODO Auto-generated method stub
		return null;
	}

	static Mahasiswa getMahasiswa(String id) {
		// TODO Auto-generated method stub
		return null;
	}
}
