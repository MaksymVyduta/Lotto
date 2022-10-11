import com.sun.source.tree.WhileLoopTree;

import java.util.*;

public class LottoTablice {

    public static void main(String[] args) {

        boolean z;
        int liczba=0;
        Scanner we=new Scanner(System.in);

        System.err.println("wpisz 6 lisczb 1 - 49");
        Set<Integer> Zakreslone= new TreeSet<>();
        while (Zakreslone.size()<6)
        {Zakreslone.add(we.nextInt());}
        System.out.println(Zakreslone);
        we.close();
        Set<Integer> Wylosowane= new TreeSet<>();
        Random r = new Random();
        do{
            while (Wylosowane.size()<6)
            { Wylosowane.add(r.nextInt(49)+1);}
            z= Wylosowane.equals(Zakreslone);
            //System.out.println(Wylosowane);
            Wylosowane.clear();
            liczba++;}
        while (!z);
        int lata= liczba/365;
        int dni=liczba- lata*365;
        System.out.println("Wygrałeś po "+lata+" "+"latach i "+dni+ " dniach");


    }


}

// maciej.muras@gmail.com