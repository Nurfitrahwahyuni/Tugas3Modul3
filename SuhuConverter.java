/**
 * SuhuConverter adalah sebuah kelas yang berisi metode-metode untuk mengkonversi suhu dari Celsius ke Fahrenheit, Kelvin, dan Reamur.
 */
public class SuhuConverter {
    /**
     * Mengkonversi suhu dari Celsius ke Fahrenheit
     *
     * @param celsius Suhu dalam derajat Celsius
     * @return Suhu dalam derajat Fahrenheit
     */
    public static double celsiusKeFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    /**
     * Mengkonversi suhu dari Celsius ke Kelvin
     *
     * @param celsius Suhu dalam derajat Celsius
     * @return Suhu dalam Kelvin
     */
    public static double celsiusKeKelvin(double celsius) {
        return celsius + 273.15;
    }

    /**
     * Mengkonversi suhu dari Celsius ke Reamur
     *
     * @param celsius Suhu dalam derajat Celsius
     * @return Suhu dalam Reamur
     */
    public static double celsiusKeReamur(double celsius) {
        return celsius * 4 / 5;
    }

    /**
     * Metode utama untuk menjalankan program. Mengkonversi suhu dari Celsius ke Fahrenheit, Kelvin, dan Reamur,
     * kemudian mencetak hasilnya ke layar
     *
     * @param args Argumen dari baris perintah (tidak digunakan dalam program ini)
     */
    public static void main(String[] args) {
        double celsius = 25.0;
        double fahrenheit = celsiusKeFahrenheit(celsius);
        double kelvin = celsiusKeKelvin(celsius);
        double reamur = celsiusKeReamur(celsius);

        System.out.println(celsius + " Celsius = " + fahrenheit + " Fahrenheit");
        System.out.println(celsius + " Celsius = " + kelvin + " Kelvin");
        System.out.println(celsius + " Celsius = " + reamur + " Reamur");

    }
}