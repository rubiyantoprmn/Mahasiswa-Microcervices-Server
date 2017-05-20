package com.doj.mahasiswa.MahasiswaMicroservicesServer;

import java.util.logging.Logger;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.doj.mahasiswa.MahasiswaMicroservicesServer.KelasRepository;
import com.doj.mahasiswa.MahasiswaMicroservicesServer.Kelas;

@RestController
public class KelasController {
	
	protected Logger logger = Logger.getLogger(KelasController.class.getName());
	
	@Autowired
	KelasRepository repository;
	
	

	@RequestMapping("/kelas")
	public Kelas[] All()
	{
		logger.info("kelas-microservice all() invoked");
		List<Kelas> kelas = KelasRepository.getAllKelas();
		logger.info("kelas-microservice all() found: " + kelas.size());
		return kelas.toArray(new Kelas[kelas.size()]);
	}
	
	@RequestMapping("/kelas/{id}")
	public Kelas ById(@PathVariable("id_kelas") String id)
	{
		logger.info("kelas-microservice byId() invoked: " + id);
		Kelas kelas = KelasRepository.getKelas(id);
		logger.info("kelas-microservice byId() found: " + kelas);
		return kelas;
	}
	
	@RequestMapping("/kelas/deletebyid")
	public String deleteById(@RequestParam("id_kelas") long id)
	{
		repository.delete(id);
		return "Delete done";
	}

}
