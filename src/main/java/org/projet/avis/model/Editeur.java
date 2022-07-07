package org.projet.avis.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Data
@RequiredArgsConstructor
@Entity
public class Editeur {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@NotNull
	@NonNull
	private String nom;
	@NotNull
	@NonNull
	@OneToMany(mappedBy = "editeur")
	@ToString.Exclude
	private List<Jeu> jeux;
}
