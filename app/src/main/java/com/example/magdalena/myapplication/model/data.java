package com.example.magdalena.myapplication.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Magdalena on 2017-03-15.
 */

public class data {
    private static final String[] tytuly = {"WydarzenieA", "WydarzenieB", "WydarzenieC"};

    private static final String[] daty = {"20.05.2017 9:00 sala 1", "22.05.2017 11:00 sala 2", "23.05.2017 12:00 sala 3"};

    private static final String[] opisy = {"XYZ", "ABC", "123"};


    public static List<iteamList> getiteamList()
    {
        List<iteamList>data=new ArrayList<>();

        for(int x=0; x<4; x++)
        {

            for( int l=0; l< tytuly.length; l++ )
            {
                iteamList item=new iteamList();
                item.setTytuly(tytuly[l]);
                item.setDaty(daty[l]);
                item.setOpisy(opisy[l]);
                data.add(item);


            }

        }
        return data;
    }
}
