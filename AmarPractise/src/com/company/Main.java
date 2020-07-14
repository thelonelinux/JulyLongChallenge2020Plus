package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws java.lang.Exception{
        // write your code here
        try{
            Scanner sc=new Scanner(System.in);
            int t=1;
            while (t-->0){
                int len=sc.nextInt();
                int[] arr=new int[len];
                for (int i=0;i<arr.length;i++){
                    arr[i]=sc.nextInt();
                }
                String str=sc.next();
                int[] bit=new int[len-1];
                char[] bits=str.toCharArray();


                int count0=0;
                int count1=0;
                for (int i=0;i<arr.length-1;i++){
                    bit[i]=(int)bits[i]-48;
                    if (bit[i]==0){
                        count0++;
                    }else{
                        count1++;
                    }
                }
                int[] sorted= Arrays.stream(arr).sorted().toArray();

                if (Arrays.equals(sorted,arr)){
                    System.out.println("Yes");
                }
                else if (count0>=1 && count1>=1){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }

            }

        }catch (Exception e){
            return;
        }

    }
}