package com.techelevator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DateFashionTest {

    /*
    You and your date are trying to get a table at a restaurant. The parameter "you" is the stylishness
    of your clothes, in the range 0..10, and "date" is the stylishness of your date's clothes. The result
    getting the table is encoded as an int value with 0=no, 1=maybe, 2=yes. If either of you is very
    stylish, 8 or more, then the result is 2 (yes). With the exception that if either of you has style of
    2 or less, then the result is 0 (no). Otherwise the result is 1 (maybe).
    dateFashion(5, 10) → 2
    dateFashion(5, 2) → 0
    dateFashion(5, 5) → 1
    */

    //you       date        result
    //10        7           2
    //8         5           2
    //5         5           1
    //3         5           1
    //8         2           0
    //2         10          0
    //7         7           1



    private DateFashion fashion;

    @Before
    public void setup(){
        fashion = new DateFashion();
    }

    @After
    public void cleanup(){

    }

    @Test
    public void style_ten_and_seven(){
        //act
        int result = fashion.getATable(10,7);
        //assert
        Assert.assertEquals(2,result);
    }

    @Test
    public void style_eight_and_five(){
        //act
        int result = fashion.getATable(8,5);
        //assert
        Assert.assertEquals(2,result);
    }

    @Test
    public void style_five_and_five(){
        //act
        int result = fashion.getATable(5,5);
        //assert
        Assert.assertEquals(1,result);
    }

    @Test
    public void style_three_and_five(){
        //act
        int result = fashion.getATable(3,5);
        //assert
        Assert.assertEquals(1,result);
    }

    @Test
    public void style_eight_and_two(){
        //act
        int result = fashion.getATable(8,2);
        //assert
        Assert.assertEquals(0,result);
    }

    @Test
    public void style_ten_and_two(){
        //act
        int result = fashion.getATable(10,2);
        //assert
        Assert.assertEquals(0,result);
    }

    @Test
    public void style_negative_three_and_five(){
        //act
        int result = fashion.getATable(-3,5);
        //assert
        Assert.assertEquals(0,result);
    }

    @Test
    public void style_zero_and_ten(){
        //act
        int result = fashion.getATable(0,10);
        //assert
        Assert.assertEquals(0,result);
    }


}
