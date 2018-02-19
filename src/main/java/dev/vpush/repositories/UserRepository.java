package dev.vpush.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.vpush.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
