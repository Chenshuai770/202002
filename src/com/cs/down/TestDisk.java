package com.cs.down;

public class TestDisk {
    public static void main(String[] args) {
        String text = "往事是留在岁月流年里的印记，比如某年某月的相逢，又比如某年某月回眸时的初遇。";
        text = text.replaceAll("\\，", "\\\n");
        text = text.replaceAll("\\。", "\\\n");
        System.out.println(text);
    }
}
