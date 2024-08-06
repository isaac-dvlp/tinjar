/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.francitoshi.tinjar;

/**
 *
 * @author isaac_dugo
 */
public class Matrix
{
    public static class DimensionException extends RuntimeException{
        
    }
    public static void add(int[][] dst, int[][]... src) throws DimensionException
    {
        for (int i = 0; i < src.length; i++)
        {
            if(dst.length!=src[i].length)
            {
                throw new DimensionException();
            }
            for (int j = 0; j < src[i].length; j++)
            {
                if(dst[j].length!=src[i][j].length)
                {
                    throw new DimensionException();
                }
                for (int k = 0; k < src[i][j].length; k++)
                {
                    dst[j][k]+= src[i][j][k];
                }
            }
        }
    }
    public static void add(long[][] dst, long[][]... src) throws DimensionException
    {
        for (int i = 0; i < src.length; i++)
        {
            if(dst.length!=src[i].length)
            {
                throw new DimensionException();
            }
            for (int j = 0; j < src[i].length; j++)
            {
                if(dst[j].length!=src[i][j].length)
                {
                    throw new DimensionException();
                }
                for (int k = 0; k < src[i][j].length; k++)
                {
                    dst[j][k]+= src[i][j][k];
                }
            }
        }
    }
}
