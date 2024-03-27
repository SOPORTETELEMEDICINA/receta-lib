package net.amentum.niomedic.receta.views;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@ApiModel(description = "Datos de la Receta")
public class RecetaView implements Serializable {

   private static final long serialVersionUID = 1189980913279994487L;

   @ApiModelProperty(value = "El ID es un UUID", allowEmptyValue = true, example = "60acd6be-3089-41b1-a616-16059270a456")
   private UUID idReceta;

   @ApiModelProperty(required = true, allowEmptyValue = false, example = "60acd6be-3089-41b1-a616-16059270a456")
   @NotNull(message = "No puede ser nulo o vacío")
   private UUID medicoId;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,100]")
   @Size(max = 100, message = "Máximo 100 caracteres")
   private String nombreMedico;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,20]")
   @Size(max = 20, message = "Máximo 20 caracteres")
   private String cedulaMedico;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,100]")
   @Size(max = 100, message = "Máximo 100 caracteres")
   private String universidadMedico;

   @ApiModelProperty(required = true, allowEmptyValue = false, allowableValues = "range[1,100]")
   @Size(max = 100, message = "Máximo 150 caracteres")
   @NotEmpty(message = "No puede ser nulo o vacío")
   private String especialidadMedico;

   @ApiModelProperty(required = true, allowEmptyValue = false, example = "60acd6be-3089-41b1-a616-16059270a456")
   @NotNull(message = "No puede ser nulo o vacío")
   private UUID pacienteId;

   @ApiModelProperty(required = true, allowEmptyValue = false, allowableValues = "range[1,100]")
   @Size(max = 100, message = "Máximo 100 caracteres")
   @NotEmpty(message = "No puede ser nulo o vacío")
   private String nombrePaciente;

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

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,infinity]")
   private String diagnosticoPaciente;

   // @ApiModelProperty(allowEmptyValue = false)
   // @Min(value = 1, message = "No debe ser menor a 1")
   // @Max(value = 9223372036854775806L, message = "No debe ser mayor a 9223372036854775806")
   private Long numeroFolio;

   @ApiModelProperty(required = true, allowEmptyValue = false)
   @Min(value = 1, message = "No debe ser menor a 1")
   @Max(value = 9223372036854775806L, message = "No debe ser mayor a 9223372036854775806")
   @NotNull(message = "No puede ser nulo o vacío")
   private Long numeroExpediente;

   // asi se maneja en MS paciente
   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,infinity]")
   private String cuidadosGenerales;

   @ApiModelProperty(value = "Para uso interno es un TIMESTAMP", dataType = "java.util.Date", example = "197650800")
   private Date fechaCreacion;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,250]")
   @Size(max = 250, message = "Máximo 250 caracteres")
   private String sello;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,250]")
   @Size(max = 250, message = "Máximo 250 caracteres")
   private String cadenaOriginal;

   @ApiModelProperty(required = true, allowEmptyValue = false)
   @NotNull(message = "No puede ser nulo o vacío")
   private Boolean activo;

   @ApiModelProperty(required = true, allowEmptyValue = false)
   @Min(value = 1, message = "No debe ser menor a 1")
   @Max(value = 9223372036854775806L, message = "No debe ser mayor a 9223372036854775806")
   @NotNull(message = "No puede ser nulo o vacío")
   private Long consultaId;

   private Long idPadecimiento;
   //relaciones
   private Collection<DomicilioView> domicilioViewList = new ArrayList<>();

   private Collection<DetalleRecetaView> detalleRecetaViewList = new ArrayList<>();


   @Override
   public String toString() {
      return "RecetaView{" +
         "idReceta=" + idReceta +
         ", medicoId=" + medicoId +
         ", nombreMedico='" + nombreMedico + '\'' +
         ", cedulaMedico='" + cedulaMedico + '\'' +
         ", universidadMedico='" + universidadMedico + '\'' +
         ", especialidadMedico='" + especialidadMedico + '\'' +
         ", pacienteId=" + pacienteId +
         ", nombrePaciente='" + nombrePaciente + '\'' +
         ", edadPaciente=" + edadPaciente +
         ", sexoPaciente='" + sexoPaciente + '\'' +
         ", curpPaciente='" + curpPaciente + '\'' +
         ", diagnosticoPaciente='" + diagnosticoPaciente + '\'' +
         ", numeroFolio=" + numeroFolio +
         ", numeroExpediente=" + numeroExpediente +
         ", cuidadosGenerales='" + cuidadosGenerales + '\'' +
         ", fechaCreacion=" + fechaCreacion +
         ", sello='" + sello + '\'' +
         ", cadenaOriginal='" + cadenaOriginal + '\'' +
         ", activo='" + activo + '\'' +
              ", idPadecimiento='" + idPadecimiento + '\'' +

              '}';

   }
}
