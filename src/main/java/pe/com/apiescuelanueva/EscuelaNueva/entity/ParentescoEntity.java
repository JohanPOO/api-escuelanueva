
package pe.com.apiescuelanueva.EscuelaNueva.entity;

//Lombok : Libreria que ayuda a optimizar codigo.

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//Lombok : Libreria que ayuda a optimizar codigo.
@Builder //Construye la clase
@AllArgsConstructor //Genera un constructor con parametros
@NoArgsConstructor //Genera un contructor sin paramentros (vacio)
@Data // Genera los metodos GET y SET de los Attributes
//Conclusion lombok nos ayuda a optimizar el codigo sin necesidad de escribir

@Entity(name="ParentescoEntity")
@Table(name="parentesco")
public class ParentescoEntity implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="codpar")
    private Long codigo;
    @Column(name="despar")
    private String descripcion;
    @Column(name="estpar")
    private Boolean estado; 
}
