// package com.namhkse.springboot_rest.service;

// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.security.core.userdetails.UsernameNotFoundException;
// import com.namhkse.springboot_rest.model.Account;
// import com.namhkse.springboot_rest.repository.AccountRepository;

// public class AccountDetailService { // implements UserDetailsService, UserDetailsPasswordService{

//     // private AccountRepository accountRepository;

//     // public AccountDetailService(AccountRepository accountRepository) {
//     //     this.accountRepository = accountRepository;
//     // }

//     // public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//     //     Account account = accountRepository.findByUsername(username);

//     //     if (account == null) {
//     //         throw new UsernameNotFoundException("Not found user " + username);
//     //     }

//     //     return account;
//     // }

//     // public UserDetails updatePassword(UserDetails user, String newPassword) {
//     //     Account account = accountRepository.findByUsername(user.getUsername());
//     //     account.setPassword(newPassword);

//     //     accountRepository.save(account);

//     //     return account;
//     // }

// }
