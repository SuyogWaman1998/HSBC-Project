package com.cg.hsbc.entity;

import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name="auth_tokens")
public class AuthenticationToken {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long tokenId;
	
	private String tokenValue;
	
	private Date expirationDate;
	
	@ManyToOne
	@JoinColumn(name= "user_id")
	private User user;

	public AuthenticationToken(Long tokenId, String tokenValue, Date expirationDate, User user) {
		super();
		this.tokenId = tokenId;
		this.tokenValue = tokenValue;
		this.expirationDate = expirationDate;
		this.user = user;
	}

	public Long getTokenId() {
		return tokenId;
	}

	public void setTokenId(Long tokenId) {
		this.tokenId = tokenId;
	}

	public String getTokenValue() {
		return tokenValue;
	}

	public void setTokenValue(String tokenValue) {
		this.tokenValue = tokenValue;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "AuthenticationToken [tokenId=" + tokenId + ", tokenValue=" + tokenValue + ", expirationDate="
				+ expirationDate + ", user=" + user + "]";
	}
	
	
}
