class A
{
int a=10;
void msg()
{
System.out.println("message");
}
}
/*
*       parent class
*/
class B extends A
{
void info()
{
System.out.println("Information="+a);
}
}
class Single
{
public static void main(String args[])
{
A ob=new B();
ob.msg();
//ob.info();
}
}