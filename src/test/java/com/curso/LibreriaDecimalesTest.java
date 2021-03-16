package com.curso;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class LibreriaDecimalesTest 
{

    @Test
    public void suma5y8()
    {
        assertEquals( 13, Libreria.suma(5, 8) );
    }
    
    @Test
    public void suma5y0()
    {
        assertTrue( 5.1 == Libreria.suma(5.1, 0) );
    }  
    
    @Test
    public void resta3y5()
    {
        assertTrue( -2.2 == Libreria.resta(3.0, 5.2) );
    }      
}
