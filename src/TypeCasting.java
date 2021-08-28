public class TypeCasting {

    public static void main(String[] args) {

        /**
         * Dolaylı tür dönüşümü (Implicit type casting)
         *
         * değer aralığı düşük bir türden yüksek bir türe
         * dönüşüm yapılıyorsa burada dolaylı tür dönüşümü söz konusudur.
         *
         * Dolaylı tür dönüşümü yalnızca daha az kapsayıcı bir türden daha çok
         * kapsayıcı bir türe doğru yapılabilir. Bu nedenle bu tür dönüşümler genişleyen
         * dönüşüm (widening conversion) olarak da adlandırılır.
         */

        int a = 5;
        long b = a;

        System.out.println("Dolaylı tür dönüşümü (Implicit type casting):"+ b);

        /**
         * Doğrudan tür dönüşümü (Explicit type casting)
         *
         * Dolaylı tür dönüşümünün aksine, daha kapsayıcı bir türden daha az kapsayıcı
         * bir türe doğru yapılan dönüşümlere doğrudan tür dönüşümü denir. Doğrudan
         * denmesinin sebebi, yapılacak dönüşümün yönünü belirtmemiz
         * gerektiğindendir.
         *
         * Doğrudan tür dönüşümleri, daralan dönüşüm (narrowing conversion) olarak
         * da adlandırılır.
         */

        long c = 5;
        int d = (int) c;

        System.out.println("Doğrudan tür dönüşümü (Explicit type casting):"+ d);
    }
}
