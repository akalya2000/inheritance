interface showable
{
void show();
}
class A implements showable
{
public void show()
{
System.out.println("message1");
}
void display()
{
System.out.println("message2");
}
}
class multiple
{
public static void main(String args[])
{
A ob=new A();
ob.show();
ob.display();
}
}