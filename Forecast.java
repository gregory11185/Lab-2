 /**
 * @author: Gregory Eganovi CISC 3130
 * @since 09/13/20202
 * @version 1.0
 *
 * Lab Activity 2
 * Description: Program that converts 7 days of weather from Fahrenheit
 * to Celsius and back to Fahrenheit. Prints out the conversion for each day.
 */
package forecast;

public class Forecast {

    public static void main(String[] args) {
        // Initial 7 days of weather stored in array
        double Fahrenheit[]={85,56,72,98,32,67,45}, celsius[] = new double[7];
        // Conversion from Fahrenheit to Celcius
        for (int i = 0; i < 7; i++){
            celsius[i] = (5.0/9.0) * (Fahrenheit[i] - 32.0);
        
        System.out.println("The temperature in Fahrenheit: " + Fahrenheit[i] + " is equal to " + celsius[i] + " in celsius");
        }
        // Conversion from Celcius back to Fahrenheit
        for (int i = 0; i < 7; i++){
            Fahrenheit[i] =  (celsius[i] * (9.0 / 5.0) + 32.0);
        
        System.out.println("The temperature in celsius: " + celsius[i] + " is equal to " + Fahrenheit[i] + " in Fahrenheit");
        }
    }
    
}
