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
    /** 
     *  Constant used in function setInputFilter, allow consume characters
     *  typed by the user on a text field component.
     *  @since v0.0.1
     */
    public final static int NO_CHARACTERS = 0;
    /**
     *  Constant used in function setInputFilter, allow consume numbers typed 
     *  by the user on a text field component.
     *  @since v0.0.1
     */
    public final static int NO_NUMBERS = 1;
    /**
     *  Constant used in function setInputFilter, allow consume numbers and
     *  special characters typed by the user on a text field component.
     *  @since v0.0.1
     */
    public final static int CHARACTERS_WO_SPECIAL_CHARACTERS = 2;
    /**
     *  Constant used in function setInputFilter, allow consume special
     *  characters and letters only allowing to the user type numbers.
     *  @since v0.0.1
     */
    public final static int NUMBERS_WO_SPECIAL_CHARACTERS = 3;
   
    private final static char[] specialCharacters = 
    {'°', '|', '!', '"', '#', '$', '%', 
    '&', '/', '(', ')', '=', '\'', '?', '¿', '¡', '¨', '*', '´', '+', '{',
    '}', '[', ']', '^', '`', '~', '\\', ',', ';', '.', ':', '-', '_','@'
    ,'<','>','¬','~'
    };
    
    private static boolean argumentError = false;
   
    
    /** This function allow to the programmer limit the typing of certain characters or number in a text field using a filter constant.
     * @since v0.0.1
     * @param field JTextField to limit user typing entry.
     * @param characterLimit Quantity of characters to limit on the text field.
     * @param evt KeyTyped event of the text field component.
     */
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
    
    /** Allow to use a filter to deny user typing certain characters or numbers depending of the number or constant introduced in the argument inputFilter.
     * @since v0.0.1
     * @param inputFilter Determines what characters are going to consume on the text field when the user type on the text field.
     * @param evt KeyTyped event of the text field component.
     */
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
    
    /** This function contains the functions of setInputLimit and setInputFilter, use it when you need to use these two functions instead of use that two functions separately.
     * @since v0.0.1
     * @param field TextField component to limit user typing entry.
     * @param inputFilter Determines what characters are going to consume on the text field when the user type on the text field.
     * @param characterLimit Quantity of characters to limit on the text field.
     * @param evt KeyTyped event of the text field component.
     */
    
    public static void setInputFilterAndLimit( JTextField field,
                                               int inputFilter,
                                               int characterLimit,
                                               KeyEvent evt)
    {
        setInputFilter(inputFilter, evt);
        setInputLimit(field, characterLimit, evt);
    }
    
}
