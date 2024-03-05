public class Frequency {
    public static void main(String[] args) {
        
        int arr[] = {10,20,10,20,30,10,10,30,20};
        int n = arr.length;
        int freq[] = new int[n];
      
        int visited = -1;

        for(int i = 0;i<arr.length;i++){
            int count = 1;
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                    freq[j] = visited;
                }
            }
            if(freq[i] != visited){
                freq[i] = count;
            }
        }

        for(int i = 0;i<freq.length;i++){
           if(freq[i] != visited){
              System.out.println(arr[i]+" : "+freq[i]+" ");
           }
        }
    
    }
}
