
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Phil Adriaan
 */
public class Main
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException
    {
        BufferedReader buffered_reader = new BufferedReader(new FileReader(new File("input")));
        List<Integer> input_list = new ArrayList();
        String line = buffered_reader.readLine();
        while (line != null)
        {
            input_list.add(Integer.valueOf(line));
            line = buffered_reader.readLine();
        }

        System.out.println(t(input_list.toArray(new Integer[input_list.size()])));

    }

    public static String t(Integer... input)
    {
        StringBuilder builder = new StringBuilder();
        int t = input[0];
        int test_case = 1;
        if (input.length != t * 3 + 1)
        {
            System.out.println("Bad input.");
        }
        else
        {
            int i = 1;
            while (i < input.length)
            {
                int a = input[i];
                i++;
                int b = input[i];
                i++;
                int k = input[i];
                i++;
                int count = 0;
                for (int j = a; j <= b; j++)
                {
                    if (j % k == 0)
                    {
                        count++;
                    }
                }
                builder.append("Case " + test_case + ": " + count + "\n");
                test_case++;
            }
        }
        return builder.toString();
    }

}
