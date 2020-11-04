package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        Integer arrLength = array.length;
        return array[arrLength-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        Integer arrLength = array.length;
        return array[arrLength-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        boolean contain = false;
        for(String x: array){
            if(x.equals(value)){
                contain = true;
                break;
            }
            else{
                contain = false;
            }
        }
        return contain;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] reverseArray = new String[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            reverseArray[array.length-1-i] = array[i];
        }
        return reverseArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String reverseArray[] = reverse(array);
        if (Arrays.equals(array,reverseArray)){
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        boolean pangramic = false;
        String allElements = "";
        for(String element:array){
            allElements += element;
        }

        String lcElements = allElements.toLowerCase();

        for(int i = 97; i<=122; i++){
            Character cLetter = (char) i;
            String sLetter = cLetter.toString();
            if(lcElements.indexOf(sLetter)==-1){
                pangramic = false;
                break;
            }
            else{
                pangramic = true;
            }
        }
        return pangramic;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        Integer counter = 0;
        for (String element: array){
            if(value.equals(element)){
                counter++;
            }
        }
        return counter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(array));
        for(int i = list.size()-1; i>=0; i--) {
            String element = list.get(i);
            if (element.equals(valueToRemove)) {
                list.remove(i);
            }
        }
        String[] stringArray = list.toArray(new String[list.size()]);
        return stringArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(array));
        for(int i = list.size()-1; i>0; i--) {
            String element = list.get(i);
            String element2 = list.get(i-1);
                if (element.equals(element2)){
                    list.remove(i-1);
                }
            }
        String[] stringArray = list.toArray(new String[list.size()]);
        return stringArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        String packedElement = "";
        ArrayList<String> list = new ArrayList<String>();
        for(int i = 0; i<= array.length-1; i++){
            String element = array[i];
            if(i == 0){
                packedElement += element;
                continue;
            }
            String element2 = array[i-1];
            if(element.equals(element2)){
                packedElement += element;
            }
            else{
                list.add(packedElement);
                packedElement = element;
            }
            if(i== array.length-1){
                list.add(packedElement);
            }
        }
        String[] stringArray = list.toArray(new String[list.size()]);
        return stringArray;
    }



}
