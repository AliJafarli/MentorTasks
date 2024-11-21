public class Result {
    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int length =arr.size();
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for(Integer l:arr){
            if(l>0){
                count1++;

            }else if(l<0){
                count2++;
            }else if(l==0){
                count3++;
            }
        }
        double result1 =(double) count1/length;
        double result2 =(double) count2/length;
        double result3 =(double) count3/length;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
