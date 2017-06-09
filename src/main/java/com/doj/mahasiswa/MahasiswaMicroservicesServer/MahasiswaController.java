package com.doj.mahasiswa.MahasiswaMicroservicesServer;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.doj.mahasiswa.MahasiswaMicroservicesServer.MahasiswaRepository;
import com.doj.mahasiswa.MahasiswaMicroservicesServer.Mahasiswa;

@RestController
@RequestMapping("/mahasiswa")
public class MahasiswaController {
	
	protected Logger logger = Logger.getLogger(MahasiswaController.class.getName());
	
	@Autowired
	MahasiswaRepository repository;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Mahasiswa> findAll()
	{
		//logger.info("mahasiswa-microservice all() invoked");
		List<Mahasiswa> mahasiswa = repository.findAll();
		//logger.info("mahasiswa-microservice all() found: " + mahasiswa.size());
		return mahasiswa;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Mahasiswa ById(@PathVariable("id") String id)
	{
		//logger.info("mahasiswa-microservice byId() invoked: " + id);
		Mahasiswa mahasiswa = repository.findOne(id);
		//logger.info("mahasiswa-microservice byId() found: " + mahasiswa);
		return mahasiswa;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Mahasiswa saveMahasiswa(@RequestBody Mahasiswa mahasiswa)
	{
		 try{
			 repository.save(mahasiswa);
		 }
		 catch (Exception e){
			 System.out.println(e);
		 }
		 return mahasiswa;
	}
	
	@RequestMapping(value ="/{id}", method = RequestMethod.DELETE)
	public void deleteMahasiswa(@PathVariable("id") String id)
	{
		try{
			repository.delete(id);
		} catch (Exception e){
		
		}
	}
}
