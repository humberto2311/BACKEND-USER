package com.crud.crud.aplication;

import com.crud.crud.domain.entity.interf.User;
import com.crud.crud.domain.service.UserGetService;
import com.crud.crud.domain.service.UserSaveService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
@AllArgsConstructor
@Service
public class UserSave {
   public final UserSaveService userSaveService;
    public  final UserGetService userGetService;
public User saveUser(User user){ userGetService.getUser(user.getId());
      return  userSaveService.save(user);
  }
}
