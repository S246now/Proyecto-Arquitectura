package com.prj.compra.servicio;

import java.util.List;
import javax.ejb.Local;
import com.prj.compra.domain.Aprobador;

@Local
public interface AprobadorService {

    public List<Aprobador> listarAprobadores();

    public Aprobador encontrarAprobadorPorId(Aprobador aprobador);

    public void registrarAprobador(Aprobador aprobador);

    public void modificarAprobador(Aprobador aprobador);

    public void eliminarAprobador(Aprobador aprobador);
}