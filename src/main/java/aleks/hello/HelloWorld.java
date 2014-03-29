package aleks.hello;

/**
 * Created by Alex on 21.03.14.
 */
public class HelloWorld{

    public void print(String s)throws WrongString {
        if(s!= null)
            System.out.println(s);
        else
            throw new WrongString();
    }
    public static void main(String[] arg)  {
        HelloWorld hw = new HelloWorld();
        try {
            hw.print("");
        } catch (WrongString wr) {
            System.out.println("Empty string!\n"+wr.getMessage());
        }
        System.out.println("Hello Aleks!");
    }
}
