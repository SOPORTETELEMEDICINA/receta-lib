package net.amentum.niomedic.receta.views;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.validator.constraints.Email;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@ApiModel(description = "Datos del Domicilio")
public class DomicilioTodosView implements Serializable {

    private Long idDomicilio;
    private UUID personaId;
    private Boolean tipoUsuario;
    private String calle;
    private String numeroExterior;
    private String numeroInterior;
    private String colonia;
    private String localidad;
    private String referencia;
    private String municipio;
    private String estado;
    private String pais;
    private String cp;
    private String email;
}
