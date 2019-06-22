package user.management.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import user.management.pojo.User;

@Repository
public interface UserManagementDaoi extends CrudRepository<User, Integer> {

}
