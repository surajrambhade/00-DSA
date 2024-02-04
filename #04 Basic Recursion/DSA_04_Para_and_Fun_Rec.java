

public class DSA_04_Para_and_Fun_Rec {

  public static int para(int num,int sum){
    sum = 0;
    if (num<1) {
      System.out.print(num);
      return num;
    }
    return para(num-1,sum+num);
  }
  public static void main(String[] args) {
    int n=4;  
    System.out.println(para(n,0) + " ");
  }
}
