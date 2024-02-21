import java.util.*;
class binarysearch{
    public static void main(){
        Scanner sc=new Scanner(System.in);
        int ar[]={1982,1987,1993,1996,1999,2003,2006,2007,2009,2010};
        int num, start=0,last=ar.length-1,pos=-1;
        //First Intialize the variable
        System.out.println("Enter the number=");
        num=sc.nextInt();
        int mid;
        while(start<=last){
           mid= (start+last)/2;
        if(ar[mid]==num){
        pos=mid;
        break;
    
        }
        // to first indexes 
        else if(ar[mid]<num){
        start=mid-1;
        break;
        
        }
        // if element is at higher shift them to higher 
        else {
        last=mid+1;
        break;
        }
       
}
 if(pos==-1){
        System.out.println("Record   not Exists");
    }
        else{
        System.out.println("Record  exist");
    
}

}
}
