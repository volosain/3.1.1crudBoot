package spring.boot31.crudBoot.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.boot31.crudBoot.model.User;


@Repository
public interface UserRepositories extends JpaRepository<User, Integer> {
}
