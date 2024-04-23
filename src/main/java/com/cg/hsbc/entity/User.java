package com.cg.hsbc.entity;
import javax.persistence.*;

import java.io.Serializable;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;



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

	
	 @ManyToMany(fetch= FetchType.LAZY)
	 @JoinTable(name = "user_roles",
	 joinColumns = @JoinColumn(name= "user_id"),
	 inverseJoinColumns = @JoinColumn(name="role_id"))
	    private Set<Role> roles= new HashSet<>();

	public User() {
		super();
	}

	public User(Long userId, String username, String password, String userEmailId, String gender, Date dateOfBirth,
			Date createdAt, Date lastLogin, Role role, Set<Role> roles) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.userEmailId = userEmailId;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.roles = roles;
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

	   

		public Set<Role> getRoles() {
			return roles;
		}

		public void setRoles(Set<Role> roles) {
			this.roles = roles;
		}

		@Override
		public String toString() {
			return "User [userId=" + userId + ", username=" + username + ", password=" + password + ", userEmailId="
					+ userEmailId + ", gender=" + gender + ", dateOfBirth=" + dateOfBirth + ", roles=" + roles + "]";
		}

		


}
