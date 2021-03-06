
@file:Suppress("unused", "FunctionName", "ClassName")
package com.rndash.mbheadunit.nativeCan.canB
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for EZS_A2 (ID 0x0002)
**/

object EZS_A2 {

    /** 
     *  Returns the most recent Can Frame representing the state
     *  of EZS_A2
    **/
    fun get_frame() : CanFrame? = CanBusNative.getBFrame(CanBAddrs.EZS_A2)

	/** Gets Pulse ring counter, front left wheel (48 per revolution)  **/
	fun get_riz_vl() : Int = CanBusNative.getECUParameterB(CanBAddrs.EZS_A2, 0, 8)
	
	/** Sets Pulse ring counter, front left wheel (48 per revolution)  **/
	fun set_riz_vl(f: CanFrame, p: Int) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 0, 8, p)
	}
	
	/** Gets Pulse ring counter, front right wheel (48 per revolution)  **/
	fun get_riz_vr() : Int = CanBusNative.getECUParameterB(CanBAddrs.EZS_A2, 8, 8)
	
	/** Sets Pulse ring counter, front right wheel (48 per revolution)  **/
	fun set_riz_vr(f: CanFrame, p: Int) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 8, 8, p)
	}
	
	/** Gets Motor speed  **/
	fun get_n_mot() : Int = CanBusNative.getECUParameterB(CanBAddrs.EZS_A2, 16, 16)
	
	/** Sets Motor speed  **/
	fun set_n_mot(f: CanFrame, p: Int) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 16, 16, p)
	}
	
	/** Gets engine coolant temperature  **/
	fun get_t_mot() : Int = CanBusNative.getECUParameterB(CanBAddrs.EZS_A2, 32, 8)
	
	/** Sets engine coolant temperature  **/
	fun set_t_mot(f: CanFrame, p: Int) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 32, 8, p)
	}
	
	/**
     * Auto generated function
     * Throws exception if user tries to set a value in a frame
     * Not designated from the correct ECU
    **/
    private fun checkFrame(f: CanFrame) {
        if (f.canID != CanBAddrs.EZS_A2.addr) {
            throw IllegalArgumentException("CAN ID does not match object!")
        }
    }

	override fun toString() = """
		|Frame EZS_A2 (0x0002):
		|	Pulse ring counter, front left wheel (48 per revolution) : ${get_riz_vl()} Pulse
		|	Pulse ring counter, front right wheel (48 per revolution) : ${get_riz_vr()} Pulse
		|	Motor speed : ${get_n_mot()} 1 / min
		|	engine coolant temperature : ${get_t_mot()} ° C
	""".trimMargin("|")
}
