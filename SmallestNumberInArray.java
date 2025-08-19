public class SmallestNumberInArray {
    int smallest(int arr[]){
        int small=arr[0];
        int size=arr.length;

        for(int i=1;i<size;i++){
            if(small>arr[i])
                small=arr[i];
        }
        return small;
    }
    public static void main(String [] args){
        int array[] = {2,5,9,7,15,4,19,3};

        SmallestNumberInArray s = new SmallestNumberInArray();
        int smallest = s.smallest(array);

        System.out.println("The Smallest number in the Array is : "+ smallest);
    }
}
