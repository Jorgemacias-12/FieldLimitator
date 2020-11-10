package com.jamz.code;

import java.awt.Toolkit;
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
    public final static int CHARACTERS_WO_SPECIAL_CHARACTERS = 2;
    public final static int NUMBERS_WO_SPECIAL_CHARACTERS = 3;
   
    private final static char[] specialCharacters = 
    {'°', '|', '!', '"', '#', '$', '%', 
    '&', '/', '(', ')', '=', '\'', '?', '¿', '¡', '¨', '*', '´', '+', '{',
    '}', '[', ']', '^', '`', '~', '\\', ',', ';', '.', ':', '-', '_','@'
    ,'<','>','¬','~'
    };
    
    private static boolean argumentError = false;
   
    public static void setInputLimit(JTextField field,
                                      int characterLimit,
                                      KeyEvent evt) 
    {
        if(characterLimit <= 0)
        {
            if(!argumentError)
            {
                argumentError = true;
                System.err.println("ERROR: The argument must be higher than 0,"
                + " value introduced: "+characterLimit);
            }
        }
        else
        {
            if(field.getText().length() >= characterLimit)
            {
                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }
    
    public static void setInputFilter(int inputFilter, KeyEvent evt)
    {
        switch(inputFilter)
        {
            case NO_CHARACTERS:
                if(Character.isLetter(evt.getKeyChar()))
                {
                    evt.consume();
                    Toolkit.getDefaultToolkit().beep();
                }
                break;
            case NO_NUMBERS:
                if(Character.isDigit(evt.getKeyChar()))
                {
                    evt.consume();
                    Toolkit.getDefaultToolkit().beep();
                }
                break;
            case CHARACTERS_WO_SPECIAL_CHARACTERS:
                if(Character.isDigit(evt.getKeyChar()))
                {
                    evt.consume();
                    Toolkit.getDefaultToolkit().beep();
                }
                else
                {
                    for( char currentCharacter : specialCharacters)
                    {
                        if(currentCharacter == evt.getKeyChar())
                        {
                            evt.consume();
                            Toolkit.getDefaultToolkit().beep();
                        }
                    }
                }
                break;
            case NUMBERS_WO_SPECIAL_CHARACTERS:
                if(Character.isLetter(evt.getKeyChar()))
                {
                    evt.consume();
                    Toolkit.getDefaultToolkit().beep();
                }
                else
                {
                    for( char currentCharacter : specialCharacters)
                    {
                        if(currentCharacter == evt.getKeyChar())
                        {
                            evt.consume();
                            Toolkit.getDefaultToolkit().beep();
                        }
                    }
                }
                break;
            default:
                if(!argumentError)
                {
                    argumentError = true;
                    throw new 
                    IllegalArgumentException("The argument of this function"
                    + "must be valid");
                }
        }
    }
    
}
