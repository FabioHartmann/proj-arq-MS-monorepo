package com.bcopstein;

import java.lang.ProcessHandle.Info;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import main.java.com.bcopstein.InformtionDTO;

@RestController
public class CurrencyExchangeController {
	
	private java.util.logging.Logger logger = LoggerFactory.getLogger(CurrencyExchangeController.class);
	
	@Autowired
	private CurrencyExchangeRepository repository;
	
	@Autowired
	private Environment environment;
	
	private List<InformationDTO> information = new ArrayList();

	@GetMapping("/list")
	public List<InformationDTO> retrieveExchangeValue() {
				return information;
	}

	@PostMapping("/save")
	public boolean information (
		@RequestBody InformtionDTO addInformation
	) {
		information.add(addInformation);
		logger.info("consultas" , addInformation);
		return true;
	}
}
