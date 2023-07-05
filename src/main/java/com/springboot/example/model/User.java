package com.springboot.example.model;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="userstab")
public class User {
	@Id
	@Column(name="uid")
	@GeneratedValue
	private Integer uid;
	
	@Column(name="uname")
	private String name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="pwd")
	private String pwd;
	
	@ElementCollection
	@CollectionTable(
			name="rolestab",
			joinColumns = @JoinColumn(name="uid")
	)
	@Column(name="role")
	private List<String> roles;
	
	public User(){
		
	}

	public User(Integer uid, String name, String email, String pwd, List<String> roles) {
		super();
		this.uid = uid;
		this.name = name;
		this.email = email;
		this.pwd = pwd;
		this.roles = roles;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", name=" + name + ", email=" + email + ", pwd=" + pwd + ", roles=" + roles + "]";
	}
	
	

}
