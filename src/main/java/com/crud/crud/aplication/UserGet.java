package com.crud.crud.aplication;

import com.crud.crud.domain.service.UserGetService;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import  com.crud.crud.domain.entity.interf.User;
@AllArgsConstructor
@Service
public class UserGet {
    private final UserGetService userGetService;

    public  User getUser(Integer id){
        return userGetService.getUser(id);
    }
}
