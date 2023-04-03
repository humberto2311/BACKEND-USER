//package com.crud.crud.infastructure.adapter;
//
//import com.crud.crud.domain.entity.interf.User;
//import com.crud.crud.domain.service.UserUpdateService;
//import com.crud.crud.infastructure.repository.UserRepo;
//import lombok.AllArgsConstructor;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//@AllArgsConstructor
//@Service
//public class UserUpdateAdapter implements UserUpdateService {
//    public  final UserRepo userRepo;
//
//    @Transactional
//    public  void updateUser(User user){
//        userRepo.update(
//                user.getId(),
//                user.getName(),
//                user.getLastName());
//    }
//
//}
