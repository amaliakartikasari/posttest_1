/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.posttest1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author ASUS
 */
public class Posttest1 {

    public static void main(String[] args) {
        for (int i = 0; i <1; i++){
            ArrayList<film> films = new ArrayList<>();

            films.add(new film("air mata di ujung sajadah", 2023));
            films.add(new film("the nun", 2018));
            films.add(new film("petualangan sherina 2", 2023));
            films.add(new film("catatan si boy", 1987));
            films.add(new film("sleepcall", 2023));
            
            for (film filem : films){
                System.out.println("Film trending hari ini : " + filem.judul + ", tahun : " + filem.tahun + ".");
            }

        }
    }
}
    

