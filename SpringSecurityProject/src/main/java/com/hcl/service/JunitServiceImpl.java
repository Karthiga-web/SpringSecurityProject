package com.hcl.service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.entity.JunitEntity;
import com.hcl.entity.Role;
import com.hcl.repository.JunitRepository;


@Service
@Transactional
public class JunitServiceImpl implements JunitService,UserDetailsService {
	@Autowired
	private JunitRepository repository;
	@Override
	public JunitEntity findIfUserExists(String userid) {
		return repository.findByUsername(userid);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		JunitEntity user=repository.findByUsername(username);
		Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
		System.out.println(user.getRoles().toString());
		for (Role role : user.getRoles())
		{
	            grantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));
	    }
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), grantedAuthorities);
	}


}
