package user.management.service;

import javax.websocket.server.ServerEndpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import user.management.dao.UserManagementDaoi;
import user.management.pojo.User;

@Service
public class UserManagementService {

	@Autowired
	public UserManagementDaoi userManagement;

	public UserManagementService(UserManagementDaoi daoi) {
		this.userManagement = daoi;
	}

	public User storeUser(User user) {
		return userManagement.save(user);
	}

	public User getUser(Integer id) {
		return userManagement.findOne(id);
	}

}
