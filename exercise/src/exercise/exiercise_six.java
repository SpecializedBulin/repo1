package exercise;

public class exiercise_six {
	public static void main(String[] args) {
		int a[] = new int[20];
		int i;
		for(i=0;i<20;i++) {
			a[i]=(int)(Math.random()*382)+77;
		}
		int temp,j;
		for(i=0;i<19;i++) {
			for(j=0;j<19-i;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		int max,min,aver,sum=0;
		max=a[19];
		min=a[0];
		for(i=0;i<20;i++) {
			sum=sum+a[i];
		}
		aver=sum/20;
		System.out.println(max+"\n"+min+"\n"+aver+"\n"+sum+"\n");
	}
}

