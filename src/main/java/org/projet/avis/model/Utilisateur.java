package org.projet.avis.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Utilisateur {

	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	protected Long id;
	@NotNull(message = "Indiquez votre pseudo")
	protected String pseudo;
	@NotNull(message = "Indiquez votre pseudo")
	protected String motDePasse;
	@Email
	protected String email;
}
