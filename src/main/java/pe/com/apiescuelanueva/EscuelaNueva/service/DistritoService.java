package pe.com.apiescuelanueva.EscuelaNueva.service;
import pe.com.apiescuelanueva.EscuelaNueva.entity.DistritoEntity;
import java.util.List;
import java.util.Optional;

public interface DistritoService {
    
    List<DistritoEntity> findAll();
    
    List<DistritoEntity> findAllCustom();
    
    Optional<DistritoEntity> findById(Long id);
    
    DistritoEntity add(DistritoEntity d);
    
    DistritoEntity update(DistritoEntity d);
    
    DistritoEntity delete(DistritoEntity d);
    
}
