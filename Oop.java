import java.util.Scanner; 
import java.util.Arrays; 
import java.util.ArrayList;
import java.util.Collections;
/**
 * Oop
 */
class Student{
    int age;
    String name;
    int marks; 
    public void giveValues(){
         age = 15; 
         name = "Mouna";
         marks = 98;
        
    }
    public void changeAge(int valu){ 
        age = valu; 
        System.out.println(age);

    }
    public void printS(){ 
        System.out.println(age );
        System.out.println(name );
        System.out.println(marks); 

    } 


}
class Oop {


private static final int i = 0;

public static void main(String args[]){ 
    // Student stu=new Student(); 
    // Rooments rm = new Rooments();
    // rm.giveValues();
    // rm.printS();
    // rm.changeAge(32);
    // rm.printS();
    // stu.giveValues();
    // stu.printS(); 
    // Student st = new Student();
    // st.changeAge(34);
    Scanner sc = new Scanner(System.in); 
    // System.out.println("Enter the no of elements in a array:");
    // int m = sc.nextInt();
    // int arr[] = new int[m]; 
    // System.out.println("Enter the Elements of the array:");
    // for(int i=0;i<m;i++){ 
    //     arr[i]=sc.nextInt();
    // } 
    // System.out.println("The list of the elements:");
    // for(int i = 0; i<m;i++){
    //     System.out.println(arr[i]);
    // }   

    // System.out.println("The max value is :");
    // int max = Integer.MIN_VALUE;
    // for(int i =0; i< arr.length;i++){ 
    //     if(arr[i]> max){
    //         max = arr[i];
    //     }

    // }   
    // System.out.println(max);

    // System.out.println("The Min value is :");
    // int min = Integer.MAX_VALUE;
    // for(int i = 0; i < arr.length;i++){
    //     if(arr[i]<min){
    //         min = arr[i];
    //     }
    // }
    // System.out.println(min); 

    // System.out.println("Reverse the array :");
    // for(int i = arr.length -1; i>=0;i--){
    //     System.out.println(arr[i]);
    // } 
    



    // //subarrays
   
    // Arrays.sort(arr);
    // System.out.println("After soring :" + Arrays.toString(arr)); 
    // Arrays.sort(arr);  
    // System.out.println("Enter the row size :");
    // int row = sc.nextInt();
    // System.out.println("Enter the col size :");
    // int col = sc.nextInt();
    // int[][] arre = new int[row][col]; 
    // for(int i = 0; i<row;i++){
    //     for(int j = 0 ;j<col;j++){
    //         System.out.println("Elements [" + i + "][" + j +"]: ");
    //         arre[i][j] = sc.nextInt();
    //     } 

    // }System.out.println("The 2D array is : ");
    // for(int i = 0 ; i<row;i++){
    //     for(int j = 0;j<col;j++){
    //         System.err.print(arre[i][j]+" ");
    //     }
    //     System.out.println();
    // }   
    // for(int i = 0; i<arre.length;i++){
    //     for(int j = 0;j<i;j++){
    //         int temp = arre[i][j];
    //         arre[i][j] = arre[j][i];
    //         arre[j][i] = temp;
    //     }
    // } 
    // System.out.println("Transpose"); 
    // for(int i = 0;i<arre.length;i++){
    //     for(int j = 0;j<arre[0].length;j++){
    //         System.out.print(arre[i][j]+" ");
    //     } 
    //     System.err.println();
    // }   
    
    // System.out.println("Rotate the array");
    // for(int i =0; i<arre.length;i++){
    //     for(int j = 0;j<arre.length/2;j++){
    //         int temp = arre[i][j];
    //         arre[i][j] = arre[i][arre.length-1-j];
    //         arre[i][arre.length-1-j]=temp;
    //     }
    // } 
    // for(int i = 0;i<arre.length;i++){
    //     for(int j = 0;j<arre.length;j++){
    //         System.out.print(arre[i][j]+" ");
    //     } 
    //     System.out.println();
    // }    
    // System.out.println("Enter the size of arraylist");
    // int n = sc.nextInt();
    // ArrayList<Integer> numbers = new ArrayList<>(); 

    // for(int i = 0;i<n;i++ ){ 
    //     System.out.println("Enter the "+i+" element in a arraylist");
    //    numbers.add(sc.nextInt());
    // }
    // for(int i =0;i<n;i++){
    // System.out.print(numbers);
    // System.out.println(); 
    // System.out.println("remove  even numbers :");
    // for(int i = numbers.size()-1;i>=0;i--){
    //     if(numbers.get(i)%2==0){
    //         numbers.remove(i);
    //     }     
    // }
    // System.out.print(numbers);
    // remove primenumbers
    // int c = 0;
    // for(int i = 0;i<numbers.size();i++){
    //    if(i%2==0 && i%3==0){
    //     //c++; 
    //     numbers.remove(i);
    //    }

    //    else{
    //     System.out.println(" ");
    //    }
    //    numbers.remove(i);
    // }System.out.println(numbers); 

    // String str = sc.nextLine();
    // System.out.println("The string is : "+str);
    // for(int i =0;i<str.length();i++){
    //    char ch = str.charAt(i);
    //    if(ch=='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
    //     continue;
    //    } 
    //    System.out.print(ch+" ");
    // }  
    
    
    // char[] chs = str.toCharArray();
    // for(int i = 0;i<str.length();i++){ 
    //    while(chs[i]!= 'a' && chs[i]!='e'&& chs[i]!='i'&& chs[i]!='o'&& chs[i]!='u')
    //    for(int j = str.length()-1;j>=0;j--){
    //    while (chs[j]!= 'a' && chs[j]!='e'&& chs[j]!='i'&& chs[j]!='o'&& chs[j]!='u')
        
    //     if(i>=j){
    //         break;
    //     }
        
    //     char ch = chs[i];
    //     chs[i] = chs[j];
    //     chs[j] = ch;
    // } 
       
    
    // }System.out.println(chs); 
    // System.out.println("Enter the size of array: ");
    // int n = sc.nextInt();
    // ArrayList<Integer> list = new ArrayList<>();
    // for(int i =0; i<n;i++){
    //     System.out.println("Enetr the Elemnetys in array:b ");
    //     list.add(sc.nextInt());
    // }
    // System.out.println(list);

    // for(int i=0;i<list.size()-1;i++){
    //     int minindex = i;
    //     for(int j = i+1;j<list.size();j++){
    //         if(list.get(j)<list.get(minindex)){
    //             minindex=j;
    //         }
    //     }
    //     if(minindex != i){ 
    //     int temp = list.get(i);
    //     list.set(i, list.get(minindex));
    //     list.set(minindex, temp);
    //     }
        
    // }  
    // System.out.println(list); 
    // System.out.println("Enter the size of array");
    // int m = sc.nextInt();
    // int[] arr= new int[m];
    // System.out.println("Enter the Elements :");
    // for(int i = 0;i<m;i++){ 
        
    //     arr[i]=sc.nextInt();
    // }for(int i =0;i<m;i++){
    //     System.out.print(arr[i]+" ");
    // }  
    // System.out.println();
    // for(int i =0; i<arr.length;i++){
    //     for(int j=0;j<arr.length-1;j++){
    //         if(arr[j]>arr[j+1]){
    //             int temp=arr[j];
    //             arr[j]=arr[j+1];
    //             arr[j+1]=temp;
    //         }
    //     }
    // }
    // for(int val:arr){
    //     System.out.print(val+" ");
    // }
    // for(int i=0;i<arr.length-1;i++){
    //     int minv = arr[i];
    //     int minindex = i;
    //     for(int j = i+1;j<arr.length;j++){
    //         if(arr[j]<minindex){
    //             minv=arr[j];
    //             minindex=j;
    //         }
            
    //     }if(minindex != i){
    //         int temp=arr[i];
    //         arr[i]=arr[minindex];
    //         arr[minindex]=temp;

       
    //     } 
       
    //     }
    //  for(int val:arr){
    //     System.out.print(val);} 
    System.err.println("Enter the size of array: ");
    int m = sc.nextInt();
    sc.nextLine();
    ArrayList<String> arre = new ArrayList<>(); 
    for(int i=0;i<m;i++){
        
        arre.add(sc.nextLine());
    } 
    for(int i =0;i<arre.size();i++){
        System.out.print(arre.get(i)+" ");
    } 
    System.err.println();
    Collections.sort(arre);
    System.out.println(arre);

 
 
     }
}
