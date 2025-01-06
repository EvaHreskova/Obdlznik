public class Obdlznik {

    public static void main(String[] args) {

        int vyska = 5;
        int sirka = 10;
        if(vyska<=0 || sirka<=0) {
            System.out.print("Nesprávna vstupná hodnota");
            return;
        }
        tlacObdlznik(vyska, sirka);
    }

    public static void tlacObdlznik( int vyska, int sirka) {
        int v = 1;
        int s = 1;
        while(v <= vyska) {

            if((v == 1) || (v == vyska)) {
                for (s = 1; s <= sirka - 1; s++) {
                    System.out.print("*");
                }
                if(s == sirka) {
                    System.out.println("*");
                }
            }

            else  {
                for(s=1; s<sirka; s++) {
                    char vykres = (s > 1 && s < sirka) ? ' ' : '*';
                    System.out.print(vykres);

                }
                if(s == sirka) {
                System.out.println("*");
                }
            }
            v++;
            }
        }
    }



