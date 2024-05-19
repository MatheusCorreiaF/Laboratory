package br.com.redfield.mongoDBexample;

import br.com.redfield.mongoDBexample.model.User;
import br.com.redfield.mongoDBexample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    ResponseEntity<User> addUser(@RequestBody User user){

        return new ResponseEntity<>(userService.saveUser(user), HttpStatus.CREATED);
    }

    @PostMapping("/async/user")
    ResponseEntity<User> addUserAsync(@RequestBody User user) throws InterruptedException {

        return new ResponseEntity<>(userService.saveUserAsync(user), HttpStatus.CREATED);
    }
}
