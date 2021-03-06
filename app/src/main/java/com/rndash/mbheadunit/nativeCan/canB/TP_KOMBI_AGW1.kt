
@file:Suppress("unused", "FunctionName", "ClassName")
package com.rndash.mbheadunit.nativeCan.canB
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for TP_KOMBI_AGW1 (ID 0x01D0)
**/

object TP_KOMBI_AGW1 {

    /** 
     *  Returns the most recent Can Frame representing the state
     *  of TP_KOMBI_AGW1
    **/
    fun get_frame() : CanFrame? = CanBusNative.getBFrame(CanBAddrs.TP_KOMBI_AGW1)

	/** Gets COMBI communication to the AGW **/
	fun get_tp_kombi_agw() : Int = CanBusNative.getECUParameterB(CanBAddrs.TP_KOMBI_AGW1, 0, 64)
	
	/** Sets COMBI communication to the AGW **/
	fun set_tp_kombi_agw(f: CanFrame, p: Int) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 0, 64, p)
	}
	
	/**
     * Auto generated function
     * Throws exception if user tries to set a value in a frame
     * Not designated from the correct ECU
    **/
    private fun checkFrame(f: CanFrame) {
        if (f.canID != CanBAddrs.TP_KOMBI_AGW1.addr) {
            throw IllegalArgumentException("CAN ID does not match object!")
        }
    }

	override fun toString() = """
		|Frame TP_KOMBI_AGW1 (0x01D0):
		|	COMBI communication to the AGW: ${get_tp_kombi_agw()}
	""".trimMargin("|")
}
