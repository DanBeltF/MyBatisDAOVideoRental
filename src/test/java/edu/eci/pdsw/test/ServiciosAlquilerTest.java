package edu.eci.pdsw.test;

import java.util.List;

import edu.eci.pdsw.sampleprj.dao.PersistenceException;
import edu.eci.pdsw.samples.entities.Cliente;
import edu.eci.pdsw.samples.services.ExcepcionServiciosAlquiler;
import edu.eci.pdsw.samples.services.ServiciosAlquiler;
import edu.eci.pdsw.samples.services.ServiciosAlquilerFactory;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import org.quicktheories.core.Gen;
import static org.quicktheories.QuickTheory.qt;
import static org.quicktheories.generators.Generate.*;
import static org.quicktheories.generators.SourceDSL.*;

/**
 *
 * @author fchaves
 */

public class ServiciosAlquilerTest {

    ServiciosAlquiler serviciosAlquiler;

    public ServiciosAlquilerTest() {
        serviciosAlquiler = ServiciosAlquilerFactory.getInstance().getServiciosAlquilerTesting();
    }

    @Before
    public void setUp() {
    }

    @Test
    public void emptyDB() {
        qt().forAll(integers().allPositive()).check((id) -> {
            boolean r = false;
            try {
                Cliente cliente = serviciosAlquiler.consultarCliente(id);
            } catch(ExcepcionServiciosAlquiler e) {
                r = true;
            }
            return r;
        });
    }

}
