package controllers

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import kotlin.test.expect

class Ej2KtTest {

 @Test
  fun roman1() {
   val expext = "CCCXCIX"
   assertEquals(expext, roman(399))
 }
 @Test
 fun roman2(){
  val expect = "MMCXLVII"
  assertEquals(expect, roman(2147))
 }
 @Test
 fun roman3(){
  val expect = "MMMCMXCIX"
  assertEquals(expect, roman(3999))
 }
}