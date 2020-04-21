class HappyNumber {
    public boolean isHappy(int n) {
         while(n != 1 && n != 7){
             int sum = 0;
            while(n > 0){
                int rem = n %10;
                n=n/10;
                sum += rem*rem;
            }
            if(sum >= 2 && sum <= 6 || sum== 8 ||sum == 9 || sum == 0){
                return false;
            }
            n = sum;
         }
        return true;
    }
}