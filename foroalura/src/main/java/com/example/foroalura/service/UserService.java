package com.example.foroalura.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Aquí debes implementar la lógica para cargar el usuario desde la base de datos
        return User.withUsername("usuario")
                .password("{noop}contraseña")  // {noop} indica que la contraseña no está encriptada
                .roles("USER")
                .build();
    }
}
