package net.amentum.niomedic.receta.views;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Set;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@ApiModel(description = "Detalles del Estudio")
public class DetalleEstudioView implements Serializable {

   private static final long serialVersionUID = -6194099771055357493L;

   @ApiModelProperty(value = "El ID", allowEmptyValue = true)
   Long idDetalleEstudio;

   @ApiModelProperty(required = true, allowEmptyValue = false, allowableValues = "range[1,100]")
   @Size(max = 100, message = "Máximo 100 caracteres.")
   @NotEmpty(message = "No puede ser nulo o vacío.")
   String descripcionEstudio;

   @ApiModelProperty(required = true, allowEmptyValue = false, allowableValues = "range[1,100]")
   @Size(max = 100, message = "Máximo 100 caracteres.")
   @NotEmpty(message = "No puede ser nulo o vacío.")
   String tipoEstudio;

   @ApiModelProperty(allowEmptyValue = true, allowableValues = "range[1,infinity]")
   String preparacion;

   //relaciones
   @ApiModelProperty(value = "El ID del estudio y se ocupa para establecer la relacion", allowEmptyValue = true)
   private UUID idEstudio;

/*
   private Set<ResultadoView> resultadoList;
*/


}
