/**
 * @Version 1.0
 * @Author:hechen
 * @Date:${DATE}
 * @Content:
 */

import org.junit.Test;

import java.util.Random;
import java.util.stream.DoubleStream;

public class DemoTest {

    public DemoTest(){
        int a =1;
    }


    public static void main(String[] args) {
        int k = 3;
        int b = 7;
        System.out.println(k+b);
        DemoTest test = new DemoTest();

    }
    @Test
    public void edgenTest(){
        System.out.println("我来打酱油！");
        try {
            Thread.sleep(100000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
    @Test
    public void edTest(){
        int aDouble = new Random().nextInt();
        System.out.println(aDouble);
        System.out.println("随机数");
        System.out.println("11122121");
        System.out.println("master-modified");
        System.out.println("修改hot-fix");

    }
}
