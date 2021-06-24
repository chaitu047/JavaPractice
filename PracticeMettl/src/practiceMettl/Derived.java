package practiceMettl;

class Base
{
    private int data;
  
    public Base()
    {
        data = 5;
    }
  
    private int getData()
    {
        return this.data;
    }
}
  
class Derived extends Base
{
    private int data;
    public Derived()
    {
        data = 6;
    }
    private int getData()
    {
        return data;
    }
  
    public static void main(String[] args)
    {
        Derived myData = new Derived();
        System.out.println(myData.getData());
    }
}