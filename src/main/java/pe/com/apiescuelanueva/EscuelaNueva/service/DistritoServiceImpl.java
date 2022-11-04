
package pe.com.apiescuelanueva.EscuelaNueva.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.apiescuelanueva.EscuelaNueva.entity.DistritoEntity;
import pe.com.apiescuelanueva.EscuelaNueva.repository.DistritoRepository;

//Permite definir una clase como un servicio
@Service
public class DistritoServiceImpl implements DistritoService{

    //Permite int¿yectar dependencias
    @Autowired
    private DistritoRepository distritorepository;
    
    @Override
    public List<DistritoEntity> findAll() {
       return distritorepository.findAll();
    }

    @Override
    public List<DistritoEntity> findAllCustom() {
       return distritorepository.finAllCustom();
    }

    @Override
    public Optional<DistritoEntity> findById(Long id) {
        return distritorepository.findById(id);
    }

    @Override
    public DistritoEntity add(DistritoEntity d) {
       return distritorepository.save(d);
    }

    @Override
    public DistritoEntity update(DistritoEntity d) {    
      DistritoEntity objDistrito =  distritorepository.getById(d.getCodigo());
      BeanUtils.copyProperties(d, objDistrito);
      return distritorepository.save(objDistrito);
    }

    @Override
    public DistritoEntity delete(DistritoEntity d) {
       DistritoEntity objDistrito =  distritorepository.getById(d.getCodigo());
       objDistrito.setEstado(false);
       return distritorepository.save(objDistrito);
    }
    
}
