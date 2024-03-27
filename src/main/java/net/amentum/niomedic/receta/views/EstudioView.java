package net.amentum.niomedic.receta.views;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import java.util.UUID;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@ApiModel(description = "Datos del Estudio")
public class EstudioView implements Serializable {

   private static final long serialVersionUID = -8120785974024222312L;

   @ApiModelProperty(value = "El ID es un UUID", allowEmptyValue = true, example = "60acd6be-3089-41b1-a616-16059270a456")
   private UUID idEstudio;

   @ApiModelProperty(required = true, allowEmptyValue = false, example = "60acd6be-3089-41b1-a616-16059270a456")
   @NotNull(message = "No puede ser nulo o vacío")
   private UUID idMedico;

   @ApiModelProperty(required = true, allowEmptyValue = false, allowableValues = "range[1,100]")
   @Size(max = 100, message = "Máximo 100 caracteres")
   @NotEmpty(message = "No puede ser nulo o vacío")
   private String nombreMedico;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,20]")
   @Size(max = 20, message = "Máximo 20 caracteres")
   private String cedulaMedico;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,100]")
   @Size(max = 100, message = "Máximo 100 caracteres")
   private String universidadMedico;

   @ApiModelProperty(required = true, allowEmptyValue = false, allowableValues = "range[1,100]")
   @Size(max = 100, message = "Máximo 100 caracteres")
   @NotEmpty(message = "No puede ser nulo o vacío")
   private String especialidadMedico;

   @ApiModelProperty(required = true, allowEmptyValue = false, example = "60acd6be-3089-41b1-a616-16059270a456")
   @NotNull(message = "No puede ser nulo o vacío")
   private UUID idPaciente;

   @ApiModelProperty(required = true, allowEmptyValue = false, allowableValues = "range[1,100]")
   @Size(max = 100, message = "Máximo 100 caracteres")
   @NotEmpty(message = "No puede ser nulo o vacío")
   private String nombrePaciente;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[0,100]")
   @Email(message = "email no válido")
   @Size(max = 100, message = "Máximo 100 caracteres")
   private String correoPaciente;

   @ApiModelProperty(allowEmptyValue = false)
   @Min(value = 1, message = "No debe ser menor a 1")
   @Max(value = 2147483646, message = "No debe ser mayor a 2147483646")
   private Integer edadPaciente;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,50]")
   @Size(max = 50, message = "Máximo 50 caracteres")
   private String sexoPaciente;

   @ApiModelProperty(required = true, allowEmptyValue = false, allowableValues = "range[1,25]")
   @Size(max = 25, message = "Máximo 25 caracteres")
   @NotEmpty(message = "No puede ser nulo o vacío")
   private String curpPaciente;

   // @ApiModelProperty(allowEmptyValue = false)
   // @Min(value = 1, message = "No debe ser menor a 1")
   // @Max(value = 9223372036854775806L, message = "No debe ser mayor a 9223372036854775806")
   private Long folio;

   @ApiModelProperty(required = true, allowEmptyValue = false)
   @Min(value = 1, message = "No debe ser menor a 1")
   @Max(value = 9223372036854775806L, message = "No debe ser mayor a 9223372036854775806")
   @NotNull(message = "No puede ser nulo o vacío")
   private Long numeroExpediente;

   @ApiModelProperty(value = "Para uso interno es un TIMESTAMP", dataType = "java.util.Date", example = "197650800")
   private Date fechaCreacion;

   @ApiModelProperty(required = true, allowEmptyValue = false)
   @Min(value = 1, message = "No debe ser menor a 1")
   @Max(value = 9223372036854775806L, message = "No debe ser mayor a 9223372036854775806")
   @NotNull(message = "No puede ser nulo o vacío")
   private Long idConsulta;

   //usado solo para el borrado logico
   @ApiModelProperty(required = true, allowEmptyValue = false)
   @NotNull(message = "No puede ser nulo o vacío")
   private Boolean activo;

   @Valid
   @NotNull(message = "No pude ser nulo.")
   @NotEmpty(message = "No puede ser vacío")
   private Set<DetalleEstudioView> detallesEstudioList;

}
