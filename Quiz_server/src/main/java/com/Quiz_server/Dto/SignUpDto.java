package com.Quiz_server.Dto;

import com.Quiz_server.enums.UserRole;

public class SignUpDto {

			   private long id ;
				
				private String email;
				
				private String password;
				
				private String name;
				
				private UserRole userRole;

				public long getId() {
					return id;
				}

				public void setId(long id) {
					this.id = id;
				}

				public String getEmail() {
					return email;
				}

				public void setEmail(String email) {
					this.email = email;
				}

				public String getPassword() {
					return password;
				}

				public void setPassword(String password) {
					this.password = password;
				}

				public String getName() {
					return name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public UserRole getUserRole() {
					return userRole;
				}

				public void setUserRole(UserRole userRole) {
					this.userRole = userRole;
				}
				
				
				
}
