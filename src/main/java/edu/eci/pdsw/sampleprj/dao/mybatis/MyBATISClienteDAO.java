/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.sampleprj.dao.mybatis;

import com.google.inject.Inject;
import edu.eci.pdsw.sampleprj.dao.ClienteDAO;
import edu.eci.pdsw.sampleprj.dao.PersistenceException;
import edu.eci.pdsw.sampleprj.dao.mybatis.mappers.ClienteMapper;
import edu.eci.pdsw.samples.entities.Cliente;

/**
 *
 * @author 2104784
 */
public class MyBATISClienteDAO implements ClienteDAO{
    
    @Inject
    private ClienteMapper clienteMapper;    

    @Override
    public void save(Cliente c) throws PersistenceException {
        try {
            //clienteMapper.
        } catch (org.apache.ibatis.exceptions.PersistenceException e) {
            //throw new PersistenceException("Error al registrar el item " + it.toString(), e);
        }
    }

    @Override
    public Cliente load(int id) throws PersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
