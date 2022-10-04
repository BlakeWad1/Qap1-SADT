package com.keyin.qap1;

public class WordComparison {
    private String name;
    private String city;
    private String province;

    public WordComparison(String n, String c, String p){
        this.name = n;
        this.city = c;
        this.province = p;
    }
    public String getName(){
        return name;
    }
    public  String getCity(){
        return city;
    }
    public String getProvince(){
        return province;
    }
    public String setName(String n) {
        this.name = n;
        return n;
    }
}
