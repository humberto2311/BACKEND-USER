package com.crud.crud.infastructure.repository;

import com.crud.crud.infastructure.dto.UserDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository <UserDto,Integer>{

// @Query (nativeQuery = true,
//          value = "update user set name = :name, " +
//                 "lastName = :last_name where id = :id ")
// @Modifying
// void update(@Param(value="id")String id,
//              @Param(value="name")String name,
//              @Param(value="lastName") String lastName);

}
