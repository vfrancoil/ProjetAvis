package org.projet.avis.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@RequiredArgsConstructor
@Data
@Entity
public class Jeu {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@NonNull
	@NotNull
	private String nom;
	@NonNull
	@NotNull
	private String description;
	@NonNull
	@NotNull
	private LocalDate dateSortie;
	@NonNull
	@NotNull
	private String image;
	@NonNull
	@NotNull
	@ManyToOne
	private Classification classification;
	@NonNull
	@NotNull
	@ManyToOne
	private Genre genre;
	@NonNull
	@NotNull
	@ManyToOne
	private Editeur editeur;
	@NonNull
	@NotNull
	@ManyToMany
	@ToString.Exclude
	private List<Plateforme> plateformes;
	@NotNull
	@NonNull
	@ManyToOne
	private ModeleEconomique modeleEconomique;
}
