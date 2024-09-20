package Search;



public class BinarySearch {
    public static void main(String[] args) {
        int num[] = {4,5,6,7,8,9,11};
        int target = 9;

        int result = binarySearch(num,target,0,num.length-1);

        if (result!= -1)
            System.out.println("Element found at index : "+result);
        else
            System.out.println("Element not found");
    }


    public static int binarySearch(int[] num, int target,int left,int right) {
//        int left = 0;
//        int right = num.length - 1;
//
//        while(left <= right ) {
//            int mid = (left + right) / 2;
//
//            if (num[mid] == target) {
//              return mid;
//            } else if (num[mid] < target) {
//                left = mid + 1;
//            }else{
//                right = mid - 1;
//            }
//        }
//        return -1;

        if (left <= right ) {
          int mid = (left+right)/2;
            if (num[mid] == target) {
              return mid;
            } else if (num[mid] < target) {
                return  binarySearch(num,target,mid+1,right);
            }else{
                return  binarySearch(num,target,left,mid-1);
            }
        }
        return -1;
        }
    }


    

