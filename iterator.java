/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStruct;

import java.util.*;
import java.lang.*;

/**
 *
 * @author Shiv
 */
public class iterator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);list.add(4);list.add(44);list.add(56);list.add(23);
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            for(int i = 0;i<list.size();i++){
                System.out.println(it.next());
            }
        }
    }
}
