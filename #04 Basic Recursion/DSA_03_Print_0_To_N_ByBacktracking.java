class DSA_03_Print_1_To_N_ByBacktracking {
  static int cnt = 0;
  static void print(){
      
       // Base Condition.
       if(cnt == 3 ) return;
       System.out.print(cnt+ " ");
        
       // Count incremented.
       cnt = cnt+1;
       print();

  }
  public static void main(String[] args) {
      print();
  }
}