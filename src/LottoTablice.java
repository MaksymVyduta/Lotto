import com.sun.source.tree.WhileLoopTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LottoTablice {

    public static void main(String[] args) {


        // tworzymy tabele z "zakreślonymi" przez użytkownika liczbami
        Scanner we=new Scanner(System.in);
        System.err.println("wpisz 6 lisczb 1 - 49");
        int[] Zakreslone= new int[6];
        for (int i=0;i<Zakreslone.length;i++)
         Zakreslone[i] = we.nextInt();
        // sortujemy tabele
        Arrays.sort(Zakreslone);
        we.close();
        //dekaracja zmiennych
        // 1)zmienna liczba, która będzie wykorzystana jako licznik porównań dwóch tabeli
        // 2) Zmienna z, zmieni wartość na True kiedy szóstka zostanie trafiona
        int liczba=0;
        boolean z;

        //Pętla do-while porównuje dwie tabele ze sobą aż do momentu kiedy okaże się że są jednakowe
        do {       int[] Wylosowane = new int[6];
            // losowanie unikatowych liczb (tak żeby żadna się nie powtórzyła)
            Losowanie:
            for (int i = 0; i < Wylosowane.length; i++) {
                Random r = new Random();
                int LiczbaWylosowana = r.nextInt(50)+1;
                for (int j = 0; j < Wylosowane.length; j++)
                    if (Wylosowane[j] == LiczbaWylosowana) {
                        // SPRAWDZZENIE : System.err.println("Powtorzyla sie"); - Liczbę która już została wylosowana , losuje jeszcze raz
                        i--;
                        continue Losowanie;
                    }
                Wylosowane[i] = LiczbaWylosowana;
            }
            //po wylosowaniu liczb sortujemy i porównujemy z tabela liczb wpisanych przez użytkownika
            Arrays.sort(Wylosowane);

           // System.out.println(Arrays.toString(Wylosowane));
            //System.out.println(Arrays.toString(Zakreslone)); -SPRAWDZENIE czy posortowane. OK
             z= Arrays.equals(Wylosowane,Zakreslone);
            //jeżeli z będzie miała wartość true, to "6" trafiona
            // zwiększamy licznik prób o 1
                liczba++;
        }
        while (!z);
        int lata= liczba/365;
        int dni=liczba- lata*365;
        System.out.println("Wygrałeś po "+lata+" "+"latach i "+dni+ " dniach");


    }


}

// maciej.muras@gmail.com