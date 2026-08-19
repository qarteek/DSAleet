class Solution {
    public boolean lemonadeChange(int[] bills) {
        boolean bool =  false;
        int count5 = 0;
        int count10 = 0;
        int count20 = 0;
        

        for(int i = 0 ;  i < bills.length ; i++){
            if(bills[i]==5){
                count5++;
                bool = true;
                continue;
            }
            else if(bills[i]==10){
                if(count5>0){
                    count5--;
                    count10++;
                }
                else {
                    bool =false;
                    break;
                }

            }
            else{
                if(count5>2 && count10==0){
                    count5-=3;
                    bool = true;


                }
                else if(count5>0 && count10>0){
                    count5--;
                    count10--;
                    bool = true;
                }

                
                else {
                    bool=false;
                    break;
                }
            }
        }
        return bool;
        
    }
}