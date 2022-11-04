
package pe.com.apiescuelanueva.EscuelaNueva.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.apiescuelanueva.EscuelaNueva.entity.ParentescoEntity;

public interface ParentescoRepository extends JpaRepository<ParentescoEntity, Long> {
    @Query("Select p from ParentescoEntity p where p.estado=1")
    List<ParentescoEntity> finAllCustom();
}
