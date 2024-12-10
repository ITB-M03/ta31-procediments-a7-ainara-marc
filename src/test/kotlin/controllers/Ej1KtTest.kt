package controllers

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
 class Ej1KtTest {

 @Test
  fun quiEsIntegrantDAquestGrup1() {
   val expect = "Lluis"
   assertEquals(expect, quiEsIntegrantDAquestGrup(1))
  }
  @Test
  fun quiEsIntegrantDAquestGrup2() {
   val expect = "Marta"
   assertEquals(expect, quiEsIntegrantDAquestGrup(2))
  }
  @Test
  fun quiEsIntegrantDAquestGrup3() {
   val expect = ""
   assertEquals(expect, quiEsIntegrantDAquestGrup(0))
  }
}