package mx.edu.utez.sivemorapp.modules.reportes;

import java.time.LocalDateTime;

public interface ReporteBaseProjection {
    String getRegion();
    String getCliente();
    String getNota();

    String getCedis();

    String getPlaca();
    String getSerie();
    String getTipoVehiculo();

    String getFolioVerificacion();
    String getMateria();
    String getDictamen();
    LocalDateTime getFecha();
    String getTecnico();
}