class Main
{
int i;

private Main()
{
i = 10;
System.out.println("constructor is called");
}

public static void main(String[] args)
{

Main obj = new Main();
System.out.println("value of i: " + obj.i);
}
}
