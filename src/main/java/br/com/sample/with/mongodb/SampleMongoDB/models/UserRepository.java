package br.com.sample.with.mongodb.SampleMongoDB.models;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<UserModel, String> {

    UserModel findByUsername(String username);

}
