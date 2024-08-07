/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package io.francitoshi.tinjar.matrix;

import static com.google.common.io.Files.map;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
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
    public void testGetRows()
    {
        IntMatrix a = new IntMatrix(3,3);
        IntMatrix b = new IntMatrix(3,3);
        HashSet<IntMatrix> set = new HashSet<>();
        set.add(a);
        set.add(b);
    }

    
    
}
