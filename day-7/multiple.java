import java.io.*;
import  java.util.*;
class Main
{

    public static boolean isMultiple(int num1, int num2){

    int remainder = num1 % num2;
    boolean multiple = true;

    if (remainder != 0){
        multiple = false;
    }
    return multiple;
}
