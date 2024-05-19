package br.com.redfield.mongoDBexample.repository;

import br.com.redfield.mongoDBexample.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    User findByEmail(String email);
}
