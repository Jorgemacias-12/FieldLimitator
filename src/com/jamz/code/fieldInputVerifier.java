package com.jamz.code;

import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
    @author: Jorge Antonio Macias Zambrano
    File: fieldInputVerifier.java
    Date: 8/11/2020
    Time: 11:27:09 AM

    Purpose:

*/

public class fieldInputVerifier 
{
    public final static int NO_CHARACTERS = 0;
    public final static int NO_NUMBERS = 1;
    public final static int LETTERS_WO_SPECIAL_CHARACTERS = 2;
    public final static int NUMBERS_WO_SPECIAL_CHARACTERS = 3;
   
    private final static char[] specialCharacters = 
    {'°', '|', '!', '"', '#', '$', '%', 
    '&', '/', '(', ')', '=', '\'', '?', '¿', '¡', '¨', '*', '´', '+', '{',
    '}', '[', ']', '^', '`', '~', '\\', ',', ';', '.', ':', '-', '_','@'
    ,'<','>','¬','~'
    };
    
    private static boolean argumentError = false;
   
    public static void setInputLimit(int inputFilter, KeyEvent evt)
    {
        switch(inputFilter)
        {
            
        }
    }
    
    public static void setInputFilter(JTextField field,
                                      int characterLimit,
                                      KeyEvent evt)
    {
        
    }
    
}
