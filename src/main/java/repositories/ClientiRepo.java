package repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import entities.Cliente;
import java.lang.String;
import java.util.List;

@RepositoryRestResource( path = "clienti")
public interface ClientiRepo extends CrudRepository<Cliente, Long> {
	
	 List<Cliente> findByCognome(@Param("cognome")String cognome);

	@Query("select c from Cliente c")
	List<Cliente> findTutti();
   
	
	
	
	

}