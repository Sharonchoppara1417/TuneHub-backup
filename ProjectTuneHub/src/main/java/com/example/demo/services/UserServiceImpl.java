package com.example.demo.services;


	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

import com.example.demo.entity.Users;
import com.example.demo.repositories.UserRepository;

	
	@Service
	public class UserServiceImpl implements UserService{

		@Autowired
		UserRepository userRepository;

		public String addUser(Users user) {
			userRepository.save(user);
			return "User added succussfully";
		}

		//To check the duplicate entries
		public boolean emailExists(String email) {

			if(userRepository.findByEmail(email)!=null) {
				return true;
			}
			else {
				return false;
			}
		}

		public boolean validateUser(String email, String password) {
			Users user = userRepository.findByEmail(email);

			String dbpwd = user.getPassword();
			if(password.equals(dbpwd)) {
				return true;
			}
			else {
				return false;			
			}

		}

		public String getRole(String email) {
			
			Users user = userRepository.findByEmail(email);
			return user.getRole();
			
		}
		
		@Override
		public Users getUser(String email) {
			return userRepository.findByEmail(email);
		}

		@Override
		public void updateUser(Users user) {
			userRepository.save(user);
		}

	
}
