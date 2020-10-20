package e_java.chapter9.item58;

import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;

/**
 * FileName: DiceRolls
 * Date: 2020/10/19 11:09
 * Author:cs
 * Description:
 */
public class DiceRolls {
    enum Face{  ONE,TWO,THREE,FOUR,FIVE,SIX}

    public static void main(String[] args) {
        Collection<Face> faces = EnumSet.allOf(Face.class);
        for (Iterator<Face> i = faces.iterator(); i.hasNext(); )
            for (Iterator<Face> j = faces.iterator(); j.hasNext(); )
                System.out.println(i.next() + " " + j.next());

        System.out.println("***************************");

        for (Face f1 : faces)
            for (Face f2 : faces)
                System.out.println(f1 + " " + f2);

    }
}
