/**
 *
 * İlkel türler, karmaşık verileri değil, tek bir değeri temsil eder. Java nesne
 * yönelimli bir dil olmasına rağmen, ilkel veri türleri bunun dışındadır. Nesne
 * yönelimli bir dilde ilkel türlerin olmasının sebebi verimliliktir. Eğer ilkel veri
 * türleri olmasaydı, bunun yerine kullanacağımız nesneler verimliliği
 * düşürecekti. Bu türlere çok fazla ihtiyaç duyacağımız için bunlar ilkel olarak
 * dile dahil edilmiştir.
 *
 * İlkel veri türleri kesin bir şekilde tanımlanmıştır:
 * Hafızada kaplayacağı alanın büyüklüğü belirlidir.
 * Alabileceği değerler belli bir aralıkla sınırlandırılmıştır.
 *
 *
 * İlkel veri türüne sahip değişkenler kapsam dışına çıkınca otomatik olarak
 * hafızadan da silinirler. Diğer bir deyişle, ilkel veri türüne sahip değişkenlerin
 * yaşam süresi kapsamlarıyla aynıdır. Fakat bu diğer veri türündeki değişkenler
 * için geçerli değildir. İlkel olmayan veri türündeki değişkenler kapsam dışına
 * çıksa da hafızada kalmaya devam edebilir.
 *
 * 1BYTE = 8 BIT
 */

public class PrimitiveDataTypes {

    /**
     * integers -> byte, short, int, long (signed -> 0'dan büyük veya küçük olabilir)
     * floating point numbers -> float, double
     * char -> values: numbers, characters, punctuation sign
     * boolean -> values: true, false
     */

    /**
     * INTEGERS
     */

    // 8 bitten oluşur, 1byte alan kaplar. -128'den -127'e kadar olan değerleri tutabilir.
    byte aByte;

    // 16 bitten oluşur, 2 byte alan kaplar. –32,768’den 32,767'e kadar olan değerleri tutabilir.
    short aShort;

    // 32 bitten oluşur, 4 byte alan kaplar. –2,147,483,648’den 2,147,483,647’ye kadar olan değerleri tutabilir.
    int anInt;

    // 64 bitten oluşur, 8 byte alan kaplar. Alabileceği değerler -9,223,372,036,854,775,807 ile 9,223,372,036,854,775,808 arasındadır.
    long aLong;

    /**
     * FLOATING POINT NUMBERS
     */

    // 32 bitten oluşur, 4 byte alan kaplar. Tek kesinlikli (single precision) değerleri temsil eder.
    float aFloat;

    // 64 bitten oluşur, 8 byte alan kaplar. Çift kesinlikli (double precision) değerleri temsil eder.
    // Bunun anlamı şudur: virgülden sonra tutabileceği rakam sayısı float türüne göre daha fazladır.
    // Çoğu durumda float ihtiyacınızı karşılayacak olsa da özellikle kesinlik gerektiren matematiksel
    // işlemlerde double daha çok işe yarar.
    double aDouble;

    /**
     * CHAR
     */

    // Karakterleri temsil eden veri türü char’dır. Java Unicode karakter setini kullanır.
    // Java’nın yazıldığı dönemde Unicode için en az 16 bit gerekiyordu.
    // Bu nedenle, char veri türü hafızada 2 byte alan kaplar.
    // 0’dan 65,536’ya kadar olan değerleri tutabilir. Negatif karakter yoktur.
    char aChar;

    /**
     * BOOLEAN
     */

    // true or false Java’nın geliştiricileri boolean türünü tam olarak
    // mantıksal bir veri türü olarak tasarlamışlardır. Dolayısıyla boolean ile sayısal
    // türler arasında dönüşüm yapılamaz.
    boolean aBoolean;

}
