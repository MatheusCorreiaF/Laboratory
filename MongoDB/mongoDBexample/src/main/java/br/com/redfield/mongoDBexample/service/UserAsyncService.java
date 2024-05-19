package br.com.redfield.mongoDBexample.service;

import br.com.redfield.mongoDBexample.model.User;
import br.com.redfield.mongoDBexample.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserAsyncService {

    private final UserRepository userRepository;

    //SÓ FUNCIONOU COLOCANDO ESSE MÉTODO EM OUTRA CLASSE
    @Async
    protected void asyncSave(User changedUser) throws InterruptedException {
        Thread.sleep(5000);
        changedUser.setName("Name changed. Testing save() to update register async");
        userRepository.save(changedUser);
    }
}
