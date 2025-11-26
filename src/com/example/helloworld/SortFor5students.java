package com.example.helloworld;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SortFor5students {
    String basePath = "C:\\Users\\jariz\\Downloads\\";

    List<String> resultList = new ArrayList<String>();

    public SortFor5students() throws FileNotFoundException {
        try
        {
            FileReader fr = new FileReader(basePath+"studentsGroup3.txt");
            List<String> list = fr.readAllLines();
            fr.close();

            String[] arr;
            for(int i=0;i<list.size();i++)
            {

                arr = list.get(i).split("\t");

                if(Integer.parseInt(arr[2]) == 5)
                {
                    resultList.add(list.get(i));
                }
            }

            FileWriter fw = new FileWriter(basePath+"studentsGroup3with5.txt");
            fw.write(String.join("\n",resultList));
            fw.close();

        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found");
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
