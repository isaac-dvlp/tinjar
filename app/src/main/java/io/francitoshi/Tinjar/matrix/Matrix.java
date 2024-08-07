/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.francitoshi.tinjar.matrix;

/**
 *
 * @author isaac_dugo
 */
public abstract class Matrix
{
    protected final int rows;
    protected final int columns;

    public Matrix(int rows, int columns)
    {
        this.rows = rows;
        this.columns = columns;
    }

    public int getRows()
    {
        return rows;
    }

    public int getColumns()
    {
        return columns;
    }
    public abstract void clear();
    public boolean isSquare(){
        return this.rows == this.columns;
    }
    public abstract boolean isIdentity();
    
}
