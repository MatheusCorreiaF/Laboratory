package br.com.redfield.mongoDBexample.service;

import br.com.redfield.mongoDBexample.model.User;
import br.com.redfield.mongoDBexample.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserAsyncService asyncService;

    public User saveUser(User user){

        User changedUser = userRepository.save(user);
        changedUser.setName("Name changed. Testing save() to update register");
        return userRepository.save(changedUser);
    }

    public User findUser(String email){

        return userRepository.findByEmail(email);

    }

    public User saveUserAsync(User user) throws InterruptedException {
        User savedUser = userRepository.save(user);
        System.out.println(savedUser.getName());
        //SÓ FUNCIONOU COLOCANDO ESSE MÉTODO EM OUTRA CLASSE
        asyncService.asyncSave(savedUser);
        return savedUser;
    }
}
