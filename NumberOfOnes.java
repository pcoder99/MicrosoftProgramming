public static int countOnes(int n){
  int num = 0;
  while(n > 0){
    n &= (n - 1);
    num++;
  }
}
