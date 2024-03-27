package net.amentum.niomedic.receta.views;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@ApiModel(description = "Resultados de estudio")
public class ResultadoEsView implements Serializable {
    @ApiModelProperty(required = true, allowEmptyValue = true)
    Long idResultado;

    @ApiModelProperty(required = true, allowEmptyValue = true)
    String propiedad;

    @ApiModelProperty(required = true, allowEmptyValue = true)
    String valorPropiedad;

    @ApiModelProperty(required = true, allowEmptyValue = true)
    String unidadMedida;

    @ApiModelProperty(required = true, allowEmptyValue = true)
    String rango;

    @ApiModelProperty(required = true, allowEmptyValue = true)
    Long idDetalleEstudio;
}
