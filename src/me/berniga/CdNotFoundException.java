package me.berniga;

/**
 * @author : Christian Berniga
 * @class : 4 D
 * @created : 18/01/2022, martedì
 **/
public class CdNotFoundException    extends Exception{
    public CdNotFoundException(){super();}

    public String toString(){
        return "The cd you are looking for is not in this holder";
    }
}
