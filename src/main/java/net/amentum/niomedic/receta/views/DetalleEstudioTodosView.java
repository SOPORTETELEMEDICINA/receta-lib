package net.amentum.niomedic.receta.views;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@ApiModel(description = "Detalles del Estudio")
public class DetalleEstudioTodosView implements Serializable {

     Long idDetalleEstudio;
     String descripcionEstudio;
     String tipoEstudio;
     String preparacion;
     UUID idEstudio;
}
