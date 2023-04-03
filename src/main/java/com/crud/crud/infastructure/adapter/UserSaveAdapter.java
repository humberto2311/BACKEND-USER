package com.crud.crud.infastructure.adapter;

import com.crud.crud.domain.entity.interf.User;
import com.crud.crud.domain.service.UserSaveService;
import com.crud.crud.infastructure.mapping.MappingUser;
import com.crud.crud.infastructure.repository.UserRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UserSaveAdapter implements UserSaveService {

    private  final UserRepo userRepo;
    private  final MappingUser mappingUser;

    @Override
    public User  save(User user){
        return  mappingUser.toEntity(userRepo.save(mappingUser.toDto(user)));
    }
}
