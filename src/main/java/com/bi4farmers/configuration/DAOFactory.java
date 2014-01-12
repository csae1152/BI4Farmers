/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bi4farmers.configuration;

import com.bi4farmers.entity.FarmDAO;

/**
 *
 * @author Helmut
 */
public abstract class DAOFactory 
{
    public abstract FarmDAO getFarmDAO();
 
    public static DAOFactory createPostgreSQLDAOFactory( Backend backend )
    {
        switch( backend )
        {
            case PostgreSQL:
                return new PostgreSQLDAOFactory() {

            @Override
            public FarmDAO getFarmDAO() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        }
        return new PostgreSQLDAOFactory() {

            @Override
            public FarmDAO getFarmDAO() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
    }
    
}
