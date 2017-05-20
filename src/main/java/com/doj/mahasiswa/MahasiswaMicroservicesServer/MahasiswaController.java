package com.doj.mahasiswa.MahasiswaMicroservicesServer;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.doj.mahasiswa.MahasiswaMicroservicesServer.MahasiswaRepository;
import com.doj.mahasiswa.MahasiswaMicroservicesServer.Mahasiswa;

@RestController
public class MahasiswaController {
	
	protected Logger logger = Logger.getLogger(MahasiswaController.class.getName());
	
	@Autowired
	MahasiswaRepository repository;
	
	@RequestMapping("/mahasiswa")
	public Mahasiswa[] All()
	{
		logger.info("mahasiswa-microservice all() invoked");
		List<Mahasiswa> mahasiswa = MahasiswaRepository.getAllMahasiswa();
		logger.info("mahasiswa-microservice all() found: " + mahasiswa.size());
		return mahasiswa.toArray(new Mahasiswa[mahasiswa.size()]);
	}
	
	@RequestMapping("/mahasiswa/{id}")
	public Mahasiswa ById(@PathVariable("nim_mahasiswa") String id)
	{
		logger.info("mahasiswa-microservice byId() invoked: " + id);
		Mahasiswa mahasiswa = MahasiswaRepository.getMahasiswa(id);
		logger.info("mahasiswa-microservice byId() found: " + mahasiswa);
		return mahasiswa;
	}
}
