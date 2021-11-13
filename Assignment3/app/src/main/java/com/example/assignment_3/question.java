package com.example.assignment_3;

public class question {
    public String questions  [] ={ "who are you" , "i am waleed","welcome pucit"};
    public String choices [][] ={{"css","js","html","node"},
    { "devil","c","j","l"},
    { "se","cs","s","f"}};
    public String correct [] ={"html","devil","s"};
    public String getquestion(int i)
    {
    String q=questions[i];
    return q;
    }
    public String getchoice1(int a)
    {
        String choice=choices[a][0];
        return choice;
    }
    public String getchoice2(int a)
    {
        String choice=choices[a][1];
        return choice;
    }
    public String getchoice3(int a)
    {
        String choice=choices[a][2];
        return choice;
    }
    public String getchoice4(int a)
    {
        String choice=choices[a][3];
        return choice;
    }

    public String getanswer(int i)
    {
        String answer=correct[i];
        return answer;

    }
}
