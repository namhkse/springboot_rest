// package com.namhkse.springboot_rest.model;

// import java.util.HashSet;
// import java.util.Set;

// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.ManyToMany;
// import lombok.Data;
// import lombok.NoArgsConstructor;

// @Data
// @Entity
// @NoArgsConstructor
// public class Role {
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;

//     private String name;

//     @ManyToMany(mappedBy = "roles")
//     private Set<Account> users = new HashSet<>();
// }
