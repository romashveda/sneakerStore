package ua.home.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ua.home.entity.User;

public interface UserDAO extends JpaRepository<User,Integer>{

    @Query("from User u where u.username =:username")
    public User findByUsername(@Param("username") String username);
}
