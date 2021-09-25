package com.daedalus.keyword;

public class TestAction
{
    String name="";
    public void getNewProject()
    {
        System.out.println("User got new Project");
    }
    public String typePrint(String name)
    {
        System.out.println("User is trying to print");
        return this.name=name;
    }

    public void printTheString(String text)
    {
        System.out.println("*******"+text+"*********");
    }
}
