/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package io.francitoshi.tinjar;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.math.BigInteger;
import java.math.BigDecimal;


/**
 *
 * @author isaac_dugo
 */
public class MatrixTest
{
    
    @Test
    public void testSomeMethod()
    {
        {
            int[][] exp = {{2}};
            int[][] dst = new int[1][1];
            int[][] src = {{1}};
            Matrix.add(dst,src,src);
            assertArrayEquals(exp,dst);
        }
        {
            int[][] exp = {{2,4},{6,8}};
            int[][] dst = new int[2][2];
            int[][] src = {{1,2},{3,4}};
            Matrix.add(dst,src,src);
            assertArrayEquals(exp,dst);
        }
        {
            int[][] exp = {{2,4},{6,8},{10,12}};
            int[][] dst = new int[3][2];
            int[][] src = {{1,2},{3,4},{5,6}};
            Matrix.add(dst,src,src);
            assertArrayEquals(exp,dst);
        }
        {
            int[][] exp = {{2,4,6},{8,10,12}};
            int[][] dst = new int[2][3];
            int[][] src = {{1,2,3},{4,5,6}};
            Matrix.add(dst,src,src);
            assertArrayEquals(exp,dst);
        }
    }
    @Test
    public void testSomeMethod2()
    {
        try
        {
            
            int[][] dst = new int[2][2];
            int[][] src = {{1}};
            Matrix.add(dst,src,src);
            fail("must detect dimension discrepance");
        }
        catch(Matrix.DimensionException ex){
            
        }
        
    }
    @Test
    public void testSomeMethodLong()
    {
        {
            long[][] exp = {{2}};
            long[][] dst = new long[1][1];
            long[][] src = {{1}};
            Matrix.add(dst,src,src);
            assertArrayEquals(exp,dst);
        }
        {
            long[][] exp = {{2,4},{6,8}};
            long[][] dst = new long[2][2];
            long[][] src = {{1,2},{3,4}};
            Matrix.add(dst,src,src);
            assertArrayEquals(exp,dst);
        }
        {
            long[][] exp = {{2,4},{6,8},{10,12}};
            long[][] dst = new long[3][2];
            long[][] src = {{1,2},{3,4},{5,6}};
            Matrix.add(dst,src,src);
            assertArrayEquals(exp,dst);
        }
        {
            long[][] exp = {{2,4,6},{8,10,12}};
            long[][] dst = new long[2][3];
            long[][] src = {{1,2,3},{4,5,6}};
            Matrix.add(dst,src,src);
            assertArrayEquals(exp,dst);
        }
    }
    @Test
    public void testSomeMethodFloat()
    {
        {
            float[][] exp = {{2}};
            float[][] dst = new float[1][1];
            float[][] src = {{1}};
            Matrix.add(dst,src,src);
            assertArrayEquals(exp,dst);
        }
        {
            float[][] exp = {{2,4},{6,8}};
            float[][] dst = new float[2][2];
            float[][] src = {{1,2},{3,4}};
            Matrix.add(dst,src,src);
            assertArrayEquals(exp,dst);
        }
        {
            float[][] exp = {{2,4},{6,8},{10,12}};
            float[][] dst = new float[3][2];
            float[][] src = {{1,2},{3,4},{5,6}};
            Matrix.add(dst,src,src);
            assertArrayEquals(exp,dst);
        }
        {
            float[][] exp = {{2,4,6},{8,10,12}};
            float[][] dst = new float[2][3];
            float[][] src = {{1,2,3},{4,5,6}};
            Matrix.add(dst,src,src);
            assertArrayEquals(exp,dst);
        }
    }
    @Test
    public void testSomeMethodDouble()
    {
        {
            double[][] exp = {{2}};
            double[][] dst = new double[1][1];
            double[][] src = {{1}};
            Matrix.add(dst,src,src);
            assertArrayEquals(exp,dst);
        }
        {
            double[][] exp = {{2,4},{6,8}};
            double[][] dst = new double[2][2];
            double[][] src = {{1,2},{3,4}};
            Matrix.add(dst,src,src);
            assertArrayEquals(exp,dst);
        }
        {
            double[][] exp = {{2,4},{6,8},{10,12}};
            double[][] dst = new double[3][2];
            double[][] src = {{1,2},{3,4},{5,6}};
            Matrix.add(dst,src,src);
            assertArrayEquals(exp,dst);
        }
        {
            double[][] exp = {{2,4,6},{8,10,12}};
            double[][] dst = new double[2][3];
            double[][] src = {{1,2,3},{4,5,6}};
            Matrix.add(dst,src,src);
            assertArrayEquals(exp,dst);
        }
    }
    @Test
    public void testSomeMethodBigInteger()
    {
        {
            BigInteger[][] exp = {{BigInteger.valueOf(2)}};
            BigInteger[][] dst = Matrix.create(1,1,BigInteger.ZERO);
            BigInteger[][] src = {{BigInteger.valueOf(1)}};
            Matrix.add(dst,src,src);
            assertArrayEquals(exp,dst);
        }
        {
            BigInteger[][] exp = {{BigInteger.valueOf(2),BigInteger.valueOf(4)},{BigInteger.valueOf(6),BigInteger.valueOf(8)}};
            BigInteger[][] dst = Matrix.create(2,2,BigInteger.ZERO);
            BigInteger[][] src = {{BigInteger.valueOf(1),BigInteger.valueOf(2)},{BigInteger.valueOf(3),BigInteger.valueOf(4)}};
            Matrix.add(dst,src,src);
            assertArrayEquals(exp,dst);
        }
        {
            BigInteger[][] exp = {{BigInteger.valueOf(2),BigInteger.valueOf(4)},{BigInteger.valueOf(6),BigInteger.valueOf(8)},{BigInteger.valueOf(10),BigInteger.valueOf(12)}};
            BigInteger[][] dst = Matrix.create(3,2,BigInteger.ZERO);
            BigInteger[][] src = {{BigInteger.valueOf(1),BigInteger.valueOf(2)},{BigInteger.valueOf(3),BigInteger.valueOf(4)},{BigInteger.valueOf(5),BigInteger.valueOf(6)}};
            Matrix.add(dst,src,src);
            assertArrayEquals(exp,dst);
        }
        {
            BigInteger[][] exp = {{BigInteger.valueOf(2),BigInteger.valueOf(4),BigInteger.valueOf(6)},{BigInteger.valueOf(8),BigInteger.valueOf(10),BigInteger.valueOf(12)}};
            BigInteger[][] dst = Matrix.create(2,3,BigInteger.ZERO);
            BigInteger[][] src = {{BigInteger.valueOf(1),BigInteger.valueOf(2),BigInteger.valueOf(3)},{BigInteger.valueOf(4),BigInteger.valueOf(5),BigInteger.valueOf(6)}};
            Matrix.add(dst,src,src);
            assertArrayEquals(exp,dst);
        }
    }
    @Test
    public void testSomeMethodBigDecimal()
    {
        {
            BigDecimal[][] exp = {{BigDecimal.valueOf(2)}};
            BigDecimal[][] dst = Matrix.create(1,1,BigDecimal.ZERO);
            BigDecimal[][] src = {{BigDecimal.valueOf(1)}};
            Matrix.add(dst,src,src);
            assertArrayEquals(exp,dst);
        }
        {
            BigDecimal[][] exp = {{BigDecimal.valueOf(2),BigDecimal.valueOf(4)},{BigDecimal.valueOf(6),BigDecimal.valueOf(8)}};
            BigDecimal[][] dst = Matrix.create(2,2,BigDecimal.ZERO);
            BigDecimal[][] src = {{BigDecimal.valueOf(1),BigDecimal.valueOf(2)},{BigDecimal.valueOf(3),BigDecimal.valueOf(4)}};
            Matrix.add(dst,src,src);
            assertArrayEquals(exp,dst);
        }
        {
            BigDecimal[][] exp = {{BigDecimal.valueOf(2),BigDecimal.valueOf(4)},{BigDecimal.valueOf(6),BigDecimal.valueOf(8)},{BigDecimal.valueOf(10),BigDecimal.valueOf(12)}};
            BigDecimal[][] dst = Matrix.create(3,2,BigDecimal.ZERO);
            BigDecimal[][] src = {{BigDecimal.valueOf(1),BigDecimal.valueOf(2)},{BigDecimal.valueOf(3),BigDecimal.valueOf(4)},{BigDecimal.valueOf(5),BigDecimal.valueOf(6)}};
            Matrix.add(dst,src,src);
            assertArrayEquals(exp,dst);
        }
        {
            BigDecimal[][] exp = {{BigDecimal.valueOf(2),BigDecimal.valueOf(4),BigDecimal.valueOf(6)},{BigDecimal.valueOf(8),BigDecimal.valueOf(10),BigDecimal.valueOf(12)}};
            BigDecimal[][] dst = Matrix.create(2,3,BigDecimal.ZERO);
            BigDecimal[][] src = {{BigDecimal.valueOf(1),BigDecimal.valueOf(2),BigDecimal.valueOf(3)},{BigDecimal.valueOf(4),BigDecimal.valueOf(5),BigDecimal.valueOf(6)}};
            Matrix.add(dst,src,src);
            assertArrayEquals(exp,dst);
        }
    }
}
