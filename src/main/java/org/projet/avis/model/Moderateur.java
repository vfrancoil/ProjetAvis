package org.projet.avis.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
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
public class Moderateur extends Utilisateur {

	@Id
	@NotNull(message ="merci d'indiquer votre numéro de téléphone")
	private String numeroDeTelephone;

}
