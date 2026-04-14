package mx.edu.utez.sivemorapp.modules.reportes.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReporteItemDTO {
    private String tipo;
    private String agrupacion;
    private String region;
    private String cliente;
    private String nota;

    private String placa;
    private String serie;
    private String tipoVehiculo;

    private String folioVerificacion;
    private String materia;
    private String dictamen;
    private String fecha;
    private String tecnico;
}