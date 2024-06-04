package com.elife.projet_ff.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elife.projet_ff.service.AvisService;

@RestController
@RequestMapping("/api/avis")

public class AvisController {
    @Autowired
  private final AvisService adAvisService;

public AvisController(AvisService adAvisService) {
    this.adAvisService = adAvisService;
}
@PostMapping("/create")
public ResponseEntity<Avis> createAvis


    
}
