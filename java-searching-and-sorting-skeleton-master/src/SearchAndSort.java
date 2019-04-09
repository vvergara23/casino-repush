//Veronica Vergara

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Scanner;
public class SearchAndSort {
	
	static ArrayList<String> listString;
	static ArrayList<String> listInt;
	static String[] arrayString;
	static int[] arrayInt;
	public static int type;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What algorithm would you like to execute?\nOPTIONS:\nbubble\nselection\ninsertion\nmerge\nlinear\nbinary\nquit");
		String algorithm = in.nextLine(); //bubble, selection, insertion, merge, linear, binary, quit
		System.out.println("\nWhat type of data?\nOPTIONS:\ninteger\nstrings");
		String type = in.nextLine(); //integer, strings
		System.out.println("\nHow is it stored?\nOPTIONS:\narray\nlist");
		String store = in.nextLine(); //array, list
		System.out.println("\nEnter the data:\nNOTE: Please seperate each item with ','");
		String input = in.nextLine(); //data seperated by commas
		
		
		String[] inputsplit = input.split(",");
		
		if(algorithm == "bubblesort") {
			if(type == "integer") {
				int[] finaldata = new int[inputsplit.length];
				for(int i = 0; i < inputsplit.length; i++) {
					int usedata = Integer.parseInt(inputsplit[i]);
					finaldata[i] = usedata;
				}
				bubbleSortInteger(finaldata);
			}
			if (type == "String") {
				bubbleSortString(inputsplit);
			}
		}if(algorithm == "Selectionsort") {
			if(type == "integer") {
				int[] finaldata = new int[inputsplit.length];
				for(int i = 0; i < inputsplit.length; i++) {
					int usedata = Integer.parseInt(inputsplit[i]);
					finaldata[i] = usedata;
				}
				selectionSortInteger(finaldata);
			}
			if (type == "String") {
				selectionSortString(inputsplit);
			}
		}if(algorithm == "insertionSort") {
			if(type == "integer") {
				int[] finaldata = new int[inputsplit.length];
				for(int i = 0; i < inputsplit.length; i++) {
					int usedata = Integer.parseInt(inputsplit[i]);
					finaldata[i] = usedata;
				}
				insertionSortInteger(finaldata);
			}
			if (type == "String") {
				insertionSortString(inputsplit);
			}
		}if(algorithm == "mergeSort") {
			if(type == "integer") {
				int[] finaldata = new int[inputsplit.length];
				for(int i = 0; i < inputsplit.length; i++) {
					int usedata = Integer.parseInt(inputsplit[i]);
					finaldata[i] = usedata;
				}
				mergeSortInteger(finaldata, finaldata.length, finaldata.length/2, finaldata.length/2);
			}
			if (type == "String") {
				mergeSortString(inputsplit);
			}
		}	
	}
	 static void bubbleSortString(String x[]) {
		 
		 for (int i = 0; i < x.length-1; i++)
	        {
	           for (int j = 0; j<x.length -1; j++)
	           {
	               if(x[j+1].compareTo(x[1+1])>0)
	               {
	                   String temp = x[j];
	                   x[j] = x[j+1];
	                   x[j+1] = temp;
	                }
	            }

	        }
		 System.out.println(Arrays.toString(x));
	 }
	 static void bubbleSortInteger(int x[]) { 
	        for (int i = 0; i < x.length-1; i++) 
	            for (int j = 0; j < x.length-i-1; j++) 
	                if (x[j] > x[j+1]) 
	                { 
	                    int temp = x[j]; 
	                    x[j] = x[j+1]; 
	                    x[j+1] = temp; 
	                }
	        System.out.println(Arrays.toString(x));
	    }
	 static void selectionSortInteger(int x[]) { 
	        for (int i = 0; i < x.length-1; i++) 
	        { 
	            int min = i; 
	            for (int j = i+1; j < x.length; j++) 
	                if (x[j] < x[min]) 
	                    min = j; 
	            int temp = x[min]; 
	            x[min] = x[i]; 
	            x[i] = temp; 
	        }
	        System.out.println(Arrays.toString(x));
	    }
	 static void selectionSortString (String arr[]) {
		 for ( int j=0; j < arr.length-1; j++ )
		    {
		      int min = j;
		      for ( int k=j+1; k < arr.length; k++ )
		        if ( arr[k].compareTo( arr[min] ) < 0 ) min = k;  

		      String temp = arr[j];
		      arr[j] = arr[min];
		      arr[min] = temp;
		    }
		 System.out.println(Arrays.toString(arr));
	 }
	 static void insertionSortInteger(int arr[]) { 
	        for (int i=1; i<arr.length; ++i) 
	        { 
	            int key = arr[i]; 
	            int j = i-1; 
	            while (j>=0 && arr[j] > key) 
	            { 
	                arr[j+1] = arr[j]; 
	                j = j-1; 
	            } 
	            arr[j+1] = key; 
	        }
	        System.out.println(Arrays.toString(arr));
	    }
	 static void insertionSortString(String x[]) {
		  for (int j = 1; j < x.length; j++) {
			    String key = x[j];
			    int i = j - 1;
			    while (i >= 0) {
			      if (key.compareTo(x[i]) > 0) {
			        break;
			      }
			      x[i + 1] = x[i];
			      i--;
			    }
			    x[i + 1] = key;
			    System.out.println(Arrays.toString(x));
			  }
	 }
	 public static int linSearch(int x[], int y) { 
	     for(int i = 0; i < x.length; i++) 
	     { 
	         if(x[i] == y) 
	             return i; 
	     } 
	     return -1; 
	 }
	 static int binarySearch(int x[], int a, int b, int z) { 
	        if (b >= a) { 
	            int mid = a + (b - a) / 2; 
	            if (x[mid] == z) 
	                return mid; 

	            if (x[mid] > z) 
	                return binarySearch(x, a, mid - 1, z); 
	  
	            return binarySearch(x, mid + 1, b, z); 
	        } 
	        return -1; 
	    } 
	 static void mergeSortInteger(int x[], int l, int m, int r) { 
	        int a = m - l + 1; 
	        int b = r - m; 
	        int L[] = new int [a]; 
	        int R[] = new int [b]; 	  
	        for (int i=0; i<a; ++i) 
	            L[i] = x[l + i]; 
	        for (int j=0; j<b; ++j) 
	            R[j] = x[m + 1+ j]; 
	        int i = 0, j = 0; 
	        int k = l; 
	        while (i < a && j < b) 
	        { 
	            if (L[i] <= R[j]){ 
	                x[k] = L[i]; 
	                i++; 
	            } 
	            else{ 
	                x[k] = R[j]; 
	                j++; 
	            } 
	            k++; 
	        } 
	        while (i < a) { 
	            x[k] = L[i]; 
	            i++; 
	            k++; 
	        } 
	        while (j < b) { 
	            x[k] = R[j]; 
	            j++; 
	            k++; 
	        } 
	    }
	 public static void mergeSortString(String[] x) {
	        if (x.length >= 2) {
	            String[] y = new String[x.length / 2]; //left
	            String[] z = new String[x.length - x.length / 2]; //right

	            for (int i = 0; i < y.length; i++) {
	                y[i] = x[i];
	            }

	            for (int i = 0; i < z.length; i++) {
	                z[i] = x[i + x.length / 2];
	            }

	            mergeSortString(y);
	            mergeSortString(z);
	            merge(x, y, z);
	            System.out.println(Arrays.toString(x));
	        }
	    }
	 public static void merge(String[] x, String[] y, String[] z) {
	        int a = 0, b = 0;
	        for (int i = 0; i < x.length; i++) {
	            if (b >= z.length || (a < y.length && y[a].compareToIgnoreCase(z[b]) < 0)) {
	                x[i] = y[a];
	                a++;
	            } else {
	                x[i] = z[b];
	                b++;
	            }
	        }
	    }
}