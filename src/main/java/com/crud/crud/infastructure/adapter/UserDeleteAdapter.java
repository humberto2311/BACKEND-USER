package com.crud.crud.infastructure.adapter;

import com.crud.crud.domain.service.UserDeleteService;
import com.crud.crud.infastructure.repository.UserRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UserDeleteAdapter implements UserDeleteService {

    private  final UserRepo userRepo;
    public  void deleteUser(Integer id){
        userRepo.deleteById(id);
    }
}
