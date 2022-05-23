package com.projeto.apimarvel.entities;


import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

@Entity
@Table(name = "tb_user")
public class User implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String cpf;
	private Instant dob;

	public User (){
	}

	public User(Long id, String name, String cpf, Instant dob) {
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.dob = dob;
	}

	public Long getId() {

        return id;
	}

	public void setId(Long id) {

        this.id = id;
	}

	public String getName() {

        return name;
	}

	public void setName(String name) {

        this.name = name;
	}

	public String getCpf() {

        return cpf;
	}

	public void setCpf(String cpf) {

        this.cpf = cpf;
	}

	public Instant getDob() {

        return dob;
	}

	public void setDob(Instant dob) {

        this.dob = dob;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof User)) return false;
		User user = (User) o;
		return getId().equals(user.getId()) && Objects.equals(getName(), user.getName()) && Objects.equals(getCpf(), user.getCpf()) && Objects.equals(getDob(), user.getDob());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}
}
