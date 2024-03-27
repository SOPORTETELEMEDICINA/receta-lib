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
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@ApiModel(description = "Resultados de estudio")
public class ResultadoView implements Serializable {
    Long idResultado;

    String propiedad;

    String valorPropiedad;

    String unidadMedida;

    String rango;

    Long idDetalleEstudio;
}
