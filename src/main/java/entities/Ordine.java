package entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Ordine {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long codiceOrdine;
	
	@ManyToOne
	private Cliente cliente;
	
	@OneToMany
	   private Set<ElementoOrdine> elementiOrdine;	

}
