import java.util.Scanner;
class Main {
  public static void main(String[] args) { 
   Scanner scan=new Scanner(System.in);
    char[][] plansza=new char [6][6];
        int x=5;
        do{
        System.out.print("\t");
        //Pętla drukująca nagłówki kolumn
        for(int i=0;i<6;i++){
          System.out.print(i+"\t");        }
        System.out.println();
        //Drukowanie wierszy
        for(int wiersz=0;wiersz<6;wiersz++){
       System.out.print(wiersz+":\t");
        for(int kolumna=0;kolumna<6;kolumna++){
          System.out.print(plansza[wiersz][kolumna]+"\t");
        }
        System.out.println();
        }

          System.out.println("Twój ruch\nPodaj indeks wiersza: ");
          int nowywiersz=scan.nextInt();
          System.out.println("Podaj indeks kolumny: ");
            int nowakolumna=scan.nextInt();
          
plansza[nowywiersz][nowakolumna]='X';
        }while(x==5);
        
  }
}