package ir.mebank.isc.service;

import ir.mebank.isc.repository.UserRepository;
import ir.mebank.isc.to.User;
import ir.mebank.isc.type.Principal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.util.Assert;

import java.util.Set;
import java.util.stream.Collectors;


public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    UserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = repository.findByUsername(username);
        if (user == null)
            throw new UsernameNotFoundException(username);

        Set<GrantedAuthority> grantedAuthorities = user.getRoles()
                .stream()
                .map(role -> {
                    Assert.isTrue(!role.getName().startsWith("ROLE_"), () -> role + " cannot start with ROLE_ (it is automatically added)");
                    return new SimpleGrantedAuthority("ROLE_" + role.getName());
                }).collect(Collectors.toSet());

        Principal principal = new Principal(user.getUsername(), user.getPassword(), grantedAuthorities);
        principal.setEmail(user.getEmail());
        return principal;
    }
}
