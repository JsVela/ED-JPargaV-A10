/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.jpargav.a10;

import ed.stack;

/**
 *
 * @author JESUS PARGA VELA
 */
public class Simbolos extends stack {

    public Simbolos() {
        super ();
    }

    public static boolean PApertura(char car) {
        if (car == '(' || car == '[' || car == '{') {
            return true;
        } else {
            return false;
        }
    }

    public static boolean PCerradura(char car) {
        if (car == ')' || car == ']' || car == '}') {
            return true;
        } else {
            return false;
        }
    }

    public static boolean Compara(Object car1, Character car2) {
        if (car1.equals('(')) {
            if (car2.equals(')')) {
                return true;
            } else {
                return false;
            }
        } else if (car1.equals('{')) {
            if (car2.equals('}')) {
                return true;
            } else {
                return false;
            }
        } else if (car1.equals('[')) {
            if (car2.equals(']')) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean Sintaxis(char[] exp) {
        boolean noerror = true;
        for (int i = 0; i < exp.length && noerror; ++i) {
            if (PApertura(exp[i])) {
                push(exp[i]);
            } else {
                if (PCerradura(exp[i])) {
                    if (!isEmpty()) {
                        if (!Compara(pop2(), exp[i])) {
                            noerror = false;
                        } else ;
                    } else {
                        noerror = false;
                    }
                }
            }
        }
        if (isEmpty() && noerror) {
            return true;
        } else {
            return false;
        }
    }
}
