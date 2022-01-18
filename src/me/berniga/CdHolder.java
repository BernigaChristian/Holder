package me.berniga;

import javax.imageio.IIOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author : Christian Berniga
 * @class : 4 D
 * @created : 18/01/2022, martedì
 **/
public class CdHolder {
    private Cd[] cds;

    public CdHolder(int dim){cds=new Cd[dim];}

    public int size(){return cds.length;}

    public Cd getCd(int index){
        return cds[index];
    }

    public void setCd(int index,Cd cd)  throws NotFreeException{
        if(cds[index]!=null)     throw new NotFreeException(index);
        cds[index]=cd;
    }

    public void removeCd(int index){
        cds[index]=null;
    }

    public int getN(){
        int counter=0;
        /*for(int i=0;i< cds.length;i++)
            if(cds[i]!=null)    counter++;*/
        for(Cd c:cds)
            if(c!=null) counter++;
        return counter;
    }

    public int searchCd(String title)   throws CdNotFoundException{
        for(int i=0;i<cds.length;i++)
            if(cds[i].getTitle().equalsIgnoreCase(title))   return i;
        throw new CdNotFoundException();
    }

    public void backup(String fileName) throws IOException {
        BufferedWriter wr = new BufferedWriter(new FileWriter(fileName));
        for(Cd c:cds)
            if(c!=null) wr.append(c.toString()+"\n");
        wr.close();
    }

    public String[] string()  throws EmptyHolderException{
        String[] cdsInHolder=new String[100];
        int index=0;
        for(Cd c:cds)
            if(c!=null) cdsInHolder[index++]=c.toString();
        if(cdsInHolder[0]==null)       throw new EmptyHolderException();
        return cdsInHolder;
    }

    public int compareCdHolder(CdHolder ch){
        int counter=0;
        for(Cd c:cds)
            for(int i=0;i<ch.size();i++)
                if(c!=null&&ch.getCd(i)!=null&&c.getTitle().equalsIgnoreCase(ch.getCd(i).getTitle()))   counter++;
        return counter;
    }
}
