package com.crud.crud.aplication;

import com.crud.crud.domain.service.UserDeleteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UserDelete {
    private  final UserDeleteService userDeleteService;
  public void deleteUser(Integer id ){
      userDeleteService.deleteUser(id);
  }
}
