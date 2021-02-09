package pboConcept;
public class konversiSuhu {
    public static void main(String[] args) {
        System.out.println("Konversi Suhu");
        byte celcius = 78;
        int reamur, farenheit, kelvin;
        reamur = 4*celcius/5;
        farenheit = 9*celcius/5+32;
        kelvin = celcius+273;
        System.out.println("78 derajart celcius = "+reamur+" derajat reamur");
        System.out.println("78 derajart celcius = "+farenheit+" derajat farenheit");
        System.out.println("78 derajart celcius = "+kelvin+" derajat kelvin");
    }
}
