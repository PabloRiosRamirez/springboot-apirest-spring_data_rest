/**
 * @author Pablo Ríos Ramírez
 * @Created 28-06-2018 2:43:46
 * @web http://www.pabloriosramirez.com
**/

package com.pabloriosramirez.springboot.springdatarest.repository;

import com.pabloriosramirez.springboot.springdatarest.entity.Usuario;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "data", path = "usuarios")
public interface UsuarioRepository extends PagingAndSortingRepository<Usuario, Long> {

    List<Usuario> findByNombre(@Param("nombre") String nombre);
    Usuario findByEmail(@Param("email") String email);

}
