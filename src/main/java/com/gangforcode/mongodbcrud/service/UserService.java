package com.gangforcode.mongodbcrud.service;

import com.gangforcode.mongodbcrud.model.User;
import com.gangforcode.mongodbcrud.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public User addUser(User user) {
        return repository.save(user);
    }

    public List<User> getAllUsers() {
        return repository.findAll();
    }

    public Optional<User> getUserById(String Id){
        return repository.findById(Id);
    }

    public User updateUser(String Id,User user){
        User existingUser = repository.findById(Id).orElse(null);
        if(existingUser!=null){
            existingUser.setUserName(user.getUserName());
            existingUser.setName(user.getName());
            return repository.save(existingUser);
        }
        return null;
    }

    public void deleteById(String Id){
        repository.deleteById(Id);
    }
}
