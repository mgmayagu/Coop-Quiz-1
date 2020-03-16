/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

/**
 *
 * @author michaelmayaguari
 */
public class MorseCode {

    private char ch;
    private String code;

    /*
	 * ensures that the char value is one of the legal characters listed in the file
	 * Codes.txt. Namely only ASCII codes between 32 and 90 (inclusive) are
	 * acceptable. If the character is invalid, the constructor will throw an
	 * Exception with the message: Out‐of‐range character: << the invalid character
	 * 
     */
    public MorseCode(char ch, String code) {
        try {
            if (ch < 32 || ch > 90) {
                throw new Exception();
            }
            this.ch = ch;
            this.code = code;

        } catch (Exception e) {
            System.out.println(e + ": Out‐of‐range character: " + ch);
        }
    }

    public char getCh() {
        return ch;
    }

    public void setCh(char ch) {
        try {
            if (ch < 32 || ch > 90) {
                throw new Exception();
            }
            this.ch = ch;
        } catch (Exception e) {
            System.out.println(e + ": Out‐of‐range character: " + ch);
        }
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
