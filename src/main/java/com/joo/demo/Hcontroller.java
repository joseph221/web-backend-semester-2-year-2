package com.joo.demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("service")
public class Hcontroller {
    
    @Autowired
	private SerRepository servRepository;

    @GetMapping("v")
	List<Service> getAllServices(){
		return 	servRepository.findAll();
    }

   @PostMapping("v")
    public void service(@RequestBody Service service){
        servRepository.save(service);
    }
    
    @GetMapping("/v/{id}")
    public ResponseEntity<Service> getServiceById(@PathVariable long id){
        Service service = servRepository.findById(id).orElseThrow();
        return ResponseEntity.ok(service);
    }

    @PutMapping("/v/{id}")
    public ResponseEntity<Service> updateService(@PathVariable long id,@RequestBody Service serv){
        Service service = servRepository.findById(id).orElseThrow();
        service.setDate(serv.getDate());
        service.setDescription(serv.getDescription());
        service.setQuantity(serv.getQuantity());
        service.setPrice(serv.getPrice());
        service.setRefNo(serv.getRefNo());
        service.setPlateNo(serv.getPlateNo());
        service.setLicence(serv.getLicence());

        Service updatedServ = servRepository.save(service);

        return ResponseEntity.ok(updatedServ);
    }

    @DeleteMapping("/v/{id}")
    public ResponseEntity<Map<String,Boolean>> delete(@PathVariable long id){
        Service service = servRepository.findById(id).orElseThrow();
        servRepository.delete(service);
        Map<String,Boolean> response = new HashMap<>();
        response.put("DELETED", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
}
