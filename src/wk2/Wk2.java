/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wk2;

/**
 *
 * @author ruvon
 */
public class Wk2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int [] studentMarks = new int[5];
char [] sname= new char[5];
studentMarks[0]=98;
studentMarks[1]=98;
studentMarks[2]=98;
studentMarks[3]=98;
studentMarks[4]=98;

for(int i =0; i<studentMarks.length;i++){
System.out.print(studentMarks[i]);
}

sname[0]='r';
sname[1]='o';
sname[2]='n';
sname[3]='a';
sname[4]='k';
for(int i =0; i<sname.length;i++){
System.out.println(sname[i]);
}
System.out.println("printing name in reverse order");

for( int j =(sname.length-1); j>=0;j--){
System.out.println(sname[j]);
}
}
    
}
