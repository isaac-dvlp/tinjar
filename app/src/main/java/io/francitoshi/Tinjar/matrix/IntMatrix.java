/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.francitoshi.tinjar.matrix;

import java.util.Arrays;

/**
         *
         * @author isaac_dugo
         */


public class IntMatrix extends Matrix
{

    private final int[][] values;

    public IntMatrix(int rows, int columns)
    {
        super(rows, columns);
        this.values = new int[rows][columns];
    }

    public IntMatrix(int rows, int columns, int value)
    {
        this(rows, columns);
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                values[i][j] = value;
            }
        }
    }

    public IntMatrix(int rows, int columns, int[][] val)
    {
        this(rows, columns);
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                this.values[i][j] = val[i][j];
            }
        }
    }

    @Override
    public void clear()
    {
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                this.values[i][j] = 0;
            }
        }
    }

    @Override
    public boolean isIdentity()
    {
        int rc = Math.min(rows, columns);
        for (int i = 0; i < rc; i++)
        {
            if (this.values[i][i] != 1)
            {
                return false;
            }
        }
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                if (i != j && this.values[i][j] != 0)
                {
                    return false;
                }

            }
        }
        return true;
    }

    @Override
    public int hashCode()
    {
        int hash = 7;
        hash = 83 * hash + Arrays.deepHashCode(this.values);
        return hash;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        final IntMatrix other = (IntMatrix) obj;
        return Arrays.deepEquals(this.values, other.values);
    }

    
    
}
