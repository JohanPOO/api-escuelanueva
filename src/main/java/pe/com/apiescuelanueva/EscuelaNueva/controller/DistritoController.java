
package pe.com.apiescuelanueva.EscuelaNueva.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.apiescuelanueva.EscuelaNueva.entity.DistritoEntity;
import pe.com.apiescuelanueva.EscuelaNueva.service.DistritoService;

//@Controller --> indica que es un controlador de spring
//@ResponseBody --> cuando se agrega esa anotacion se vuelve REST
//@RestController --> @Controller + @ResponseBody
//@RestController --> aparece en la version 4 de spring
//@RestController --> indica que es un controlador de tipo REST

@RestController
@RequestMapping("/distrito")
public class DistritoController {
    @Autowired
    private DistritoService distritoservice;
    
    @GetMapping
    public List<DistritoEntity> findAll(){
        return distritoservice.findAll();
    }
    
    @GetMapping("/custom")
    public List<DistritoEntity> findAllCustom(){
        return distritoservice.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<DistritoEntity> findById(@PathVariable Long id){
        return distritoservice.findById(id);
    }
    
    @PostMapping
    public DistritoEntity add(@RequestBody DistritoEntity d){
        return distritoservice.add(d);
    }
    
    @PutMapping("/{id}")
    public DistritoEntity update(@PathVariable Long id, @RequestBody DistritoEntity d){
        d.setCodigo(id);
        return distritoservice.update(d);
    }
    
    @DeleteMapping("/{id}")
    public DistritoEntity delete(@PathVariable Long id){
        DistritoEntity objdistrito = new DistritoEntity();
        objdistrito.setEstado(false);
        return distritoservice.delete(DistritoEntity.builder().codigo(id).build());
    }
}
