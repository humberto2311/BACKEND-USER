package com.crud.crud.infastructure.mapping;

import com.crud.crud.domain.entity.interf.User;
import com.crud.crud.infastructure.dto.UserDto;
import org.mapstruct.Mapper;


@Mapper (componentModel = "spring")
public interface MappingUser {


    UserDto toDto(User user);
    User toEntity (UserDto userDto);
}
