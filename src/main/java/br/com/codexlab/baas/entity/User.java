package br.com.codexlab.baas.entity;

import java.util.UUID;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    
    @Id()
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String email;

    private Boolean email_verified;

    private String phone;

    private Boolean phone_verified;

    private String password;

    private String name;

    private String given_name;

    private String family_name;

    private String picture_url;

    // getters and setters

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

    public Boolean getEmailVerified() {
        return email_verified;
    }

    public void setEmailVerified(Boolean emailVerified) {
        this.email_verified = emailVerified;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Boolean getPhoneVerified() {
        return phone_verified;
    }

    public void setPhoneVerified(Boolean phoneVerified) {
        this.phone_verified = phoneVerified;
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
        this.family_name = familyName;
    }

    public String getPictureURL() {
        return picture_url;
    }

    public void setPictureURL(String pictureURL) {
        this.picture_url = pictureURL;
    }

}
