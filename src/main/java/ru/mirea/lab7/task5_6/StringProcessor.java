package ru.mirea.lab7.task5_6;

public class StringProcessor implements IStringOperations{
    @Override
    public int countCharacters(String s) {
        if (s == null) return 0;
        return s.length();
    }

    @Override
    public String getOddPositionCharacters(String s) {
        if (s == null || s.isEmpty()) return "";
        StringBuilder res = new StringBuilder();
        for(int i=0;i<s.length();i+=2){
            res.append(s.charAt(i));
        }
        return res.toString();
    }

    @Override
    public String reverseString(String s) {
        if (s == null) return null;
        return new StringBuilder(s).reverse().toString();
    }
}
