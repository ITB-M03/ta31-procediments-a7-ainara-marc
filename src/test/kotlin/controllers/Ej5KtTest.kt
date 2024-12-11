package controllers

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
 class Ej5KtTest {

@Test
 fun crearPila() {
  val expect = IntArray(11){0}
  assertEquals(expect.size, crearPila(10).size )
 }

@Test
 fun push() {
  val expect: IntArray = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10)
  val pila = crearPila(10)
  repeat(10){
   push(it+1, pila)
  }
 assertArrayEquals(expect, pila)
 }

@Test
 fun pop() {
 val expect: IntArray = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5)
 val pila = crearPila(10)
 repeat(10){
  push(it+1, pila)
 }
 repeat(5){
  pop(pila)
 }
 assertArrayEquals(expect, pila)
 }
}