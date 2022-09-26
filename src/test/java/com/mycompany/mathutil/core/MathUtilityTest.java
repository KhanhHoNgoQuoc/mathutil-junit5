/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.mathutil.core;

import com.mycompany.mathutil.core2.MathUtil;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author Admin
 */
public class MathUtilityTest {
 //import static là dành cho nhung~ ham static, goi ham` mà bo~ qua ten class  
//    @Test
//    public void testGetFactorialReturnWell(){
//        assertEquals(24, MathUtil.getFactorial(4));
//    }
    public static Object [][] initData(){
        return new Integer[][]{
                {1,1},
                {2,2},
                {5,120},
                {6,720},
                
        };
    }
    @ParameterizedTest
    @MethodSource(value="initData") //tên hàm cung câp' Data, ngâm` dinh thu' tu cua mang ,map vao tham so ham
    public void testGetFactorialReturnWell(int input,long expected){
        assertEquals(expected,MathUtil.getFactorial(input));
    }
    public void testGetFactorialGivenWrongArgThrowException(){
        //hàm nhận tham số thứ 2 là 1 cái obj, có code implement 
//functional interface tên là Excutable -có 1 hàm duy nhất ko code
//tên là execute()
//chơi chậm
//        Executable exObject =new Executable() {
//            @Override
//            public void execute() throws Throwable {
//                MathUtil.getFactorial(-5);
//            }
//        };
        Executable exObject= ()->MathUtil.getFactorial(-5);
        assertThrows(IllegalArgumentException.class,() -> MathUtil.getFactorial(-5) );
    }
}
