package testapp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TestApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
     
        ArrayList<Integer> akib = new ArrayList<Integer>();
        //vector<int> akib;                           max^size
        
        akib.add(6); //akib.push_back(6);
        akib.add(4); //akib.push_back(4);
        akib.add(8); //akib.push_back(8);
        akib.add(1); //akib.push_back(1);
        akib.add(2); //akib.push_back(2);
        akib.add(9); //akib.push_back(9);
        akib.add(12); //akib.push_back(12);
        akib.add(3); //akib.push_back(3);
        akib.add(11); //akib.push_back(11);
        System.out.println(akib); //printing the carrent ArrayList
        
        //index wise removing
        akib.remove(akib.size()-1); //akib.pop_back();
        System.out.println(akib); //printing the carrent ArrayList
        
        //print the 2nd index of list
        System.out.println(akib.get(2)); //cout << akib[2] << endl;
        
        //sort complexity = O(nlog(n))
        Collections.sort(akib); //sort(akib.begin(), akib.end());
        System.out.println("\nAscending order\n" + akib); //printing
        
        Collections.sort(akib, Collections.reverseOrder()); //descending order sort
        System.out.println("Descending order\n" + akib); //printing
    }
    
}

