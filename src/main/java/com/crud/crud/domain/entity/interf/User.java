package com.crud.crud.domain.entity.interf;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class User {

    private  Integer id;
    private  String name;
    private   String lastName;
}
