package temperatureconvertor;

import java.lang.*;
import java.util.Scanner;

// F to C: ((t-32.0f)*5.0f)/9.0f
// C to K: t+273.15f
// K to F: (((t-273.15f)*9.0f)/5.0f)+32.0f

public class TemperatureConvertor {
    public static void main(String [] args) {
        Scanner reader = new Scanner(System.in);
        char inputType;
        char outputType;
        float inputValue;

        System.out.print("Input type (F/C/K): ");
        inputType = reader.next().charAt(0);
        System.out.print("Output type (F/C/K): ");
        outputType = reader.next().charAt(0);
        System.out.print("Temperature: ");
        inputValue = reader.nextFloat();

        switch (inputType)
        {
            case 'F' :
                inputValue = ftoC(inputValue);
                break;
            case 'C' :
                break;
            case 'K' :
                inputValue = ftoC(ktoF(inputValue));
                break;
            default:
                System.exit(1);
        }

        switch (outputType)
        {
            case 'F' :
                inputValue = ktoF(ctoK(inputValue));
                break;
            case 'C' :
                break;
            case 'K' :
                inputValue = ctoK(inputValue);
                break;
            default:
                System.exit(1);
        }

        System.out.println(inputValue);
    }


    //creating methods
    public static float ftoC(float fVal)
    {
        return ((fVal-32.0f)*5.0f)/9.0f;
    }

    public static float ktoF(float kVal)
    {
        return (((kVal-273.15f)*9.0f)/5.0f)+32.0f;
    }

    public static float ctoK(float cVal)
    {
        return cVal+273.15f;
    }

}
