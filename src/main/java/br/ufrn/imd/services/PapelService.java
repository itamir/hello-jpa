package br.ufrn.imd.services;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ufrn.imd.domain.Papel;
import br.ufrn.imd.repositories.PapelRepository;

@RestController
public class PapelService {

	private final PapelRepository repository;
	
	public PapelService(PapelRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping("/papeis")
	public List<Papel> getUsers() {
		return (List<Papel>) repository.findAll();
	}

}
