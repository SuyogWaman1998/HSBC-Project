package com.cg.hsbc.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;

	@Column(nullable = false, unique = true)
	private String username;

	@Column(nullable = false)
	private String password;

	@Column(nullable = false, unique = true)
	private String userEmailId;

	private String gender;

	private Date dateOfBirth;

	
	 @ManyToOne
	    @JoinColumn(name = "role_id") // Foreign key column name
	    private Role role; // Change from Set<Role> to Role

	public User() {
		super();
	}

	public User(Long userId, String username, String password, String userEmailId, String gender, Date dateOfBirth,
			Date createdAt, Date lastLogin, Role role) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.userEmailId = userEmailId;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.role = role;
	}

	 public Long getUserId() {
	        return userId;
	    }

	    public void setUserId(Long userId) {
	        this.userId = userId;
	    }

	    public String getUsername() {
	        return username;
	    }

	    public void setUsername(String username) {
	        this.username = username;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

	    public String getUserEmailId() {
	        return userEmailId;
	    }

	    public void setUserEmailId(String userEmailId) {
	        this.userEmailId = userEmailId;
	    }

	    public String getGender() {
	        return gender;
	    }

	    public void setGender(String gender) {
	        this.gender = gender;
	    }

	    public Date getDateOfBirth() {
	        return dateOfBirth;
	    }

	    public void setDateOfBirth(Date dateOfBirth) {
	        this.dateOfBirth = dateOfBirth;
	    }

	    public Role getRole() {
	        return role;
	    }

	    public void setRole(Role role) {
	        this.role = role;
	    }

		@Override
		public String toString() {
			return "User [userId=" + userId + ", username=" + username + ", password=" + password + ", userEmailId="
					+ userEmailId + ", gender=" + gender + ", dateOfBirth=" + dateOfBirth + ", role=" + role + "]";
		}


}
