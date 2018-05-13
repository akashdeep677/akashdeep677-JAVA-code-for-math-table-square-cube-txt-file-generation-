import java.io.*;
import java.util.*;
public class txtfile{
public static void main(String[] as) throws IOException {

FileOutputStream fos= new FileOutputStream("MathTable.txt");
PrintStream ps= new PrintStream(fos);
System.setOut(ps);
System.out.println("============================ Math Table 1 To 20 ================================");
System.out.println();
int x=1,y=10;
while (x<20){
for(int i=1;i<=10;i++){
for(int j=x;j<=y;j++){
System.out.print(j*i+"\t");
}//inner for
System.out.println();
}//outer for
System.out.println();
if(x==1){
System.out.println("================================================================================");
System.out.println();
}
x+=10;
y+=10;
}//while
System.out.println("============================ Square Power Table 1 To 30 ========================");
System.out.println();
x=1;
while (x<=10){
int c=1;
int a=0;
while(c<=3){
//System.out.print;
System.out.print(x+a+"^"+2+" = "+Math.pow(x+a,2));
if(c!=3)
System.out.print("\t"+"\t"+"\t");
a=10*c;
c++;
}
System.out.println();
x++;
}//while
System.out.println();
System.out.println("========================== Cube Power Table 1 To 20 ============================");
System.out.println();
x=1;
while (x<=10){
int c=1;
int a=0;
while(c<=2){
//System.out.print;
System.out.print(x+a+"^"+3+" = "+Math.pow(x+a,3));
if(c!=2)
System.out.print("\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t");
a=10*c;
c++;
}
System.out.println();
x++;
}//while
System.out.println();
System.out.println("NOTE : This file is created first in txt format by using JAVA System IO class");
System.out.println("       coding and then converted into pdf format.");
System.out.println("       Akash Deep 06-05-18");
System.out.println();
System.out.println("=================================== The End =====================================");


}//main
}//class
