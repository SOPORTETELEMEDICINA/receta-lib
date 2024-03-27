package net.amentum.niomedic.receta.views;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@ApiModel(description = "Detalles de la Receta")
public class DetalleRecetaView implements Serializable {

   private static final long serialVersionUID = 5599190459116251506L;

   @ApiModelProperty(value = "El ID", allowEmptyValue = true)
   private Long idDetalleReceta;

   @ApiModelProperty(required = true, allowEmptyValue = false, allowableValues = "range[1,300]")
   @Size(max = 300, message = "Máximo 300 caracteres")
   @NotNull(message = "No puede ser nulo o vacío")
   private String denominacionGenerica;

   @ApiModelProperty(required = true, allowEmptyValue = false, allowableValues = "range[1,300]")
   @Size(max = 300, message = "Máximo 300 caracteres")
   @NotNull(message = "No puede ser nulo o vacío")
   private String denominacionDistintiva;

   @ApiModelProperty(required = true, allowEmptyValue = false)
   @Min(value = 1, message = "No debe ser menor a 1")
   @Max(value = 2147483646, message = "No debe ser mayor a 2147483646")
   @NotNull(message = "No puede ser nulo o vacío")
   private Integer cantidad;

   @ApiModelProperty(required = true, allowEmptyValue = false, allowableValues = "range[1,100]")
   @Size(max = 100, message = "Máximo 100 caracteres")
   @NotNull(message = "No puede ser nulo o vacío")
   private String unidad;


   @ApiModelProperty(required = true, allowEmptyValue = false, allowableValues = "range[1,7]")
   @Size(max = 7, message = "Máximo 7 caracteres")
   private String dosis;

   @ApiModelProperty(required = true, allowEmptyValue = false, allowableValues = "range[1,7]")
   @Size(max = 7, message = "Máximo 7 caracteres")
   private String frecuencia;


   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,50]")
   @Size(max = 50, message = "Máximo 50 caracteres")
   private String periodo;

   @ApiModelProperty(required = true, allowEmptyValue = false, allowableValues = "range[1,50]")
   @Size(max = 50, message = "Máximo 50 caracteres")
   @NotNull(message = "No puede ser nulo o vacío")
   private String viaAdministracion;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,infinity]")
   private String indicacionesMedicas;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,150]")
   @Size(max = 150, message = "Máximo 150 caracteres")
   private String presentacion;

   @ApiModelProperty(value = "Es una lista genérica para almacenar objetos JSON", required = true, dataType = "array")
   private Collection<Map<String, Object>> substancias;

}
