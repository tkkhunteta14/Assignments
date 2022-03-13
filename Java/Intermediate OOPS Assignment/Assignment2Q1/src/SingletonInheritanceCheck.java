import java.util.*;
class SingletonInheritanceCheck
{
    public static void Check(Singleton a, Singleton b) 
    {
        if(Objects.equals(a, b))
           System.out.println("Singleton Inheritance Authenticated");
       else 
            System.out.println("It's is not a singleton class");
    }
}
class Singleton
{
    private static Singleton instance;
    public String str;
    private Singleton()
    {
        str = "It's Singleton Class";
    }
    public static Singleton getInstance()
    {
        if (instance == null)
          instance = new Singleton();
        return instance;
    }
    public static void main(String args[])
    {
        Singleton txt = Singleton.getInstance();
        Singleton txt2 = Singleton.getInstance();
        System.out.println(txt.str);
        System.out.println(txt2.str);
        SingletonInheritanceCheck.Check(txt,txt2);
    }
}