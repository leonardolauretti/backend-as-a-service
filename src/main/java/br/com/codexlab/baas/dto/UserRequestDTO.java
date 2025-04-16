package br.com.codexlab.baas.dto;

import java.util.UUID;

public class UserRequestDTO {

    private UUID id;
    private String email;
    private String phone;
    private String password;
    private String name;
    private String given_name;
    private String family_name;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGivenName() {
        return given_name;
    }

    public void setGivenName(String givenName) {
        this.given_name = givenName;
    }

    public String getFamilyName() {
        return family_name;
    }

    public void setFamilyName(String familyName) {
        this.family_name = name;
    }
}
