package com.crud.crud.infastructure.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
@Entity
@NoArgsConstructor
public class UserDto {
    @Id

    private  Integer id;
    private  String name;
    private   String lastName;
}
