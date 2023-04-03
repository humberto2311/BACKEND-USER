package com.crud.crud.infastructure.adapter;

import com.crud.crud.domain.entity.interf.User;
import com.crud.crud.domain.service.UserGetService;
import com.crud.crud.infastructure.dto.UserDto;
import com.crud.crud.infastructure.mapping.MappingUser;
import com.crud.crud.infastructure.repository.UserRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserGetAdapter implements UserGetService {
    private  final UserRepo userRepo;
    private  final MappingUser mappingUser;

    @Override
    public User  getUser(Integer id){
        Optional<UserDto>userDto= userRepo.findById(id);
        return  userDto.map(mappingUser::toEntity).orElse(null);
    }


}
