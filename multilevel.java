class A
{
void first()
{
System.out.println("parent class ");
}
}
class B extends A
{
void second()
{
System.out.println("child class1");
}
}
class C extends B
{
void third()
{
System.out.println("child class2");
}
}
class multilevel
{
public static void main(String args[])
{
B ob=new C();
ob.first();
ob.second();
//ob.third();
}
}