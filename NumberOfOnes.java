public static int countOnes(int n){
  int num = 0;
  while(n > 0){
    n &= (n - 1);
    num++;
  }
}

public static int countOnes(int n){
  int num = 0;
  while(n > 0){
    num += n& 0x01;
    n >>= 1;
  }
  return num;
}
