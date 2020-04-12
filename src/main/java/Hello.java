import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author DLL
 * @date 2020/4/11 - 20:36
 */
public class Hello {

    public static final int num1 = 10;


    public static void main(String[] args) {
        System.out.println("Hello,World!");
        Date date = new Date();
        ArrayList list = new ArrayList();
        list.add(0,123);
        
        int num1 = 10;
        int num2 = 20;
        System.out.println("num2 = " + num2);
        System.out.println(num1);

        String[] arr = new String[]{"Tom","Jerry","HanLeiLei","LiLei"};

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr="+arr[i]);
        }

        for (String s : arr) {
            System.out.println(s);
        }

        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            System.out.println(arg);
            
        }

        for (Object o : list) {
            
        }

        for (int i = 0; i < list.size(); i++) {
            
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            
        }

    }

    public static void method1(){
        try {
            FileInputStream fis = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }



}
