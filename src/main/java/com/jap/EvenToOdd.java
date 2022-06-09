package com.jap;

public class EvenToOdd
{
    public  int[] getOddArray(int number[]){

        int newArray[] = new int[number.length];
        int temp=0;
        int j=0;
        for (int i = 0; i < number.length ; i++) {
            if(number[i]%2==0){
                temp=number[i];
                newArray[j]=number[i]+1;
                j++;
            }
            else {
                newArray[j]=number[i];
                j++;
            }
        }

        return newArray;
    }
    public static void main(String[] args) {
        int number[]= {24,46,75,79,31,47,78};
        EvenToOdd evenToOdd = new EvenToOdd();

        int newArray[]=evenToOdd.getOddArray(number);
        for (int i = 0; i < newArray.length ; i++) {
            System.out.println(newArray[i]);
        }

    }

}
