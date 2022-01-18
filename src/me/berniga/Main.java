package me.berniga;

import java.io.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    CdHolder c=new CdHolder(10);
        try{
            //BufferedReader in=new BufferedReader(new FileReader("in.txt"));
            Scanner in=new Scanner(new File("in.txt"));
            while(in.hasNextLine()){
                String[] data=in.nextLine().split(";");
                try{
                    c.setCd(new Random().nextInt(c.size()),new Cd(data[0],data[1],Integer.parseInt(data[2]),Integer.parseInt(data[3])));
                }catch(NotFreeException e) {System.out.println(e);}
            }
        }catch (IOException e){System.out.println(e);}

        try{
            String[] str=c.string();
            for(String s:str)
                if(s!=null) System.out.println(s);
        }catch(EmptyHolderException e){System.out.println(e);}

        try{
            c.backup("out.txt");
        }catch(IOException e){System.out.println(e);}
    }
}
