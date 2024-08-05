/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package io.francitoshi.tinjar;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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
    
    
}
