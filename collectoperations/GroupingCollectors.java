package collections.streamsempty.collectoperations;


import collections.streamsempty.helperclasses.Account;
import collections.streamsempty.helperclasses.Status;

import java.util.List;

public class GroupingCollectors {
    public static void main(String[] args) {

        List<Account> accounts = List.of(
                new Account(3333, "530012", Status.REMOVED),
                new Account(15000, "771843", Status.ACTIVE),
                new Account(0, "681891", Status.BLOCKED),
                new Account(2000, "681891", Status.ACTIVE)
        );

        //1. grupeaza conturile din lista dupa status (adica genereaza o mapa in care cheia este statusul, iar valoarea o lista cu toate conturile care au acel status)

        //2. grupeaza angajatii din lista dupa tara (adica genereaza o mapa in care cheia este tara, iar valoarea o lista cu toti angajatii din acea tara

        //3. genereaza o mapa in care cheia este tara, iar valoarea este suma salariilor angajatilor din acea tara)

        //4. genereaza o mapa in care cheia este tara, iar valoarea este numarul de angajati din acea tara)

        //5. genereaza o mapa in care cheia este numele produsului, iar valoarea este numarul de produse cu acel nume care se afla in lista

        //6. genereaza o mapa in care cheia este numele produsului, iar valoarea cantitatea totala a produselor cu acel nume)

        //7. genereaza o mapa in care cheia este pretul produsului, iar valoarea este lista de produse cu acel pret
        //adica grupeaza produsele dupa pret

    }

}

