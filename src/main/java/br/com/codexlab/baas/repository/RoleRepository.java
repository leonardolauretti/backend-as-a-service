package br.com.codexlab.baas.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.codexlab.baas.entity.Role;

public interface RoleRepository extends JpaRepository<Role, UUID> {
    
}
