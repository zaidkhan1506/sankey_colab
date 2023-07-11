import java.util.*;
public class cal{
public static void main (String args[]){
Scanner s = new Scanner(System.in);
int b=s.nextInt();
int c = s.nextInt();

  Nikhil n = new Nikhil();
  System.out.println(n.add(b,c));
  Abhay ab = new Abhay();

  System.out.println(ab.subtract(b,c));
Shree  m = new Shree(); 

  System.out.println(m.multiply(b,c));
  Jigar j = new Jigar();
  j.oddEven(b);
    j.oddEven(c);


Nihar h =new Nihar();

  System.out.println(h.div(b,c));
}
}


