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
public class DomicilioView implements Serializable {

   private static final long serialVersionUID = 7652405525781211652L;

   @ApiModelProperty(value = "El ID", allowEmptyValue = true)
   private Long idDomicilio;

   @ApiModelProperty(value = "Es un UUID", required = true, allowEmptyValue = false, example = "60acd6be-3089-41b1-a616-16059270a456")
   @NotNull(message = "No puede ser nulo o vacío")
   private UUID personaId;

   @ApiModelProperty(required = true, allowEmptyValue = false)
   @NotNull(message = "No puede ser nulo o vacío")
   private Boolean tipoUsuario;

   @ApiModelProperty(required = true, allowEmptyValue = false, allowableValues = "range[1,250]")
   @Size(max = 250, message = "Máximo 250 caracteres")
   @NotNull(message = "No puede ser nulo o vacío")
   private String calle;

   @ApiModelProperty(required = true, allowEmptyValue = false, allowableValues = "range[1,6]")
   @Size(max = 6, message = "Máximo 6 caracteres")
   @NotNull(message = "No puede ser nulo o vacío")
   private String numeroExterior;

   @ApiModelProperty(required = true, allowEmptyValue = false, allowableValues = "range[1,6]")
   @Size(max = 6, message = "Máximo 6 caracteres")
   @NotNull(message = "No puede ser nulo o vacío")
   private String numeroInterior;

   @ApiModelProperty(required = true, allowEmptyValue = false, allowableValues = "range[1,150]")
   @Size(max = 150, message = "Máximo 150 caracteres")
   @NotNull(message = "No puede ser nulo o vacío")
   private String colonia;

   @ApiModelProperty(required = true, allowEmptyValue = false, allowableValues = "range[1,250]")
   @Size(max = 250, message = "Máximo 250 caracteres")
   @NotNull(message = "No puede ser nulo o vacío")
   private String localidad;

   @ApiModelProperty(required = true, allowEmptyValue = false, allowableValues = "range[1,500]")
   @Size(max = 500, message = "Máximo 500 caracteres")
   @NotNull(message = "No puede ser nulo o vacío")
   private String referencia;

   @ApiModelProperty(required = true, allowEmptyValue = false, allowableValues = "range[1,250]")
   @Size(max = 250, message = "Máximo 250 caracteres")
   @NotNull(message = "No puede ser nulo o vacío")
   private String municipio;

   @ApiModelProperty(required = true, allowEmptyValue = false, allowableValues = "range[1,100]")
   @Size(max = 100, message = "Máximo 100 caracteres")
   @NotNull(message = "No puede ser nulo o vacío")
   private String estado;

   @ApiModelProperty(required = true, allowEmptyValue = false, allowableValues = "range[1,100]")
   @Size(max = 100, message = "Máximo 100 caracteres")
   @NotNull(message = "No puede ser nulo o vacío")
   private String pais;

   @ApiModelProperty(required = true, allowEmptyValue = false, allowableValues = "range[1,10]")
   @Size(max = 10, message = "Máximo 10 caracteres")
   @NotNull(message = "No puede ser nulo o vacío")
   private String cp;

   @ApiModelProperty(required = true, allowEmptyValue = false, allowableValues = "range[1,100]")
   @Email(message = "email no válido")
   @Size(max = 100, message = "Máximo 100 caracteres")
   @NotNull(message = "No puede ser nulo o vacío")
   private String email;

}
