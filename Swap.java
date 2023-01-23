
public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int fno=100;
int sno=200;
int tno=300;
System.out.println("Before Swapping : ");
System.out.println("Fno: "+fno +"\t"+"Sno: "+ sno +"\t"+"tno: "+tno);
//Swapping
int temp=0;

temp= fno;
fno=sno;
sno=tno;
tno=temp;
System.out.println("After Swap:");
System.out.println("Fno: "+fno+"\t"+"Sno: "+sno+"\t"+"tno: "+tno);
	}

}
