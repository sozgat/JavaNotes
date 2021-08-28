public class Operators {

    /**
     * dört işlem
     */

    {
        int a = 6 + 3; // 9
        int b = 6 - 3; // 3
        int c = 6 * 3; // 18
        int d = 6 / 3; // 2

        int e = 0;
        int f = 7 / e; // ArithmeticException: 0'a bölme hatası
    }

    /**
     * Mod Alma: Bir bölme işlemindeki kalanı bulmak için % operatörünü kullanırız:
     */

    {
        int a = 10 % 2; // a’nın değeri 0 olur
        int b = 10 % 3; // b’nin değeri 1 olur
        int c = 10 % 4; // c’nin değeri 2 olur
        int d = 10 % 6; // d’nin değeri 4 olur
    }

    /**
     * Bileşik aritmetik operatörler (Compound arithmetic operators)
     */

    {
        int a = 6; // a’nın değeri 6’dır
        a += 3; // a’nın değeri 9 olur

        int b = 6; // b’nin değeri 6’dır
        b -= 3; // b’nin değeri 3 olur

        int c = 6; // c’nin değeri 6’dır
        c *= 3; // c’nin değeri 18 olur

        int d = 6; // d’nin değeri 6’dır
        d /= 3; // d’nin değeri 2 olur

        int e = 7; // e’nin değeri 7’dir
        e %= 3; // e’nin değeri 1 olur (7’nin 3’le bölümünden kalan 1’dir)
    }

    /**
     * 1 artırma ve 1 azaltma operatörleri (Increment and decrement
     * operators)
     */

    {
        int a = 5; // a’nın değeri 5’tir
        a++; // a’nın değeri 6 olur
        int b = 5; // b’nin değeri 5’tir
        b--; // b’nin değeri 4 olur
    }


    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++);
        // a’nın değeri önce elde edildi ve konsola yazdırıldı, sonra 1 artırıldı,
        // yani konsolda 10 yazar; fakat a’nın değeri 11 olmuştur
        System.out.println(a);
        // Şimdi a’nın değeri konsola yazdırıldığında konsolda 11 görürüz

        int b = 10;
        System.out.println(++b);
        // b’nın değeri önce 1 artırıldı, sonra konsola yazdırıldı
        // yani konsolda 11 yazar

        /**
         * Üçlü if-then-else operatörü
         *
         */
        boolean c = true;
        boolean d = false;
        System.out.println(c ? 3 : 5); // Konsola 3 yazar
        System.out.println(d ? 3 : 5); // Konsola 5 yazar
    }

}
