package com.gangforcode.mongodbcrud.repo;

import com.gangforcode.mongodbcrud.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends MongoRepository<User,String> {
}
