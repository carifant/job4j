package ru.job4j.loop;

import org.w3c.dom.ls.LSOutput;

public class Mortgage {

        public int year(int amount, int salary, double percent) {
            int year = 0;

            while (amount > 0) {
                amount = (int) (amount  + (amount* (percent/100)) - salary);
               year++;
               if(amount < 0)
                   break;
            }
            return year;
        }



}
