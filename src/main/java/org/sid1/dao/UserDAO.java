package org.sid1.dao;

import org.sid1.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User,Long>{

}
