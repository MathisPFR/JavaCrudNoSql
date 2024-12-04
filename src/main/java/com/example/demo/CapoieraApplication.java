package com.example.demo;

import com.example.demo.controller.UserController;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class CapoieraApplication implements CommandLineRunner {

	@Autowired
	private UserController userController;

	public static void main(String[] args) {
		SpringApplication.run(CapoieraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Insérer un utilisateur
		User insertedUser = insertUser();
		System.out.println("User inserted: " + insertedUser);

		// Récupérer tous les utilisateurs
		List<User> users = getAllUsers();
		System.out.println("All Users: " + users);

		Optional<User> updateUser = updateUser("6750787824f81a216dde7c50");

		userController.deleteUser("67507af890adb844ceceb2a4");
	}

	private User insertUser() {
		User newUser = new User();
		newUser.setName("toto");
		newUser.setEmail("toto@gmail.com");
		newUser.setPassword("password");
		newUser.setRefNum("8787878787");
		newUser.setSchoolId("98098098");

		// Appel au UserController pour insérer l'utilisateur
		return userController.insertUser(newUser);
	}

	private List<User> getAllUsers() {
		// Appel au UserController pour récupérer tous les utilisateurs
		return userController.getAll();
	}

//	private Optional<User> updateUser() {
//		Optional<User> user = Optional.of(new User());
//		user = userController.findById("6748da00ccd49caa3d704e45");
//
//
//        return user;
//    }

	private Optional<User> updateUser(String s) {

		Optional<User> user = userController.findById(s);


		if (user.isPresent()) {

			User existingUser = user.get();
			existingUser.setName("Updated Name");
			existingUser.setEmail("updated_email@example.com");
			existingUser.setPassword("newpassword");
			existingUser.setRefNum("9876543210");
			existingUser.setSchoolId("newSchoolId");


			userController.save(existingUser);
		} else {
			System.out.println("User not found with the given ID");
		}

		return user;
	}



}
