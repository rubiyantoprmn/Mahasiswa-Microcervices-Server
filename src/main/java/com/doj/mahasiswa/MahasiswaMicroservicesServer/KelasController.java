package com.doj.mahasiswa.MahasiswaMicroservicesServer;

import java.util.logging.Logger;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.doj.mahasiswa.MahasiswaMicroservicesServer.KelasRepository;

import retrofit2.http.DELETE;

import com.doj.mahasiswa.MahasiswaMicroservicesServer.Kelas;

@RestController
@RequestMapping("/kelas")
public class KelasController {
	
	protected Logger logger = Logger.getLogger(KelasController.class.getName());
	
	@Autowired
	KelasRepository repository;
	
	

	@RequestMapping(method = RequestMethod.GET)
	public List<Kelas> findAll()
	{
		//logger.info("kelas-microservice all() invoked");
		//List<Kelas> kelas = KelasRepository.getAllKelas();
		//logger.info("kelas-microservice all() found: " + kelas.size());
		//return kelas.toArray(new Kelas[kelas.size()]);
		List<Kelas> kls  = repository.findAll();
		return kls;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Kelas ById(@RequestParam("nama_kelas") long id)
	{
		//logger.info("kelas-microservice byId() invoked: " + id);
		//Kelas kelas = KelasRepository.getKelas(id);
		//logger.info("kelas-microservice byId() found: " + kelas);
		Long nama_kelas = id;
		Kelas kls = repository.findOne(nama_kelas);
		return kls;
	}
	
	@RequestMapping(value ="/deletebyid/{id}", method = RequestMethod.DELETE)
	public String deleteById(@RequestParam("nama_kelas") long id)
	{
		repository.delete(id);
		
		return "Delete done";
	}

}
