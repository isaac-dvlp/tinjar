/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.francitoshi.tinjar;
import java.math.BigDecimal;
import java.math.BigInteger;
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
    public static void add(float[][] dst, float[][]... src) throws DimensionException
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
    public static void add(double[][] dst, double[][]... src) throws DimensionException
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
    
    public static BigInteger[][] create(int x, int y, BigInteger value)
    {
        BigInteger[][] m = new BigInteger[x][y];
        for (int i=0; i<m.length;i++){
            for(int j=0; j<m[i].length;j++){
                m[i][j]=value;
            }
        }
        return m;
    }
    public static BigDecimal[][] create(int x, int y, BigDecimal value)
    {
        BigDecimal[][] m = new BigDecimal[x][y];
        for (int i=0; i<m.length;i++){
            for(int j=0; j<m[i].length;j++){
                m[i][j]=value;
            }
        }
        return m;
    }
    
    public static void add(BigInteger[][] dst, BigInteger[][]... src) throws DimensionException
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
                    
                    dst[j][k]= dst[j][k].add(src[i][j][k]);
                }
            }
        }
    }
    public static void add(BigDecimal[][] dst, BigDecimal[][]... src) throws DimensionException
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
                    
                    dst[j][k]= dst[j][k].add(src[i][j][k]);
                }
            }
        }
    }
    public static int[][] traspose(int[][] a){
        if(a.length==0){
            return a;
        }
        int r = a.length;
        int c = a[0].length;
        int[][] at= new int[c][r];
        for(int i=0; i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                at[j][i]=a[i][j];
            }
        }
        return at;
    }
    public static int[][] multiply(int[][] a, int[][] b) throws DimensionException
    {
        int ra= a.length;
        int ca= a[0].length;
        int rb= b.length;
        int cb= b[0].length;
        int[][] c = new int[ra][cb];
        if(ca!=rb){
            throw new DimensionException(); 
        }
        for(int row=0;row<ra;row++)
        {
            for(int col=0;col<cb;col++)
            {
                int acum=0;
                for(int k=0;k<ca;k++)
                {
                    acum+=a[row][k]*b[k][col];
                }
                c[row][col]=acum;
            }
        }
        return c;
    }
}
