package com.example.entrevueSpringBoot.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Filme {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String titre;
	private String description;

	@OneToMany(mappedBy="filme", fetch=FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)	
	private List<Acteur> acteurs;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Acteur> getActeurs() {
		return acteurs;
	}
	public void setActeurs(List<Acteur> acteurs) {
		this.acteurs = acteurs;
	}

	
	

}
