//By changing no.of args and changing datatype of args.
class Adder
{
  static int add(int a, int b)
{
  return a+b;
}

static float add(float a, float b )
{
  return a+b;
}


static double add(double a, double b )
{
  return a+b;
}
static int add(int a, int b, int c)
{
  return a+b+c;
}

public static void main(String args[])
{
 System.out.println(Adder.add(2,5));
 System.out.println(Adder.add(5,7,9));
 System.out.println(Adder.add(7.4f,8.4f));
 System.out.println(Adder.add(12.4,870.3));
}
}