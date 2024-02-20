class PrivateConstructorExample
{
    private PrivateConstructorExample()
    {

    }
    public void show()
    {
        System.out.println("In PriavteConstructorExample class");
    }
    public static PrivateConstructorExample getInstance()
    {
        return new PrivateConstructorExample();
    }
}


public class Constructors {
    public static void main(String args[])
    {
        PrivateConstructorExample p = PrivateConstructorExample.getInstance();
        p.show();
        
    }

}
