package com.example.springboot.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TaskService {

    //get direct answer
    public int taskLogic_1(String number)
    {
        char answer=number.charAt(0);
        for (int i=1; i<number.length();i++)
        {
            if (answer<number.charAt(i))
            {
                answer=number.charAt(i);
            }
        }
        return Character.getNumericValue(answer);
    }

    //with explanation
    public int taskLogic_2(String number)
    {
        String num="";
        ArrayList<String> arrOfNums = new ArrayList<String>();
        while (!number.equals("0"))
        {
            for (int i=0; i<number.length();i++)
            {
                if (number.charAt(i)=='0')
                {
                    num+="0";
                }
                else
                {
                    num+="1";
                }
            }
            arrOfNums.add(num);
            number=Integer.toString(Integer.parseInt(number)-Integer.parseInt(num));
            num="";
        }
        for (String s:arrOfNums)
        {
            System.out.println(s);
        }
        return arrOfNums.size();
    }
}
