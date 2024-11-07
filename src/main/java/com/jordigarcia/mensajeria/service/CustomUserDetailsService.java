package com.jordigarcia.mensajeria.service;

import com.jordigarcia.mensajeria.persistence.entities.User;
import com.jordigarcia.mensajeria.persistence.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUserName(username);
        if (null == user) {
            throw new UsernameNotFoundException("Ususario no encontrado "+username);
        }
        return user;
    }
}
