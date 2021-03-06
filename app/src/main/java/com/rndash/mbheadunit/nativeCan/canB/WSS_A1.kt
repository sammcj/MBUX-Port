
@file:Suppress("unused", "FunctionName", "ClassName")
package com.rndash.mbheadunit.nativeCan.canB
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for WSS_A1 (ID 0x02A4)
**/

object WSS_A1 {

    /** 
     *  Returns the most recent Can Frame representing the state
     *  of WSS_A1
    **/
    fun get_frame() : CanFrame? = CanBusNative.getBFrame(CanBAddrs.WSS_A1)

	/** Gets Weight classification passenger **/
	fun get_wss_psg() : WSS_PSG = when(CanBusNative.getECUParameterB(CanBAddrs.WSS_A1, 5, 3)) {
		 0 -> WSS_PSG.CLASS0
		 1 -> WSS_PSG.CLASS1
		 2 -> WSS_PSG.CLASS2
		 3 -> WSS_PSG.CLASS3
		 4 -> WSS_PSG.CLASS4
		 7 -> WSS_PSG.SNA
		 else -> throw Exception("Invalid raw value for WSS_PSG")
	}
	
	/** Sets Weight classification passenger **/
	fun set_wss_psg(f: CanFrame, p: WSS_PSG) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 5, 3, p.raw)
	}
	
	/** Gets Weight classification passenger fault **/
	fun get_wss_psg_fault() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.WSS_A1, 4, 1) != 0
	
	/** Sets Weight classification passenger fault **/
	fun set_wss_psg_fault(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 4, 1, if(p) 1 else 0)
	}
	
	/** Gets Passenger Detection Fast **/
	fun get_psg_detect_fast() : PSG_DETECT_FAST = when(CanBusNative.getECUParameterB(CanBAddrs.WSS_A1, 2, 2)) {
		 0 -> PSG_DETECT_FAST.OP_PRESENT
		 1 -> PSG_DETECT_FAST.OP_ABSENT
		 2 -> PSG_DETECT_FAST.OP_FAIL
		 3 -> PSG_DETECT_FAST.SNA
		 else -> throw Exception("Invalid raw value for PSG_DETECT_FAST")
	}
	
	/** Sets Passenger Detection Fast **/
	fun set_psg_detect_fast(f: CanFrame, p: PSG_DETECT_FAST) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 2, 2, p.raw)
	}
	
	/** Gets WSS Identification **/
	fun get_wss_id() : WSS_ID = when(CanBusNative.getECUParameterB(CanBAddrs.WSS_A1, 16, 8)) {
		 16 -> WSS_ID.TEXAS_INSTRUMENTS_START
		 32 -> WSS_ID.BIZERBA_START
		 64 -> WSS_ID.BLADDER_START
		 96 -> WSS_ID.PANASONIC_START
		 255 -> WSS_ID.SNA
		 else -> throw Exception("Invalid raw value for WSS_ID")
	}
	
	/** Sets WSS Identification **/
	fun set_wss_id(f: CanFrame, p: WSS_ID) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 16, 8, p.raw)
	}
	
	/** Gets WSS display in the combi **/
	fun get_wss_anz() : WSS_ANZ = when(CanBusNative.getECUParameterB(CanBAddrs.WSS_A1, 30, 2)) {
		 0 -> WSS_ANZ.NO_MSG
		 1 -> WSS_ANZ.GW_SMALL
		 2 -> WSS_ANZ.AB_AUS
		 3 -> WSS_ANZ.AB_EIN
		 else -> throw Exception("Invalid raw value for WSS_ANZ")
	}
	
	/** Sets WSS display in the combi **/
	fun set_wss_anz(f: CanFrame, p: WSS_ANZ) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 30, 2, p.raw)
	}
	
	/**
     * Auto generated function
     * Throws exception if user tries to set a value in a frame
     * Not designated from the correct ECU
    **/
    private fun checkFrame(f: CanFrame) {
        if (f.canID != CanBAddrs.WSS_A1.addr) {
            throw IllegalArgumentException("CAN ID does not match object!")
        }
    }

	override fun toString() = """
		|Frame WSS_A1 (0x02A4):
		|	Weight classification passenger: ${get_wss_psg()}
		|	Weight classification passenger fault: ${get_wss_psg_fault()}
		|	Passenger Detection Fast: ${get_psg_detect_fast()}
		|	WSS Identification: ${get_wss_id()}
		|	WSS display in the combi: ${get_wss_anz()}
	""".trimMargin("|")
}
