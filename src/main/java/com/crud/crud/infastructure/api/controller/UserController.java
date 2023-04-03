package com.crud.crud.infastructure.api.controller;



import com.crud.crud.aplication.UserDelete;
import com.crud.crud.aplication.UserGet;
import com.crud.crud.aplication.UserSave;
import com.crud.crud.domain.entity.interf.User;
import com.crud.crud.infastructure.mapping.MappingUser;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RequestMapping(path = "/user")
public class UserController {

//private final UserUpdate userUpdate;
  private final UserDelete userDelete;
  private final UserSave userSave;
    private final UserGet userGet;
    private  final MappingUser userMap;

    @PostMapping
   public ResponseEntity<User>addUser(@RequestBody User user){
       return new ResponseEntity<>(userSave.saveUser(user), HttpStatus.CREATED);
   }

    @GetMapping
    public ResponseEntity<User>getUser(@RequestParam Integer id){
        return new ResponseEntity(userMap.toDto(userGet.getUser(id)),HttpStatus.OK);
    }
    @DeleteMapping
    public  void userDelete(@RequestParam Integer id){
        userDelete.deleteUser(id);
    }
//    @PutMapping
//    public  void updateUser(@RequestBody User user){
//        userUpdate.updateUser(user);
//    }


}
