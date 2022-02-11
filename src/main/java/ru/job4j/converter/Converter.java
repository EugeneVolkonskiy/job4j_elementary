package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(322);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("322 rubles are " + dollar + " dollars.");
        float in = 322;
        float expected = 5.366667f;
        float out = Converter.rubleToDollar(in);
        boolean passed = expected == out;
        System.out.println("322 rubles are 5.366667. Test result : " + passed);
    }
}
