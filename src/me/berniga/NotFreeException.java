package me.berniga;

/**
 * @author : Christian Berniga
 * @class : 4 D
 * @created : 18/01/2022, martedì
 **/
public class NotFreeException   extends Exception{
    private int index;

    public NotFreeException(int index){this.index=index;}

    public String toString(){
        return "Sorry! the position ("+index+") is not free";
    }
}
