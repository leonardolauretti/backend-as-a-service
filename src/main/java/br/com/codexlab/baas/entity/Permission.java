package br.com.codexlab.baas.entity;

import java.util.UUID;

import jakarta.persistence.*;

@Entity
@Table(name = "permissions")
public class Permission {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;

    private String label;

    private String description;

    private String scope_type;

    private UUID scope_id;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getScopeType() {
        return scope_type;
    }

    public void setScopeType(String scopeType) {
        this.scope_type = scopeType;
    }

    public UUID getScopeId() {
        return scope_id;
    }

    public void setScopeId(UUID scopeId) {
        this.scope_id = scopeId;
    }
}
