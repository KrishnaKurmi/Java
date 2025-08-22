public class LargestNumberInArray {
    int largest(int arr[]){
        int big=arr[0];
        int size=arr.length;

        for(int i=1;i<size;i++){
            if(big<arr[i])
                big=arr[i];
        }
        return big;
    }
    public static void main(String [] args){
        int array[] = {2,5,9,7,15,4,19,3};

        LargestNumberInArray l = new LargestNumberInArray();
        int largest = l.largest(array);

        System.out.println("The Largest number in the Array is : "+ largest);
    }
}
