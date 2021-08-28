public class Arrays {

    public static void main(String[] args) {

        /**
         * Tek boyutlu diziler
         * Tek boyutlu diziler basitçe, aynı türden elemanların listesini tutan bir yapıdır.
         * Diziler new deyimiyle oluşturulur. Dizi oluştururken kapasite değeri vermek
         * zorunludur.
         */

        // int numbers[]; // Burada numbers isminde bir dizi oluşturuluyor
        // int[] numbers; // Burada da numbers isminde bir dizi oluşturuluyor.

        int[] numbers = new int[5];

        numbers[0] = 10;
        numbers[1] = 15;
        numbers[2] = 20;
        numbers[3] = 25;
        numbers[4] = 30;

        System.out.println(numbers[3]);

        //System.out.println(numbers[5]); // Hata! Dizide 5. indis yok. Yani dizinin 6. elemanına erişmeye
        // çalışıyoruz.

        String[] weekDays = new String[] { "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar" };

        //üstteki kod ile aynı işi yapar. New yazmamıza gerek yoktur.
        //String[] weekDays = { "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar" };

        System.out.println(numbers.length); // Konsolda 5 yazar

        /**
         * Çok boyutlu diziler
         * İlk köşeli parantez birinci boyutu (satırları), diğeri ise ikinci boyutu
         * (sütunları) belirtir.
         */


        int[][] matrix = new int[3][4];
        int number = 1;
        for (int x = 0; x < matrix.length; x++)
        {
            System.out.println(matrix[x].length);
            int[] row = matrix[x];
            for (int y = 0; y < row.length; y++)
            {
                row[y] = number;
                number++;
                System.out.print(matrix[x][y]);
            }
            System.out.println("");
        }

        //Burada önce 3 satırdan oluşan bir matris belirttik, fakat sabit bir sütun sayısı
        //vermedik. Sonra her bir satır için ayrı ayrı sütun sayısı belirledik.
        int[][] matrix2 = new int[3][];
        matrix2[0] = new int[1];
        matrix2[1] = new int[2];
        matrix2[2] = new int[3];
    }
}
