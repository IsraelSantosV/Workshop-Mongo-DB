package com.israelvieira.workshopmongo.domain;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	private String m_Id;
	private String m_Name;
	private String m_Email;
	
	public User() {
		
	}

	public User(String m_Id, String m_Name, String m_Email) {
		super();
		this.m_Id = m_Id;
		this.m_Name = m_Name;
		this.m_Email = m_Email;
	}

	public String getId() {
		return m_Id;
	}

	public void setId(String m_Id) {
		this.m_Id = m_Id;
	}

	public String getName() {
		return m_Name;
	}

	public void setName(String m_Name) {
		this.m_Name = m_Name;
	}
	
	public String getEmail() {
		return m_Email;
	}

	public void setEmail(String m_Email) {
		this.m_Email = m_Email;
	}

	@Override
	public int hashCode() {
		return Objects.hash(m_Id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(m_Id, other.m_Id);
	}

}
