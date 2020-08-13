package com.rndash.mbheadunit.nativeCan.canB


import com.rndash.mbheadunit.nativeCan.CanBAddrs
import com.rndash.mbheadunit.nativeCan.CanBusNative



/**
 *    GENERATED BY parse_kt.py
 *    Decoder class for ECU Frame DBE_A4 (ID: 0x0174)
**/
object DBE_A4 {

	/** Schiebehebedach zu bei Regen **/
	fun get_shd_zu_rs() : Boolean = getParam(0, 1) != 0

	override fun toString(): String {
		return """
			SHD_ZU_RS: ${get_shd_zu_rs()}
		""".trimIndent()
	}


	private fun getParam(o: Int, l: Int) : Int = CanBusNative.getECUParameterB(CanBAddrs.DBE_A4, o, l)
}