import java.util.*;
class Main{
  public static void main(String[]args){
  Scanner kbd= new Scanner(System.in);
  double c,area;
  c=kbd.nextDouble();
  if(0<c && c<=100){
    int l;
    l=kbd.nextInt();
    if(0<l && c<=100){
      area=0;
      for(int i=1;i<=l;i++){
        double W,L;
        W=kbd.nextDouble();
        L=kbd.nextDouble();
        area=area+W*L;

      }
      System.out.print(area*c);
    }
  }


  }
}