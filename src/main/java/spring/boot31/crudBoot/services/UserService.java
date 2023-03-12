package spring.boot31.crudBoot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.boot31.crudBoot.model.User;
import spring.boot31.crudBoot.repositories.UserRepositories;

import java.util.List;
import java.util.Optional;


@Service
public class UserService {

    private final UserRepositories userRepositories;

    @Autowired
    public UserService(UserRepositories userRepositories) {
        this.userRepositories = userRepositories;
    }

    public List<User> findAll() {
        return userRepositories.findAll();
    }

    public User findOne(int id) {
        Optional<User> foundUser = userRepositories.findById(id);
        return  foundUser.orElse(null);
    }

    @Transactional
    public void save(User user) {
        userRepositories.save(user);
    }

    @Transactional
    public void update(int id, User updateUser) {
        updateUser.setId(id);
        userRepositories.save(updateUser);
    }

    @Transactional
    public void delete(int id) {
        userRepositories.deleteById(id);
    }
}
