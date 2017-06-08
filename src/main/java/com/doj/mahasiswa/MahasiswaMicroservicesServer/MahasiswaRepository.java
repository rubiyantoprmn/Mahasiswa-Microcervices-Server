package com.doj.mahasiswa.MahasiswaMicroservicesServer;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.doj.mahasiswa.MahasiswaMicroservicesServer.Mahasiswa;

public interface MahasiswaRepository extends JpaRepository<Mahasiswa, String>{

	
}
