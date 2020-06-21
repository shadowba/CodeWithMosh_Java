package com.datastructure;

public class Array {
    private int length;
    private int index;
    private int[] numbers;
    public Array(int length) {
        this.length=length;
        this.numbers=new int[length];
    }

    public void insert(int item){
        if(index<length){
            numbers[index]=item;
            index++;
        }
        else {
            int[] temp=new int[length+1];
            for(int i=0;i<length;i++){
                temp[i]=numbers[i];
            }
            temp[index]=item;
        }
    }

}
