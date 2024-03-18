package ib.ts_2.controller;

import ib.ts_2.entity.User;
import ib.ts_2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {this.userRepository = userRepository;}
    @PostMapping("/add")
    public @ResponseBody User addUser(@RequestBody User user){return userRepository.save(user);}

    @GetMapping("/getAll")
    public @ResponseBody Iterable<User> getAllUsers(){
        return userRepository.findAll();
    }

}
