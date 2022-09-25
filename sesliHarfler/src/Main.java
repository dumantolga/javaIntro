public class Main {
    public static void main(String[] args) {
        char harf = 'A';

        char[] inceSesliHarfler = {'E', 'İ', 'Ö', 'Ü'};
        char[] kalınSesliHarfler = {'A', 'I', 'O', 'U'};


        for (int i = 0; i <= 3; i++) {
            if (harf == inceSesliHarfler[i]) {
                System.out.println(harf + " : ince sesli bir harftir");
                return;
            }
        }
        for (int j = 0; j <= 3; j++) {
            if (harf == kalınSesliHarfler[j]) {
                System.out.println(harf + " : kalın sesli bir harftir");
                return;
            }
        }
        System.out.println("Geçersiz karakter");

        System.out.println("--------------");


        //switch ile farklı bir yöntem

        /*switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın sesli harf");
                break;
            case 'E':
            case 'İ':
            case 'Ö':
            case 'Ü':
                System.out.println("İnce sesli harf");
                break;
            default:
                System.out.println("Geçersiz karakter");
                break;
        }*/

    }
}