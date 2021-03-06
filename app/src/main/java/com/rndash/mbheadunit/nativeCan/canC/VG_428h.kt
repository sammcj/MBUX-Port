
@file:Suppress("unused", "FunctionName", "ClassName")
package com.rndash.mbheadunit.nativeCan.canC
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for VG_428h (ID 0x0428)
**/

object VG_428h {

    /** 
     *  Returns the most recent Can Frame representing the state
     *  of VG_428h
    **/
    fun get_frame() : CanFrame? = CanBusNative.getCFrame(CanCAddrs.VG_428h)

	/** Gets Current gear transfer case **/
	fun get_vg_gang() : VG_GANG = when(CanBusNative.getECUParameterC(CanCAddrs.VG_428h, 5, 3)) {
		 0 -> VG_GANG.SH_IPG
		 1 -> VG_GANG.LO
		 2 -> VG_GANG.HI
		 4 -> VG_GANG.N
		 7 -> VG_GANG.SNV
		 else -> throw Exception("Invalid raw value for VG_GANG")
	}
	
	/** Sets Current gear transfer case **/
	fun set_vg_gang(f: CanFrame, p: VG_GANG) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 5, 3, p.raw)
	}
	
	/** Gets VG error (ECU failure detected) **/
	fun get_vg_err() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.VG_428h, 2, 1) != 0
	
	/** Sets VG error (ECU failure detected) **/
	fun set_vg_err(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 2, 1, if(p) 1 else 0)
	}
	
	/** Gets VG **/
	fun get_anfn_vg() : ANFN_VG = when(CanBusNative.getECUParameterC(CanCAddrs.VG_428h, 14, 2)) {
		 0 -> ANFN_VG.NOT_DEFINED
		 1 -> ANFN_VG.ANF_N
		 2 -> ANFN_VG.IDLE
		 3 -> ANFN_VG.SNV
		 else -> throw Exception("Invalid raw value for ANFN_VG")
	}
	
	/** Sets VG **/
	fun set_anfn_vg(f: CanFrame, p: ANFN_VG) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 14, 2, p.raw)
	}
	
	/** Gets VG **/
	fun get_anfntgl_vg() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.VG_428h, 13, 1) != 0
	
	/** Sets VG **/
	fun set_anfntgl_vg(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 13, 1, if(p) 1 else 0)
	}
	
	/** Gets VG **/
	fun get_anfnpar_vg() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.VG_428h, 12, 1) != 0
	
	/** Sets VG **/
	fun set_anfnpar_vg(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 12, 1, if(p) 1 else 0)
	}
	
	/**
     * Auto generated function
     * Throws exception if user tries to set a value in a frame
     * Not designated from the correct ECU
    **/
    private fun checkFrame(f: CanFrame) {
        if (f.canID != CanCAddrs.VG_428h.addr) {
            throw IllegalArgumentException("CAN ID does not match object!")
        }
    }

	override fun toString() = """
		|Frame VG_428h (0x0428):
		|	Current gear transfer case: ${get_vg_gang()}
		|	VG error (ECU failure detected): ${get_vg_err()}
		|	VG: ${get_anfn_vg()}
		|	VG: ${get_anfntgl_vg()}
		|	VG: ${get_anfnpar_vg()}
	""".trimMargin("|")
}
