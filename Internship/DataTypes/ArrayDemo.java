import java.util.Arrays;//import this class to use the method toString() of class Arrays
class ArrayDemo{
    public static void main(String args[]){
       //int arr[5];// --> array expected wrong way to declare in int array
        int arr1[] = new int[5]; // correct way to declare an array
        System.out.println(arr1); //HAsh value 
        System.out.println(Arrays.toString(arr1));// method that is there in class Arrays --> default 

        int arr2[] = {10, 20, 30}; // correct way to declare an array
        System.out.println(arr2); 
        System.out.println(Arrays.toString(arr2));
    }
}

/*    o/p :  [I@2b2fa4f7
        I : Integer Array
        @ : Interger seperator
        2b2fa4f7 : Hashcode of the array object


*/