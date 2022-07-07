package org.projet.avis.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

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
public class Joueur extends Utilisateur{

	@Id
	private LocalDate dateDeNaissance;
	@OneToMany(mappedBy = "joueur")
	@ToString.Exclude()
	private List<Avis> avis;
}
