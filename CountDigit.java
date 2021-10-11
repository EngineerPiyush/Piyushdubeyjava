class CountDigit{
    public static void main(String[] args) {
        long num; 
        num =234137681;
        int i = 0;
        while(num!=0){
            num = num/10;
            i++;
            if(num == 1){
                i++;
                break;
            }
        }
        System.out.println("Number of Digits: "+ i);
    }
}