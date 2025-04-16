package br.com.codexlab.baas.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import br.com.codexlab.baas.dto.UserRequestDTO;
import br.com.codexlab.baas.dto.UserResponseDTO;
import br.com.codexlab.baas.entity.User;
import br.com.codexlab.baas.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
        this.passwordEncoder = new BCryptPasswordEncoder();
    }
    
    public List<UserResponseDTO> listUsers() {
        return userRepository.findAll()
            .stream()
            .map(user -> new UserResponseDTO(user))
            .toList();
    }

    public UserResponseDTO createUser(UserRequestDTO dto) {
        User user = new User();
        user.setEmail(dto.getEmail());
        user.setPhone(dto.getPhone());
        user.setPassword(passwordEncoder.encode(dto.getPassword()));
        user.setName(dto.getName());
        user.setGivenName(dto.getGivenName());
        user.setFamilyName(dto.getFamilyName());
        user = userRepository.save(user);
        return new UserResponseDTO(user);
    }
}
