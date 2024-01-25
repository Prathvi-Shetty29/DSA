import java.util.Scanner;

public class AvgTemp {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("enter the no of days:");
        int days= in.nextInt();
        int[] data=new int[days];
        int sum=0;
        for (int i = 0; i < days; i++) {
            System.out.print("enter day "+i+1+"'s temp:");
            data[i]=in.nextInt();
            sum+=data[i];
        }
        double avg=sum/days;
        System.out.println("the avg temp is:"+avg);
        int above=0;
        for (int i=0;i < data.length;i++){
            if(data[i]>avg){
                above++;
            }
        }
        System.out.print("no of days above avg:"+above);
    }
}
