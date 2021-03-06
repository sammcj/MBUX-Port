
@file:Suppress("unused", "FunctionName", "ClassName")
package com.rndash.mbheadunit.nativeCan.canC
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for MS_APPL2 (ID 0x04A9)
**/

object MS_APPL2 {

    /** 
     *  Returns the most recent Can Frame representing the state
     *  of MS_APPL2
    **/
    fun get_frame() : CanFrame? = CanBusNative.getCFrame(CanCAddrs.MS_APPL2)

	/** Gets application **/
	fun get_appl2() : Int = CanBusNative.getECUParameterC(CanCAddrs.MS_APPL2, 0, 64)
	
	/** Sets application **/
	fun set_appl2(f: CanFrame, p: Int) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 0, 64, p)
	}
	
	/**
     * Auto generated function
     * Throws exception if user tries to set a value in a frame
     * Not designated from the correct ECU
    **/
    private fun checkFrame(f: CanFrame) {
        if (f.canID != CanCAddrs.MS_APPL2.addr) {
            throw IllegalArgumentException("CAN ID does not match object!")
        }
    }

	override fun toString() = """
		|Frame MS_APPL2 (0x04A9):
		|	application: ${get_appl2()}
	""".trimMargin("|")
}
