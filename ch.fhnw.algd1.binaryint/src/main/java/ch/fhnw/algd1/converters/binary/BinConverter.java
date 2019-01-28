package ch.fhnw.algd1.converters.binary;


public class BinConverter {
    public static String toString(int x) {
        // TODO: expect x to be in range [-128, 127], return string with 8 binary digits representing x in 2-complement


        if ((x < 127) & (x > -128)) {

            byte b = (byte) x;

            String result = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');


            if (b < 0) {

                int reslen = result.length();
                return result.substring(reslen - 8);

            }
            return String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        }

        return "00000000";
    }

    public static int fromString(String text) {
        // TODO: expect text to contain 8 binary digits, parse to int value in 2-complement

        Byte b = new Byte(text);

        if( (b < Byte.MAX_VALUE) && (b > Byte.MIN_VALUE)){
            return (int) b;
        }

        return 0;
    }
}