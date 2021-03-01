class Calculator
{

public static void main(String args[])
{
int x=Integer.parseInt(args[0]);
String oper=args[1];
int y=Integer.parseInt(args[2]);
int result;
if(args.length!=3)
{

System.out.println("Wrong type of input given.");

}
else
{

if(oper.equals("+"))
{
result=x+y;
System.out.println("	= "+result);
}
else if(oper.equals("-"))
{
result=x-y;
System.out.println("	= "+result);
}
else if(oper.equals("*"))
{
result=x*y;
System.out.println("	= "+result);
}
else if(oper.equals("/"))
{
result=x/y;
System.out.println("	= "+result);
}
else
System.out.println("Wrong type of input given.");

}
}
}