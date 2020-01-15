package practice;

public class A {
	  public static void main(String[] args) {
	        System.out.println(dayofyear(31,12,2020));
	    }
	    public static int dayofyear(int day, int month, int year){
	        int[] days = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
	        for (int i=0;i<month-1;i++){
	        	day += days[i];
	        }
	        return day;
	    }
}
