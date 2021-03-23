import java.util.Scanner;

public class Xo {
   static Scanner in=new Scanner(System.in);
    int x=2,O=-2;
    static int[][] por= {{0,0,0},{0,0,0},{0,0,0}};
    static public void addpler(int a,char c){

    int i1=0,i2=0,var=0;
        if (a>0 && a<=9 && c=='x' || c=='o'){
            if (a==1){
                i1=0;
                i2=0;
            }
            if (a==2){
                i1=0;
                i2=1;
            }
            if (a==3){
                i1=0;
                i2=2;
            }
            if (a==4){
                i1=1;
                i2=0;
            }
            if (a==5){
                i1=1;
                i2=1;
            }
            if (a==6){
                i1=1;
                i2=2;
            }
            if (a==7){
                i1=2;
                i2=0;
            }
            if (a==8){
                i1=2;
                i2=1;
            }
            if (a==9){
                i1=2;
                i2=2;
            }
            if (c=='x'){
                var=2;
            }
            else if (c=='o'){
                var=-2;
            }
            if (por[i1][i2]!=2 && por[i1][i2]!=-2){
                por[i1][i2]=var;
            }
            else {
                System.out.println("الموقع محجوز");
            }

    }

        else
        {
            System.out.println(" يجب ان يكون الرقم بين 1---9  والاحرف x  او  o");
        }

        print();
        chek();
    }
    static public void print(){
        int w=0;
        String v="" ;
        for (int i = 0; i < por.length; i++) {
            for (int j = 0; j < por.length; j++) {
                w++;
                if (por[i][j]==2)
                    v = "x";
                else if (por[i][j]==-2)
                    v = "o";
                else if (por[i][j]==0)
                    v =Integer.toString(w);
                System.out.print(" "+ v);
            }
            System.out.println();
        }
        System.out.println("\n");
    }
    static public void chek(){
        int[] row=new int[8];
        for (int i = 0; i < por.length; i++) {
            row[0]=row[0]+por[0][i];
            row[1]=row[1]+por[1][i];
            row[2]=row[2]+por[2][i];
            row[3]=row[3]+por[i][0];
            row[4]=row[4]+por[i][1];
            row[5]=row[5]+por[i][2];
            row[6]=row[6]+por[i][i];
            row[7]=row[7]+por[i][2-i];
        }
        char xo = 0;
        for (int i = 0; i < row.length; i++) {
        if (row[i]==6 || row[i]==-6){
            if (row[i]==6){
                xo='X';
            }
            else if(row[i]==-6) xo='O';
            System.out.println("لقد ربح"+" *****  "+xo+"  ******");break;
        }
    }

    }
    public static void main(String[] args) {
     addpler(1,'o');
        addpler(2,'x');
        addpler(3,'o');
     addpler(4,'x');
        addpler(5,'x');
        addpler(6,'x');



    }
    }