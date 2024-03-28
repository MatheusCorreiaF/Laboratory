package br.com.redfield.mongoDBexample.service;

import br.com.redfield.mongoDBexample.model.User;
import br.com.redfield.mongoDBexample.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User saveUser(User user){

        return userRepository.save(user);
    }

    public User findUser(String email){

        return userRepository.findByEmail(email);

    }
}
