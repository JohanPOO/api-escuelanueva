
package pe.com.apiescuelanueva.EscuelaNueva.entity;

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
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity(name="DistritoEntity")
@Table(name="distrito")
public class DistritoEntity implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="coddis")
    private Long codigo;
    @Column(name="nomdis")
    private String nombre;
    @Column(name="estdis")
    private Boolean estado;
}
