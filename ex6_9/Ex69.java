package ex6_9;
//6.9 Zadania
//        6.9.1 Co druga wartość tablicy
//        Napisz program, który wypisze co drugi element zdefiniowanych przez Ciebie tablic. Pierwsza
//        tablica powinna mieć parzystą liczbę elementów, a druga nieparzystą.
//        6.9.2 Największa liczba w tablicy
//        Napisz program, który wypisze największą liczbę z tablicy. Tablicę zainicjalizuj przykładowymi
//        wartościami.
//        6.9.3 Słowa z tablicy wielkimi literami
//        Napisz program, w którym zdefiniujesz tablicę wartości typu String i zainicjalizujesz ją
//        przykładowymi wartościami. Skorzystaj z pętli for -each, aby wypisać wszystkie wartości tablicy
//        ze wszystkimi literami zamienionymi na wielkie. Skorzystaj z funkcjonalności toUpperCase
//        wartości typu String , którą poznaliśmy już w jednym z poprzednich rozdziałów.
//        6.9.4 Odwrotności słów w tablicy
//        Napisz program, który pobierze od użytkownika pięć słów i zapisze je w tablicy. Następnie,
//        program powinien wypisać wszystkie słowa, od ostatniego do pierwszego, z literami zapisanymi od
//        końca do początku. Dla przykładu, dla podanych słów "Ala" , "ma" , "kota" , "i" , "psa" program
//        powinien wypisać: "asp" , "i" , "atok" , "am" , "alA" .
//        6.9.5 Sortowanie liczb
//        Napisz program, który pobierze od użytkownika osiem liczb, zapisze je w tablicy, a następnie
//        posortuje tą tablicę rosnąco i wypisze wynik sortowania na ekran. Dla przykładu, dla liczb 10 , -2 ,
//        1 , 100 , 20 , -15 , 0 , 10 , program wypisze -15 , -2 , 0 , 1 , 10 , 10 , 20 , 100 . Zastanów się, jak można
//        posortować ciąg liczb i spróbuj zaimplementować swoje rozwiązanie. Przetestuj je na różnych
//        zestawach danych. Możesz też skorzystać z jednego z popularnych algorytmów sortowania, np.
//        sortowania przez wstawianie. Opis tego algorytmu znajdziesz w internecie.
//        6.9.6 Silnia liczb w tablicy
//        Napisz program, który pobierze od użytkownika pięć liczb, zapisze je w tablicy, a następnie policzy
//        i wypisze silnię każdej z pobranych liczb.
//        6.9.7 Porównaj tablice stringów
//        Napisz program, w którym zdefiniujesz dwie tablice przechowujące wartości typu String .
//        Zainicjalizuj obie tablice takimi samymi wartościami, w takiej samej kolejności. Napisz kod, który
//        porówna obie tablice i odpowie na pytanie, czy są one takie same.
public class Ex69 {
    public static void main(String[] args) {

        // 6.9.1

        int [] tabl1 = {1,2,3,4,5,6,7,8,9,10};
        int [] tabl2 = {11,12,13,14,15,16,17,18,19,20,21};

        for(int i = 0; i < tabl1.length; i += 2){
            System.out.print(tabl1[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < tabl2.length; i += 2){
            System.out.print(tabl2[i] + " ");
        }





    }
}
