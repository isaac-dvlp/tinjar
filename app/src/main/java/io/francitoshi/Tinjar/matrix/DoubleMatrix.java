/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.francitoshi.tinjar.matrix;

/**
 *
 * @author isaac_dugo
 */
public class DoubleMatrix extends Matrix
{

    private final double[][] values;

    public DoubleMatrix(int rows, int columns)
    {
        super(rows,columns);
        this.values = new double[rows][columns];
    }

    public DoubleMatrix(int rows, int columns, double value)
    {
        this(rows,columns);
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                values[i][j]=value;
            }
        }
    }
    public DoubleMatrix(int rows, int columns, double[][] val){
        this(rows,columns);
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                this.values[i][j]=val[i][j];
            }
        }
    }

    @Override
    public void clear()
    {
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                this.values[i][j]=0;
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

    
}
