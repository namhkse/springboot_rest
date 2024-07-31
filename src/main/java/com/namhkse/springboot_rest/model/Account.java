// package com.namhkse.springboot_rest.model;

// import java.util.Collection;
// import java.util.HashSet;
// import java.util.Set;

// import org.hibernate.annotations.ManyToAny;
// import org.springframework.security.core.GrantedAuthority;
// import org.springframework.security.core.authority.SimpleGrantedAuthority;
// import org.springframework.security.core.userdetails.UserDetails;

// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.JoinColumn;
// import jakarta.persistence.JoinTable;
// import lombok.Data;
// import lombok.NoArgsConstructor;

// @Data
// @Entity
// @NoArgsConstructor
// public class Account implements UserDetails {

//     @Id
//     @GeneratedValue(strategy = GenerationType.AUTO)
//     private Long id;

//     private String name;

//     private String password;

//     @ManyToAny
//     @JoinTable(name = "account_role", joinColumns = @JoinColumn(name = "account_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
//     private Set<Role> roles = new HashSet<>();

//     @Override
//     public Collection<? extends GrantedAuthority> getAuthorities() {
//         return roles.stream().map(this::mapRole).toList();
//     }

//     private GrantedAuthority mapRole(Role role) {
//         return new SimpleGrantedAuthority(role.getName());
//     }

//     @Override
//     public String getUsername() {
//         return name;
//     }
// }
