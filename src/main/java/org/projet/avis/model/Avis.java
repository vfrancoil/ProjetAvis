package org.projet.avis.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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
public class Avis {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private Long id;
	@NotNull(message =" Veuillez décrire votre avis")
	private String description;
	private LocalDateTime dateEnvoie;
	@NotNull(message = "merci de mettre une note")
	private float note;
	private LocalDateTime dateModeration;
	@ManyToOne
	private Joueur joueur;
	@ManyToOne
	private Moderateur moderateur;
	
}
