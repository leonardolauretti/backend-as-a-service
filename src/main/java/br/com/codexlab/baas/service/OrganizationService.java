package br.com.codexlab.baas.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.codexlab.baas.entity.Organization;
import br.com.codexlab.baas.repository.OrganizationRepository;

@Service
public class OrganizationService {

    private final OrganizationRepository organizationRepository;

    public OrganizationService(OrganizationRepository organizationRepository) {
        this.organizationRepository = organizationRepository;
    }
    
    public List<Organization> listOrganizations() {
        return organizationRepository.findAll();
    }

    public void createOrganization() {
        
    }
}
