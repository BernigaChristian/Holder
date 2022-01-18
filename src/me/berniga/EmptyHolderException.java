package me.berniga;

/**
 * @author : Christian Berniga
 * @class : 4 D
 * @created : 18/01/2022, martedì
 **/
public class EmptyHolderException   extends Exception{
    public EmptyHolderException(){super();}

    public String toString(){
        return "The holder is empty";
    }
}
