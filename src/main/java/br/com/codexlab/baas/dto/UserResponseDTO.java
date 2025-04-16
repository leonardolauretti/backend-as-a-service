package br.com.codexlab.baas.dto;

import java.util.UUID;

import br.com.codexlab.baas.entity.User;

public class UserResponseDTO {

    private UUID id;
    private String email;
    private Boolean email_verified;
    private String phone;
    private Boolean phone_verified;
    private String name;
    private String given_name;
    private String family_name;
    private String picture_url;

    public UserResponseDTO(User user) {
        this.id = user.getId();
        this.email = user.getEmail();
        this.email_verified = user.getEmailVerified();
        this.phone = user.getPhone();
        this.phone_verified = user.getPhoneVerified();
        this.name = user.getName();
        this.given_name = user.getGivenName();
        this.family_name = user.getFamilyName();
        this.picture_url = user.getPictureURL();
    }

    public UUID getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public Boolean getEmailVerified() {
        return email_verified;
    }

    public String getPhone() {
        return phone;
    }

    public Boolean getPhoneVerified() {
        return phone_verified;
    }

    public String getName() {
        return name;
    }

    public String getGivenName() {
        return given_name;
    }

    public String getFamilyName() {
        return family_name;
    }
    
    public String getPictureURL() {
        return picture_url;
    }
}
