package com.jamz.code;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
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
    public final static int LETTERS_WITH_SPECIAL_CHARACTERS = 2;
    public final static int NUMBERS_WITH_SPECIAL_CHARACTERS = 3;
   
    private final char[] specialCharacters = 
    {'°', '|', '!', '"', '#', '$', '%', 
    '&', '/', '(', ')', '=', '\'', '?', '¿', '¡', '¨', '*', '´', '+', '{',
    '}', '[', ']', '^', '`', '~', '\\', ',', ';', '.', ':', '-', '_','@'
    ,'<','>','¬','~'
    };
    
    private boolean argumentError = false;
    
    public void setInputFilter (int filterOption, KeyEvent evt)
    {
        switch(filterOption)
        {
            case 0:
                if(Character.isLetter(evt.getKeyChar()))
                {
                    evt.consume();
                    Toolkit.getDefaultToolkit().beep();
                }
                else
                {
                    for(char currentChar : specialCharacters)
                    {
                        if(currentChar == evt.getKeyChar())
                        {
                            evt.consume();
                            Toolkit.getDefaultToolkit().beep();
                        }
                    }
                }
                break;
            case 1:
                if(Character.isDigit(evt.getKeyChar()))
                {
                    evt.consume();
                    Toolkit.getDefaultToolkit().beep();
                }
                else 
                {
                    for(char currentChar : specialCharacters)
                    {
                        if(currentChar == evt.getKeyChar())
                        {
                            evt.consume();
                            Toolkit.getDefaultToolkit().beep();
                        }
                    }
                }
                break;
            case 2:
                if(Character.isDigit(evt.getKeyChar()))
                {
                    evt.consume();
                    Toolkit.getDefaultToolkit().beep();
                }
                break;
            case 3:
                if(Character.isLetter(evt.getKeyChar()))
                {
                    evt.consume();
                    Toolkit.getDefaultToolkit().beep();
                }
                break;
            default:
                if(!argumentError)
                {
                    argumentError = true;
                    throw new Error("The argument must be a valid type");
                }
        }
    }
    
    public void setInputCharacterLimit(JTextField field,int characterLimit, KeyEvent evt)
    {
        if()
        {
            
        }
    }
    
}
