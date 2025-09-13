package masterstock.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import masterstock.demo.entity.user.User;

@Repository
public interface UserRepository extends JpaRepository<User,String>{
    UserDetails findByLogin (String login);
}
