package util;

import com.sun.source.tree.InstanceOfTree;

public class Converter {

    public static double dolar ,quantity;
    public static final double IOF = 6.0;

    public static double convert (){

        return (dolar*quantity)+((dolar*quantity)*IOF/100);


    }

}
