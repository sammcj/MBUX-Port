
@file:Suppress("unused", "FunctionName", "ClassName")
package com.rndash.mbheadunit.nativeCan.canC
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for LWR_530h (ID 0x0530)
**/

object LWR_530h {

    /** 
     *  Returns the most recent Can Frame representing the state
     *  of LWR_530h
    **/
    fun get_frame() : CanFrame? = CanBusNative.getCFrame(CanCAddrs.LWR_530h)

	/** Gets Display message 1: "Cornering light defect! Drive to the workshop" **/
	fun get_lwr_m1() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.LWR_530h, 7, 1) != 0
	
	/** Sets Display message 1: "Cornering light defect! Drive to the workshop" **/
	fun set_lwr_m1(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 7, 1, if(p) 1 else 0)
	}
	
	/** Gets Display message 2: "Cornering light, replacement light activated!" (White) **/
	fun get_lwr_m2() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.LWR_530h, 6, 1) != 0
	
	/** Sets Display message 2: "Cornering light, replacement light activated!" (White) **/
	fun set_lwr_m2(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 6, 1, if(p) 1 else 0)
	}
	
	/** Gets Display message 3: "Cornering light currently not available" (white). **/
	fun get_lwr_m3() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.LWR_530h, 5, 1) != 0
	
	/** Sets Display message 3: "Cornering light currently not available" (white). **/
	fun set_lwr_m3(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 5, 1, if(p) 1 else 0)
	}
	
	/** Gets Display message 4: "Cornering light currently not available" (white / 5x flashing at 1Hz) **/
	fun get_lwr_m4() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.LWR_530h, 4, 1) != 0
	
	/** Sets Display message 4: "Cornering light currently not available" (white / 5x flashing at 1Hz) **/
	fun set_lwr_m4(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 4, 1, if(p) 1 else 0)
	}
	
	/** Gets Display message 5: "Left cornering light" **/
	fun get_lwr_m5() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.LWR_530h, 3, 1) != 0
	
	/** Sets Display message 5: "Left cornering light" **/
	fun set_lwr_m5(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 3, 1, if(p) 1 else 0)
	}
	
	/** Gets Display message 6: "Right cornering light" **/
	fun get_lwr_m6() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.LWR_530h, 2, 1) != 0
	
	/** Sets Display message 6: "Right cornering light" **/
	fun set_lwr_m6(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 2, 1, if(p) 1 else 0)
	}
	
	/** Gets Display message 7: "Cornering light currently not available" **/
	fun get_lwr_m7() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.LWR_530h, 1, 1) != 0
	
	/** Sets Display message 7: "Cornering light currently not available" **/
	fun set_lwr_m7(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 1, 1, if(p) 1 else 0)
	}
	
	/** Gets Substitution of right low beam **/
	fun get_sub_abl_r() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.LWR_530h, 9, 1) != 0
	
	/** Sets Substitution of right low beam **/
	fun set_sub_abl_r(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 9, 1, if(p) 1 else 0)
	}
	
	/** Gets Substitution of left low beam **/
	fun get_sub_abl_l() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.LWR_530h, 8, 1) != 0
	
	/** Sets Substitution of left low beam **/
	fun set_sub_abl_l(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 8, 1, if(p) 1 else 0)
	}
	
	/**
     * Auto generated function
     * Throws exception if user tries to set a value in a frame
     * Not designated from the correct ECU
    **/
    private fun checkFrame(f: CanFrame) {
        if (f.canID != CanCAddrs.LWR_530h.addr) {
            throw IllegalArgumentException("CAN ID does not match object!")
        }
    }

	override fun toString() = """
		|Frame LWR_530h (0x0530):
		|	Display message 1: "Cornering light defect! Drive to the workshop": ${get_lwr_m1()}
		|	Display message 2: "Cornering light, replacement light activated!" (White): ${get_lwr_m2()}
		|	Display message 3: "Cornering light currently not available" (white).: ${get_lwr_m3()}
		|	Display message 4: "Cornering light currently not available" (white / 5x flashing at 1Hz): ${get_lwr_m4()}
		|	Display message 5: "Left cornering light": ${get_lwr_m5()}
		|	Display message 6: "Right cornering light": ${get_lwr_m6()}
		|	Display message 7: "Cornering light currently not available": ${get_lwr_m7()}
		|	Substitution of right low beam: ${get_sub_abl_r()}
		|	Substitution of left low beam: ${get_sub_abl_l()}
	""".trimMargin("|")
}
