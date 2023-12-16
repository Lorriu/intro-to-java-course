package com.cbfacademy.words;

import java.lang.*;



public class ReverseCharSequence implements CharSequence {

    private String sequenceValue;

    public ReverseCharSequence(String sequenceValue){

         this.sequenceValue = sequenceValue;
    }

    @Override
    public int length() {

        return sequenceValue.length();

    }

    @Override
    public char charAt(int index) {
       
       return sequenceValue.charAt(length() - index - 1);

    }

    @Override
    public CharSequence subSequence(int start, int end) {
      
        return new ReverseCharSequence(sequenceValue.substring(length() - end, length() - start));
    }
    
    //reverses the string
    @Override
    public String toString(){

        return new StringBuilder(sequenceValue).reverse().toString();

    }
    
}
