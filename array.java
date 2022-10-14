import java.net.SocketPermission;

public class array {
 public static void main(String[] args) {
  
int[] rifat = new int [6];

int[] rifat1={10,20,30,50,60};

System.out.println(rifat1.length);
int sum=0;
for (int i=0;i<rifat1.length;i++){
sum+=rifat1[i]; 
}
System.out.println(sum);

/*rifat[0]=10;
rifat[1]=20;
rifat[2]=30;
rifat[3]=40;
rifat[4]=50;
rifat[5]=60;
/*System.out.println(rifat[5]);*/
/*int len =rifat.length;
System.out.println(len);*/
/*int sum=rifat[0]+rifat[1]+rifat[2]+rifat[3];
System.out.println(sum);*/

 }
}
