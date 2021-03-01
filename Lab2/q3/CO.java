class CO
{

int a;
void seta(int a)
{
System.out.println("Value setted");
this.a=a;
}
int geta()
{
System.out.println("Value Returned");
return this.a;
}
public static void main(String args[])
{
CO obj=new CO();
obj.seta(10);
System.out.println(obj.geta());
}

}
